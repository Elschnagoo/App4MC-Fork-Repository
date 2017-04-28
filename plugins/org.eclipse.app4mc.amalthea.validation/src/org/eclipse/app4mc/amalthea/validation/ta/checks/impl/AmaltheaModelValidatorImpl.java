package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BetaDistribution;
import org.eclipse.app4mc.amalthea.model.Boundaries;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.UniformDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class AmaltheaModelValidatorImpl extends AbstractValidatorImpl {

	public AmaltheaModelValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public AmaltheaModelValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	private double getSecondsFromTimeUnit(final Time time) {
		double value = 0;
		if (null != time) {
			value = time.getValue();
			if (time.getUnit().getLiteral().equalsIgnoreCase(TimeUnit.PS.getLiteral())) {
				value *= Math.pow(10, -12);
			} else if (time.getUnit().getLiteral().equalsIgnoreCase(TimeUnit.NS.getLiteral())) {
				value *= Math.pow(10, -9);
			} else if (time.getUnit().getLiteral().equalsIgnoreCase(TimeUnit.US.getLiteral())) {
				value *= Math.pow(10, -6);
			} else if (time.getUnit().getLiteral().equalsIgnoreCase(TimeUnit.MS.getLiteral())) {
				value *= Math.pow(10, -3);
			} else if (time.getUnit().getLiteral().equalsIgnoreCase(TimeUnit.S.getLiteral())) {
				value *= Math.pow(10, 0);
			}
		}
		return value;
	}

	/*
	 * Checks if all referable objects have a unique name. If this is not the case, it will be handled as an error.
	 */
	public void checkUniqueName(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Map<String, IReferable> names = new HashMap<>();
		final Set<IReferable> ambiguousObjects = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof IReferable) {
				final IReferable referable = (IReferable) elem;
				final String name = referable.getUniqueName();
				if (true == names.containsKey(name)) {
					ambiguousObjects.add(referable);
					ambiguousObjects.add(names.get(name));
				} else {
					names.put(name, referable);
				}
			}
		}

		for (final IReferable object : ambiguousObjects) {
			this.issueCreator.issue(object, AmaltheaPackage.eINSTANCE.getIReferable_UniqueName(), object.getUniqueName());
		}
	}

	/*
	 * Checks the parameters of {@link Deviation}.
	 * The parameter distribution must be set and the parameter lowerBound must be lower than or equal to upperBound.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkDeviation(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Deviation<?>) {
				final Deviation<?> deviation = (Deviation<?>) elem;
				final Distribution<?> distribution = deviation.getDistribution();
				if (null == distribution) {
					this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_Distribution());
				} else {
					if ((false == ((distribution instanceof UniformDistribution<?>) || (distribution instanceof GaussDistribution<?>)
							|| (distribution instanceof WeibullDistribution<?>) || (distribution instanceof Boundaries<?>)))) {
						this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_Distribution());
					}
				}
				final Object object1 = deviation.getLowerBound();
				final Object object2 = deviation.getUpperBound();
				if (((null == object1) && (null != object2)) || ((null == object2) && (null != object1))) {
					// if only one boundary is set
					if (null == object1) {
						this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_LowerBound());
					}
					if (null == object2) {
						this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());
					}
				} else if ((null != object1) && (null != object2)) {
					if (object1.getClass() != object2.getClass()) {
						// if one boundary uses time, the other not
						this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());
					} else {
						if (object1 instanceof LongObject) {
							final LongObject lowerBound = (LongObject) object1;
							final LongObject upperBound = (LongObject) object2;
							if (lowerBound.getValue() > upperBound.getValue()) {
								this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());
							}
						} else if (object1 instanceof Time) {
							final Time lowerBound = (Time) object1;
							final Time upperBound = (Time) object2;
							final double lowerValue = getSecondsFromTimeUnit(lowerBound);
							final double upperValue = getSecondsFromTimeUnit(upperBound);
							if (lowerValue > upperValue) {
								this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());
							}
						}
					}
				}
			}
		}
	}

	/*
	 * Checks the parameters of {@link UniformDistribution}.
	 * The parameters lowerBound and upperBpound of Deviation must be set.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkUniformDistribution(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Deviation<?>) {
				final Deviation<?> deviation = (Deviation<?>) elem;
				final Distribution<?> distribution = deviation.getDistribution();
				if (null != distribution) {
					if (distribution instanceof UniformDistribution<?>) {
						final Object object1 = deviation.getLowerBound();
						final Object object2 = deviation.getUpperBound();
						if ((null == object1) && (null == object2)) {
							this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_LowerBound());
							this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());
						}
					}
				}
			}
		}
	}
	
	/*
	 * Checks the parameters of {@link BetaDistribution}.
	 * The parameters alpha and beta of BetaDeviation must be set and both must be larger than zero.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkBetaDistribution(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Deviation<?>) {
				final Deviation<?> deviation = (Deviation<?>) elem;
				final Distribution<?> distribution = deviation.getDistribution();
				if (null != distribution) {
					if (distribution instanceof BetaDistribution<?>) {
						double alpha = ((BetaDistribution<?>) distribution).getAlpha();
						if(false == (0 < alpha)) {
							this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getBetaDistribution_Alpha());
						}
						double beta = ((BetaDistribution<?>) distribution).getBeta();
						if(false == (0 < beta)) {
							this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getBetaDistribution_Beta());
						}		
					}
				}
			}
		}
	}

	/*
	 * Checks the parameters of {@link GaussDistribution}.
	 * The parameters mean and sd must be set and parameter mean must be larger than lowerBound of deviation
	 * and smaller than upperBound of deviation.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkGaussDistribution(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Deviation<?>) {
				final Deviation<?> deviation = (Deviation<?>) elem;
				final Distribution<?> distribution = deviation.getDistribution();
				if ((null != distribution) && (distribution instanceof GaussDistribution<?>)) {
					final GaussDistribution<?> gauss = (GaussDistribution<?>) distribution;
					final Object mean = gauss.getMean();
					final Object sd = gauss.getSd();
					if ((null == mean) || (null == sd)) {
						if (null == mean) {
							this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
						}
						if (null == sd) {
							this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd());
						}
					} else {
						if (false == mean.getClass().equals(sd.getClass())) {
							this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd());
						}
						final Object lowerBound = deviation.getLowerBound();
						final Object upperBound = deviation.getUpperBound();
						if (mean instanceof Time) {
							final Time meanTime = (Time) mean;
							final double meanValue = getSecondsFromTimeUnit(meanTime);
							if (false == (lowerBound instanceof Time)) {
								this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
							} else {
								final Time lowerTime = (Time) lowerBound;
								final double lowerValue = getSecondsFromTimeUnit(lowerTime);
								if (meanValue < lowerValue) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
								}
							}
							if (false == (upperBound instanceof Time)) {
								this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
							} else {
								final Time upperTime = (Time) upperBound;
								final double upperValue = getSecondsFromTimeUnit(upperTime);
								if (meanValue > upperValue) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
								}
							}
						} else if (mean instanceof LongObject) {
							final LongObject meanLong = (LongObject) mean;
							final long meanValue = meanLong.getValue();
							if (false == (lowerBound instanceof LongObject)) {
								this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
							} else {
								final LongObject lowerLong = (LongObject) lowerBound;
								final long lowerValue = lowerLong.getValue();
								if (meanValue < lowerValue) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
								}
							}
							if (false == (upperBound instanceof LongObject)) {
								this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
							} else {
								final LongObject upperTime = (LongObject) upperBound;
								final long upperValue = upperTime.getValue();
								if (meanValue > upperValue) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
								}
							}
						}
					}
				}
			}
		}
	}

	/*
	 * Checks the parameters of {@link WeibullParameters}.
	 * The parameters kappa and lambda must be larger then zero
	 * and the resulting mean must be between the lower and upper bound of the deviation.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkWeibullParameters(final Amalthea amalthea) {
		// TODO: add implementation + tests
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Deviation<?>) {
				final Deviation<?> deviation = (Deviation<?>) elem;
				final Distribution<?> distribution = deviation.getDistribution();
				if ((null != distribution) && (distribution instanceof WeibullParameters<?>)) {
					final WeibullParameters<?> weibull = (WeibullParameters<?>) distribution;
					final double kappa = weibull.getKappa();
					final double lambda = weibull.getLambda();
					if ((0 > kappa) || (0 > lambda)) {
						if (0 > kappa) {
							this.issueCreator.issue(weibull, AmaltheaPackage.eINSTANCE.getWeibullParameters_Kappa());
						}
						if (0 > lambda) {
							this.issueCreator.issue(weibull, AmaltheaPackage.eINSTANCE.getWeibullParameters_Lambda());
						}
					} else {
						// if bounds are set -> check mean
						// mean = lambda * GAMMA(1 + 1 / kappa)
					}
				}
			}
		}

	}

	/*
	 * Checks the parameters of {@link WeibullEstimators}.
	 * The parameters mean and pRemainPromille must be set and parameter mean must be between the lower and upper bound of the deviation.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkWeibullEstimators(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Deviation<?>) {
				final Deviation<?> deviation = (Deviation<?>) elem;
				final Distribution<?> distribution = deviation.getDistribution();
				if ((null != distribution) && (distribution instanceof WeibullEstimators<?>)) {
					final WeibullEstimators<?> weibull = (WeibullEstimators<?>) distribution;
					final Object mean = weibull.getMean();
					if (null == mean) {
						this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
					} else {
						// mean
						final Object lowerBound = deviation.getLowerBound();
						final Object upperBound = deviation.getUpperBound();
						if ((null != lowerBound) && (null != upperBound)) {
							if (mean instanceof Time) {
								final Time meanTime = (Time) mean;
								final double meanValue = getSecondsFromTimeUnit(meanTime);
								if (false == (lowerBound instanceof Time)) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
								} else {
									final Time lowerTime = (Time) lowerBound;
									final double lowerValue = getSecondsFromTimeUnit(lowerTime);
									if (meanValue < lowerValue) {
										this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
									}
								}
								if (false == (upperBound instanceof Time)) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
								} else {
									final Time upperTime = (Time) upperBound;
									final double upperValue = getSecondsFromTimeUnit(upperTime);
									if (meanValue > upperValue) {
										this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
									}
								}
							} else if (mean instanceof LongObject) {
								final LongObject meanLong = (LongObject) mean;
								final long meanValue = meanLong.getValue();
								if (false == (lowerBound instanceof LongObject)) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
								} else {
									final LongObject lowerLong = (LongObject) lowerBound;
									final long lowerValue = lowerLong.getValue();
									if (meanValue < lowerValue) {
										this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
									}
								}
								if (false == (upperBound instanceof LongObject)) {
									this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
								} else {
									final LongObject upperTime = (LongObject) upperBound;
									final long upperValue = upperTime.getValue();
									if (meanValue > upperValue) {
										this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());
									}
								}
							}
						}
					}
					// pRemainPromille
					final double pRemainPromille = weibull.getPRemainPromille();
					if (0 > pRemainPromille) {
						this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_PRemainPromille());
					}
				}
			}
		}
	}
}
