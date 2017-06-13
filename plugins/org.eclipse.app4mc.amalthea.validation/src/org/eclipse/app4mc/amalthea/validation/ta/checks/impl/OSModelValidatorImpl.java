package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import java.math.BigInteger;
import java.util.HashSet;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.SchedulingHWUnit;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class OSModelValidatorImpl extends AbstractValidatorImpl {

	public OSModelValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public OSModelValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}
	
	/*
	 * Checks the parameters of {@link Semaphore}.
	 * The parameter initialValue must be larger or equal to zero and must be smaller or equal than maxValue.
	 * MaxValue must be larger than zero.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkSemaphore(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Semaphore) {
				Semaphore semaphore = (Semaphore) elem;
				int initialValue = semaphore.getInitialValue();
				if(false == (0 <= initialValue)) {
					this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_InitialValue());
				}
				int maxValue = semaphore.getMaxValue();
				if(false == (0 < maxValue)) {
					this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_MaxValue());
				}
				if(false == (initialValue <= maxValue)) {
					this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_MaxValue());
				}
			}
		}
	}
	
	/*
	 * Checks all references to {@link Semaphore}.
	 * Each referenced Semaphore must also be referenced in the OsModel.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkSemaphoreReferences(final Amalthea amalthea) {
		OSModel osModel = null;
		HashSet<Component> components = new HashSet<>();
		HashSet<SemaphoreEvent> events = new HashSet<>();
		HashSet<SemaphoreAccess> accesses = new HashSet<>();
		
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof OSModel) {
				osModel = (OSModel) elem;
			} else if (elem instanceof Component) {
				Component component = (Component) elem;
				components.add(component);
			} else if (elem instanceof SemaphoreEvent) {
				SemaphoreEvent event = (SemaphoreEvent) elem;
				events.add(event);
			} else if (elem instanceof SemaphoreAccess) {
				SemaphoreAccess access = (SemaphoreAccess) elem;
				accesses.add(access);
			}
		}
		
		// references from semaphore events
		for (SemaphoreEvent event : events) {
			boolean found = false;
			if(null != osModel) {
				Semaphore semaphore2 = event.getEntity();
				for(Semaphore semaphore1 : osModel.getSemaphores()) {
					if((null != semaphore1) && (null != semaphore2) && (semaphore1.equals(semaphore2))) {
						found = true;
					}
				}
			}
			if(false == found) {
				this.issueCreator.issue(event, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Entity());
			}
		}
		
		// references from semaphore accesses
		for (SemaphoreAccess access : accesses) {
			boolean found = false;
			if(null != osModel) {
				Semaphore semaphore2 = access.getSemaphore();
				for(Semaphore semaphore1 : osModel.getSemaphores()) {
					if((null != semaphore1) && (null != semaphore2) && (semaphore1.equals(semaphore2))) {
						found = true;
					}
				}
			}
			if(false == found) {
				this.issueCreator.issue(access, AmaltheaPackage.eINSTANCE.getSemaphoreAccess_Semaphore());
			}
		}
		
		// references from components
		for (Component component : components) {
			if(null != osModel) {
				for(Semaphore semaphore1 : component.getSemaphores()) {
					boolean found = false;
					for(Semaphore semaphore2 : osModel.getSemaphores()) {
						if((null != semaphore1) && (null != semaphore2) && (semaphore1.equals(semaphore2))) {
							found = true;
							break;
						}
					}
					if(false == found) {
						this.issueCreator.issue(component, AmaltheaPackage.eINSTANCE.getComponent_Semaphores());
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property delay. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSchedulingHWUnitDelayUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof SchedulingHWUnit) {
				SchedulingHWUnit schedulingHWUnit = (SchedulingHWUnit) elem;
				Time delay = schedulingHWUnit.getDelay();
				if(null != delay) {
					BigInteger value = delay.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(delay, AmaltheaPackage.eINSTANCE.getSchedulingHWUnit_Delay(), value);
					}
				}
			}
		}
	}
}
