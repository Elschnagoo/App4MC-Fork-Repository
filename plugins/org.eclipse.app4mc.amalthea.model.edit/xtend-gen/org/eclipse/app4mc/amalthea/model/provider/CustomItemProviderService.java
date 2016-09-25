package org.eclipse.app4mc.amalthea.model.provider;

import com.google.common.base.Objects;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.app4mc.amalthea.model.AbstractElementMapping;
import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint;
import org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation;
import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.AccessPathRef;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.BigIntegerObject;
import org.eclipse.app4mc.amalthea.model.BooleanObject;
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.CoherencyDirection;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.ComplexPort;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.ComponentScope;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.Connector;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.CountMetric;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;
import org.eclipse.app4mc.amalthea.model.DataAgeCycle;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DataCoherencyGroup;
import org.eclipse.app4mc.amalthea.model.DataCoherencyGroupScope;
import org.eclipse.app4mc.amalthea.model.DataPlatformMapping;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.DataTypeDefinition;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.DeviationRunnableItem;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.DoubleObject;
import org.eclipse.app4mc.amalthea.model.EntityEvent;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.EventConfigElement;
import org.eclipse.app4mc.amalthea.model.EventConfigLink;
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
import org.eclipse.app4mc.amalthea.model.FloatObject;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyMetric;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwAccessPathRef;
import org.eclipse.app4mc.amalthea.model.HwElementRef;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.InterProcessActivation;
import org.eclipse.app4mc.amalthea.model.InterfaceKind;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPath;
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.ModeValueListEntry;
import org.eclipse.app4mc.amalthea.model.ModeValueProvider;
import org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.OrderType;
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;
import org.eclipse.app4mc.amalthea.model.OsBuffering;
import org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsConstant;
import org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.OsISRInstructions;
import org.eclipse.app4mc.amalthea.model.OsInstructions;
import org.eclipse.app4mc.amalthea.model.PercentageMetric;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Port;
import org.eclipse.app4mc.amalthea.model.ProbabilityGroup;
import org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem;
import org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessChain;
import org.eclipse.app4mc.amalthea.model.ProcessChainRequirement;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.ProcessScope;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.RWType;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.RunnableScope;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.SectionMapping;
import org.eclipse.app4mc.amalthea.model.SectionMappingConstraint;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum;
import org.eclipse.app4mc.amalthea.model.SenderReceiverRead;
import org.eclipse.app4mc.amalthea.model.SenderReceiverWrite;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SignedTime;
import org.eclipse.app4mc.amalthea.model.SignedTimeObject;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.SynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TagGroup;
import org.eclipse.app4mc.amalthea.model.TargetCallSequence;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeObject;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;
import org.eclipse.app4mc.amalthea.model.TypeRef;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour;
import org.eclipse.app4mc.amalthea.model.impl.CustomPropertyImpl;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CustomItemProviderService {
  private static String getFrequencyText(final Frequency frequency) {
    boolean _equals = Objects.equal(frequency, null);
    if (_equals) {
      return "<frequency>";
    }
    double _value = frequency.getValue();
    final String value = Double.toString(_value);
    String _xifexpression = null;
    FrequencyUnit _unit = frequency.getUnit();
    boolean _equals_1 = Objects.equal(_unit, FrequencyUnit._UNDEFINED_);
    if (_equals_1) {
      _xifexpression = "<unit>";
    } else {
      FrequencyUnit _unit_1 = frequency.getUnit();
      _xifexpression = _unit_1.getLiteral();
    }
    final String unit = _xifexpression;
    return ((value + " ") + unit);
  }
  
  private static String getTimeText(final AbstractTime time) {
    boolean _equals = Objects.equal(time, null);
    if (_equals) {
      return "<time>";
    }
    int _value = time.getValue();
    final String value = Integer.toString(_value);
    String _xifexpression = null;
    TimeUnit _unit = time.getUnit();
    boolean _equals_1 = Objects.equal(_unit, TimeUnit._UNDEFINED_);
    if (_equals_1) {
      _xifexpression = "<unit>";
    } else {
      TimeUnit _unit_1 = time.getUnit();
      _xifexpression = _unit_1.getLiteral();
    }
    final String unit = _xifexpression;
    return ((value + " ") + unit);
  }
  
  private static String getDataSizeText(final DataSize size) {
    boolean _equals = Objects.equal(size, null);
    if (_equals) {
      return "<data size>";
    }
    String _xifexpression = null;
    BigInteger _value = size.getValue();
    boolean _equals_1 = Objects.equal(_value, null);
    if (_equals_1) {
      _xifexpression = "???";
    } else {
      BigInteger _value_1 = size.getValue();
      _xifexpression = _value_1.toString();
    }
    final String value = _xifexpression;
    String _xifexpression_1 = null;
    DataSizeUnit _unit = size.getUnit();
    boolean _equals_2 = Objects.equal(_unit, DataSizeUnit._UNDEFINED_);
    if (_equals_2) {
      _xifexpression_1 = "<unit>";
    } else {
      DataSizeUnit _unit_1 = size.getUnit();
      _xifexpression_1 = _unit_1.getLiteral();
    }
    final String unit = _xifexpression_1;
    return ((value + " ") + unit);
  }
  
  /**
   * CustomPropertyItemProvider
   */
  public static String getCustomPropertyItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof CustomPropertyImpl)) {
      String _key = null;
      if (((CustomPropertyImpl)object)!=null) {
        _key=((CustomPropertyImpl)object).getKey();
      }
      final String key = _key;
      Value _value = null;
      if (((CustomPropertyImpl)object)!=null) {
        _value=((CustomPropertyImpl)object).getValue();
      }
      final Value value = _value;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(key);
      if (_isNullOrEmpty) {
        _xifexpression = "<key>";
      } else {
        _xifexpression = (("\"" + key) + "\"");
      }
      final String s1 = _xifexpression;
      Object _xifexpression_1 = null;
      boolean _equals = Objects.equal(value, null);
      if (_equals) {
        _xifexpression_1 = "null";
      } else {
        _xifexpression_1 = value;
      }
      final Object s2 = _xifexpression_1;
      return ((s1 + " -> ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getCustomPropertyItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(Map.Entry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CUSTOM_PROPERTY__KEY)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CUSTOM_PROPERTY__VALUE)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, true);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * BooleanObjectItemProvider
   */
  public static String getBooleanObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof BooleanObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((BooleanObject)object)!=null) {
        _eContainingFeature=((BooleanObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      return (s1 + object);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DoubleObjectItemProvider
   */
  public static String getDoubleObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DoubleObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((DoubleObject)object)!=null) {
        _eContainingFeature=((DoubleObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      return (s1 + object);
    } else {
      return defaultText;
    }
  }
  
  /**
   * FloatObjectItemProvider
   */
  public static String getFloatObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof FloatObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((FloatObject)object)!=null) {
        _eContainingFeature=((FloatObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      return (s1 + object);
    } else {
      return defaultText;
    }
  }
  
  /**
   * IntegerObjectItemProvider
   */
  public static String getIntegerObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof IntegerObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((IntegerObject)object)!=null) {
        _eContainingFeature=((IntegerObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      return (s1 + object);
    } else {
      return defaultText;
    }
  }
  
  /**
   * LongObjectItemProvider
   */
  public static String getLongObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof LongObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((LongObject)object)!=null) {
        _eContainingFeature=((LongObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      return (s1 + object);
    } else {
      return defaultText;
    }
  }
  
  /**
   * SignedTimeObjectItemProvider
   */
  public static String getSignedTimeObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SignedTimeObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((SignedTimeObject)object)!=null) {
        _eContainingFeature=((SignedTimeObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _timeText = CustomItemProviderService.getTimeText(((AbstractTime)object));
      return (s1 + _timeText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TimeObjectItemProvider
   */
  public static String getTimeObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((TimeObject)object)!=null) {
        _eContainingFeature=((TimeObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _timeText = CustomItemProviderService.getTimeText(((AbstractTime)object));
      return (s1 + _timeText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * StringObjectItemProvider
   */
  public static String getStringObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof StringObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((StringObject)object)!=null) {
        _eContainingFeature=((StringObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      String _value = null;
      if (((StringObject)object)!=null) {
        _value=((StringObject)object).getValue();
      }
      boolean _equals_1 = Objects.equal(_value, null);
      if (_equals_1) {
        _xifexpression_1 = "null";
      } else {
        String _value_1 = ((StringObject)object).getValue();
        String _plus = ("\"" + _value_1);
        _xifexpression_1 = (_plus + "\"");
      }
      final String s2 = _xifexpression_1;
      return (s1 + s2);
    } else {
      return defaultText;
    }
  }
  
  /**
   * BigIntegerObjectItemProvider
   */
  public static String getBigIntegerObjectItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof BigIntegerObject)) {
      EStructuralFeature _eContainingFeature = null;
      if (((BigIntegerObject)object)!=null) {
        _eContainingFeature=((BigIntegerObject)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      BigInteger _value = null;
      if (((BigIntegerObject)object)!=null) {
        _value=((BigIntegerObject)object).getValue();
      }
      boolean _equals_1 = Objects.equal(_value, null);
      if (_equals_1) {
        _xifexpression_1 = "null";
      } else {
        BigInteger _value_1 = ((BigIntegerObject)object).getValue();
        String _plus = ("\"" + _value_1);
        _xifexpression_1 = (_plus + "\"");
      }
      final String s2 = _xifexpression_1;
      return (s1 + s2);
    } else {
      return defaultText;
    }
  }
  
  /**
   * BoundariesItemProvider
   */
  public static String getBoundariesItemProviderText(final Object object, final String defaultText) {
    return "Dist: Boundaries";
  }
  
  /**
   * GaussDistributionItemProvider
   */
  public static String getGaussDistributionItemProviderText(final Object object, final String defaultText) {
    return "Dist: Gauss";
  }
  
  /**
   * UniformDistributionItemProvider
   */
  public static String getUniformDistributionItemProviderText(final Object object, final String defaultText) {
    return "Dist: Uniform";
  }
  
  /**
   * WeibullEstimatorsItemProvider
   */
  public static String getWeibullEstimatorsItemProviderText(final Object object, final String defaultText) {
    return "Dist: Weibull Estimators";
  }
  
  /**
   * WeibullParametersItemProvider
   */
  public static String getWeibullParametersItemProviderText(final Object object, final String defaultText) {
    return "Dist: Weibull Parameters";
  }
  
  /**
   * FrequencyItemProvider
   */
  public static String getFrequencyItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof Frequency)) {
      EStructuralFeature _eContainingFeature = null;
      if (((Frequency)object)!=null) {
        _eContainingFeature=((Frequency)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _frequencyText = CustomItemProviderService.getFrequencyText(((Frequency)object));
      return (s1 + _frequencyText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DataSizeItemProvider
   */
  public static String getDataSizeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DataSize)) {
      EStructuralFeature _eContainingFeature = null;
      if (((DataSize)object)!=null) {
        _eContainingFeature=((DataSize)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _dataSizeText = CustomItemProviderService.getDataSizeText(((DataSize)object));
      return (s1 + _dataSizeText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DeviationItemProvider
   */
  public static String getDeviationItemProviderText(final Object object, final String defaultText, final AdapterFactory rootAF) {
    final Deviation<Object> element = ((Deviation<Object>) object);
    final StringBuffer sb = new StringBuffer();
    sb.append(defaultText);
    if (((null != element.getDistribution()) && rootAF.isFactoryForType(element.getDistribution()))) {
      Distribution<Object> _distribution = element.getDistribution();
      final Object plainAdapter = rootAF.adapt(_distribution, IItemLabelProvider.class);
      if ((plainAdapter instanceof IItemLabelProvider)) {
        Distribution<Object> _distribution_1 = element.getDistribution();
        final String tmp = ((IItemLabelProvider)plainAdapter).getText(_distribution_1);
        StringBuffer _append = sb.append(" ");
        _append.append(tmp);
      }
    }
    if (((null != element.getLowerBound()) && rootAF.isFactoryForType(element.getLowerBound()))) {
      Object _lowerBound = element.getLowerBound();
      final Object plainAdapter_1 = rootAF.adapt(_lowerBound, IItemLabelProvider.class);
      if ((plainAdapter_1 instanceof IItemLabelProvider)) {
        Object _lowerBound_1 = element.getLowerBound();
        final String tmp_1 = ((IItemLabelProvider)plainAdapter_1).getText(_lowerBound_1);
        StringBuffer _append_1 = sb.append(" ");
        _append_1.append(tmp_1);
      }
    }
    if (((null != element.getUpperBound()) && rootAF.isFactoryForType(element.getUpperBound()))) {
      Object _upperBound = element.getUpperBound();
      final Object plainAdapter_2 = rootAF.adapt(_upperBound, IItemLabelProvider.class);
      if ((plainAdapter_2 instanceof IItemLabelProvider)) {
        Object _upperBound_1 = element.getUpperBound();
        final String tmp_2 = ((IItemLabelProvider)plainAdapter_2).getText(_upperBound_1);
        StringBuffer _append_2 = sb.append(" ");
        _append_2.append(tmp_2);
      }
    }
    return sb.toString();
  }
  
  public static List<ViewerNotification> getDeviationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(Deviation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DEVIATION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DEVIATION__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DEVIATION__DISTRIBUTION)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * MinAvgMaxStatisticItemProvider
   */
  public static String getMinAvgMaxStatisticItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof MinAvgMaxStatistic)) {
      EStructuralFeature _eContainingFeature = null;
      if (((MinAvgMaxStatistic)object)!=null) {
        _eContainingFeature=((MinAvgMaxStatistic)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      int _min = ((MinAvgMaxStatistic)object).getMin();
      String _plus = (s1 + Integer.valueOf(_min));
      String _plus_1 = (_plus + " : ");
      int _avg = ((MinAvgMaxStatistic)object).getAvg();
      String _plus_2 = (_plus_1 + Integer.valueOf(_avg));
      String _plus_3 = (_plus_2 + " : ");
      int _max = ((MinAvgMaxStatistic)object).getMax();
      return (_plus_3 + Integer.valueOf(_max));
    } else {
      return defaultText;
    }
  }
  
  /**
   * SingleValueStatisticItemProvider
   */
  public static String getSingleValueStatisticItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SingleValueStatistic)) {
      EStructuralFeature _eContainingFeature = null;
      if (((SingleValueStatistic)object)!=null) {
        _eContainingFeature=((SingleValueStatistic)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      float _value = ((SingleValueStatistic)object).getValue();
      return (s1 + Float.valueOf(_value));
    } else {
      return defaultText;
    }
  }
  
  /**
   * SignedTimeItemProvider
   */
  public static String getSignedTimeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SignedTime)) {
      EStructuralFeature _eContainingFeature = null;
      if (((SignedTime)object)!=null) {
        _eContainingFeature=((SignedTime)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _timeText = CustomItemProviderService.getTimeText(((AbstractTime)object));
      return (s1 + _timeText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TimeItemProvider
   */
  public static String getTimeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof Time)) {
      EStructuralFeature _eContainingFeature = null;
      if (((Time)object)!=null) {
        _eContainingFeature=((Time)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      String _timeText = CustomItemProviderService.getTimeText(((AbstractTime)object));
      return (s1 + _timeText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ComponentItemProvider
   */
  public static String getComponentItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof Component)) {
      String _name = null;
      if (((Component)object)!=null) {
        _name=((Component)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<component>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * ComponentInstanceItemProvider
   */
  public static String getComponentInstanceItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ComponentInstance)) {
      String _name = null;
      if (((ComponentInstance)object)!=null) {
        _name=((ComponentInstance)object).getName();
      }
      final String name = _name;
      Component _type = null;
      if (((ComponentInstance)object)!=null) {
        _type=((ComponentInstance)object).getType();
      }
      String _name_1 = null;
      if (_type!=null) {
        _name_1=_type.getName();
      }
      final String typeName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<component instance>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(typeName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "???";
      } else {
        _xifexpression_1 = typeName;
      }
      final String s2 = _xifexpression_1;
      return (((s1 + " (type: ") + s2) + ")");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getComponentInstanceItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ComponentInstance.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.COMPONENT_INSTANCE__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.COMPONENT_INSTANCE__TYPE)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.COMPONENT_INSTANCE__CUSTOM_PROPERTIES)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * CompositeItemProvider
   */
  public static String getCompositeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof Composite)) {
      String _name = null;
      if (((Composite)object)!=null) {
        _name=((Composite)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<composite>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * ConnectorItemProvider
   */
  public static String getConnectorItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof Connector)) {
      String _name = null;
      if (((Connector)object)!=null) {
        _name=((Connector)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<connector>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * FInterfacePortItemProvider
   */
  public static String getFInterfacePortItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof FInterfacePort)) {
      EObject _eContainer = null;
      if (((FInterfacePort)object)!=null) {
        _eContainer=((FInterfacePort)object).eContainer();
      }
      final String cName = ((Component) _eContainer).getName();
      InterfaceKind _kind = null;
      if (((FInterfacePort)object)!=null) {
        _kind=((FInterfacePort)object).getKind();
      }
      final InterfaceKind kind = _kind;
      String _name = null;
      if (((FInterfacePort)object)!=null) {
        _name=((FInterfacePort)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(cName);
      if (_isNullOrEmpty) {
        _xifexpression = "<component>";
      } else {
        _xifexpression = cName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      if ((Objects.equal(kind, null) || Objects.equal(kind, InterfaceKind._UNDEFINED_))) {
        _xifexpression_1 = "<kind>";
      } else {
        _xifexpression_1 = kind.getLiteral();
      }
      final String s2 = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty_1) {
        _xifexpression_2 = "<port>";
      } else {
        _xifexpression_2 = name;
      }
      final String s3 = _xifexpression_2;
      return ((((s1 + " ") + s2) + " ") + s3);
    } else {
      return defaultText;
    }
  }
  
  /**
   * QualifiedPortItemProvider
   */
  public static String getQualifiedPortItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof QualifiedPort)) {
      EStructuralFeature _eContainingFeature = null;
      if (((QualifiedPort)object)!=null) {
        _eContainingFeature=((QualifiedPort)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      ComponentInstance _instance = null;
      if (((QualifiedPort)object)!=null) {
        _instance=((QualifiedPort)object).getInstance();
      }
      String _name = null;
      if (_instance!=null) {
        _name=_instance.getName();
      }
      final String instName = _name;
      Port _port = null;
      if (((QualifiedPort)object)!=null) {
        _port=((QualifiedPort)object).getPort();
      }
      String _name_1 = null;
      if (_port!=null) {
        _name_1=_port.getName();
      }
      final String portName = _name_1;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name_2 = feature.getName();
        _xifexpression = (_name_2 + ": ");
      }
      final String s1 = _xifexpression;
      String s2 = "";
      String s4 = "";
      ComponentInstance _instance_1 = null;
      if (((QualifiedPort)object)!=null) {
        _instance_1=((QualifiedPort)object).getInstance();
      }
      boolean _equals_1 = Objects.equal(_instance_1, null);
      if (_equals_1) {
        s4 = " (enclosing composite)";
      } else {
        String _xifexpression_1 = null;
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(instName);
        if (_isNullOrEmpty) {
          _xifexpression_1 = "??? / ";
        } else {
          _xifexpression_1 = (instName + " / ");
        }
        s2 = _xifexpression_1;
      }
      String _xifexpression_2 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(portName);
      if (_isNullOrEmpty_1) {
        _xifexpression_2 = "<port>";
      } else {
        _xifexpression_2 = portName;
      }
      final String s3 = _xifexpression_2;
      return (((s1 + s2) + s3) + s4);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getQualifiedPortItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(QualifiedPort.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.QUALIFIED_PORT__INSTANCE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.QUALIFIED_PORT__PORT)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * SystemItemProvider
   */
  public static String getSystemItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof org.eclipse.app4mc.amalthea.model.System)) {
      String _name = null;
      if (((org.eclipse.app4mc.amalthea.model.System)object)!=null) {
        _name=((org.eclipse.app4mc.amalthea.model.System)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<system>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * EventConfigElementItemProvider
   */
  public static String getEventConfigElementItemProviderText(final Object object, final String defaultText, final AdapterFactory rootAF) {
    if ((object instanceof EventConfigElement)) {
      String _name = null;
      if (((EventConfigElement)object)!=null) {
        _name=((EventConfigElement)object).getName();
      }
      final String name = _name;
      EntityEvent _event = null;
      if (((EventConfigElement)object)!=null) {
        _event=((EventConfigElement)object).getEvent();
      }
      final EntityEvent event = _event;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "";
      } else {
        _xifexpression = (name + " ");
      }
      final String s1 = _xifexpression;
      String s2 = "";
      if (((!Objects.equal(event, null)) && rootAF.isFactoryForType(event))) {
        final Adapter plainAdapter = rootAF.adapt(event, IItemLabelProvider.class);
        if ((plainAdapter instanceof IItemLabelProvider)) {
          String _text = ((IItemLabelProvider)plainAdapter).getText(event);
          String _plus = (" {" + _text);
          String _plus_1 = (_plus + "}");
          s2 = _plus_1;
        }
      }
      return (("Config " + s1) + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getEventConfigElementItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(EventConfigElement.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.EVENT_CONFIG_ELEMENT__NAME)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.EVENT_CONFIG_ELEMENT__EVENT)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, true);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * EventConfigLinkItemProvider
   */
  public static String getEventConfigLinkItemProviderText(final Object object, final String defaultText, final AdapterFactory rootAF) {
    if ((object instanceof EventConfigLink)) {
      String _name = null;
      if (((EventConfigLink)object)!=null) {
        _name=((EventConfigLink)object).getName();
      }
      final String name = _name;
      EntityEvent _event = null;
      if (((EventConfigLink)object)!=null) {
        _event=((EventConfigLink)object).getEvent();
      }
      final EntityEvent event = _event;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "";
      } else {
        _xifexpression = (name + " ");
      }
      final String s1 = _xifexpression;
      String s2 = "";
      if (((!Objects.equal(event, null)) && rootAF.isFactoryForType(event))) {
        final Adapter plainAdapter = rootAF.adapt(event, IItemLabelProvider.class);
        if ((plainAdapter instanceof IItemLabelProvider)) {
          String _text = ((IItemLabelProvider)plainAdapter).getText(event);
          String _plus = (" {" + _text);
          String _plus_1 = (_plus + "}");
          s2 = _plus_1;
        }
      }
      return (("Config Link " + s1) + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getEventConfigLinkItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(EventConfigLink.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.EVENT_CONFIG_LINK__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.EVENT_CONFIG_LINK__EVENT)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  private static String getLimitTypeText(final LimitType limitType) {
    String _switchResult = null;
    if (limitType != null) {
      switch (limitType) {
        case UPPER_LIMIT:
          _switchResult = " <= ";
          break;
        case LOWER_LIMIT:
          _switchResult = " >= ";
          break;
        default:
          _switchResult = " ? ";
          break;
      }
    } else {
      _switchResult = " ? ";
    }
    return _switchResult;
  }
  
  /**
   * ComponentScopeItemProvider
   */
  public static String getComponentScopeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ComponentScope)) {
      Component _component = null;
      if (((ComponentScope)object)!=null) {
        _component=((ComponentScope)object).getComponent();
      }
      String _name = null;
      if (_component!=null) {
        _name=_component.getName();
      }
      final String compName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(compName);
      if (_isNullOrEmpty) {
        _xifexpression = "<component>";
      } else {
        _xifexpression = ("Component " + compName);
      }
      final String s1 = _xifexpression;
      return ("Scope: " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getComponentScopeItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ComponentScope.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.COMPONENT_SCOPE__COMPONENT)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ProcessScopeItemProvider
   */
  public static String getProcessScopeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ProcessScope)) {
      AbstractProcess _process = null;
      if (((ProcessScope)object)!=null) {
        _process=((ProcessScope)object).getProcess();
      }
      final AbstractProcess proc = _process;
      String _xifexpression = null;
      String _name = null;
      if (proc!=null) {
        _name=proc.getName();
      }
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "<process>";
      } else {
        EClass _eClass = proc.eClass();
        String _name_1 = _eClass.getName();
        String _plus = (_name_1 + " ");
        String _name_2 = proc.getName();
        _xifexpression = (_plus + _name_2);
      }
      final String s1 = _xifexpression;
      return ("Scope: " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getProcessScopeItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ProcessScope.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.PROCESS_SCOPE__PROCESS)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * RunnableScopeItemProvider
   */
  public static String getRunnableScopeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof RunnableScope)) {
      org.eclipse.app4mc.amalthea.model.Runnable _runnable = null;
      if (((RunnableScope)object)!=null) {
        _runnable=((RunnableScope)object).getRunnable();
      }
      String _name = null;
      if (_runnable!=null) {
        _name=_runnable.getName();
      }
      final String runName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(runName);
      if (_isNullOrEmpty) {
        _xifexpression = "<runnable>";
      } else {
        _xifexpression = ("Runnable " + runName);
      }
      final String s1 = _xifexpression;
      return ("Scope: " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getRunnableScopeItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(RunnableScope.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_SCOPE__RUNNABLE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ArchitectureRequirementItemProvider
   */
  public static String getArchitectureRequirementItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ArchitectureRequirement)) {
      String _name = null;
      if (((ArchitectureRequirement)object)!=null) {
        _name=((ArchitectureRequirement)object).getName();
      }
      final String reqName = _name;
      Component _component = null;
      if (((ArchitectureRequirement)object)!=null) {
        _component=((ArchitectureRequirement)object).getComponent();
      }
      String _name_1 = null;
      if (_component!=null) {
        _name_1=_component.getName();
      }
      final String compName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(reqName);
      if (_isNullOrEmpty) {
        _xifexpression = "???";
      } else {
        _xifexpression = reqName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(compName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<component>";
      } else {
        _xifexpression_1 = ("Component " + compName);
      }
      final String s2 = _xifexpression_1;
      return ((("Req " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getArchitectureRequirementItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ArchitectureRequirement.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ARCHITECTURE_REQUIREMENT__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ARCHITECTURE_REQUIREMENT__COMPONENT)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * CountRequirementLimitItemProvider
   */
  public static String getCountRequirementLimitItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof CountRequirementLimit)) {
      CountMetric _metric = null;
      if (((CountRequirementLimit)object)!=null) {
        _metric=((CountRequirementLimit)object).getMetric();
      }
      final CountMetric metric = _metric;
      LimitType _limitType = null;
      if (((CountRequirementLimit)object)!=null) {
        _limitType=((CountRequirementLimit)object).getLimitType();
      }
      final LimitType limitType = _limitType;
      int _xifexpression = (int) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((CountRequirementLimit)object).getLimitValue();
      }
      final int limitValue = _xifexpression;
      String _xifexpression_1 = null;
      if ((Objects.equal(metric, null) || Objects.equal(metric, CountMetric._UNDEFINED_))) {
        _xifexpression_1 = "<count metric>";
      } else {
        String _literal = metric.getLiteral();
        _xifexpression_1 = (_literal + " count");
      }
      final String s1 = _xifexpression_1;
      final String s2 = CustomItemProviderService.getLimitTypeText(limitType);
      final String s3 = Double.toString(limitValue);
      return ((s1 + s2) + s3);
    } else {
      return defaultText;
    }
  }
  
  /**
   * CPUPercentageRequirementLimitItemProvider
   */
  public static String getCPUPercentageRequirementLimitItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof CPUPercentageRequirementLimit)) {
      CPUPercentageMetric _metric = null;
      if (((CPUPercentageRequirementLimit)object)!=null) {
        _metric=((CPUPercentageRequirementLimit)object).getMetric();
      }
      final CPUPercentageMetric metric = _metric;
      ComplexNode _hardwareContext = null;
      if (((CPUPercentageRequirementLimit)object)!=null) {
        _hardwareContext=((CPUPercentageRequirementLimit)object).getHardwareContext();
      }
      String _name = null;
      if (_hardwareContext!=null) {
        _name=_hardwareContext.getName();
      }
      final String hwContext = _name;
      LimitType _limitType = null;
      if (((CPUPercentageRequirementLimit)object)!=null) {
        _limitType=((CPUPercentageRequirementLimit)object).getLimitType();
      }
      final LimitType limitType = _limitType;
      double _xifexpression = (double) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((CPUPercentageRequirementLimit)object).getLimitValue();
      }
      final double limitValue = _xifexpression;
      String _xifexpression_1 = null;
      if ((Objects.equal(metric, null) || Objects.equal(metric, CPUPercentageMetric._UNDEFINED_))) {
        _xifexpression_1 = "<CPU % metric>";
      } else {
        _xifexpression_1 = metric.getLiteral();
      }
      final String s1 = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(hwContext);
      if (_isNullOrEmpty) {
        _xifexpression_2 = "";
      } else {
        _xifexpression_2 = (" on " + hwContext);
      }
      final String s2 = _xifexpression_2;
      final String s3 = CustomItemProviderService.getLimitTypeText(limitType);
      String _string = Double.toString(limitValue);
      final String s4 = (_string + " %");
      return (((s1 + s2) + s3) + s4);
    } else {
      return defaultText;
    }
  }
  
  /**
   * FrequencyRequirementLimitItemProvider
   */
  public static String getFrequencyRequirementLimitItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof FrequencyRequirementLimit)) {
      FrequencyMetric _metric = null;
      if (((FrequencyRequirementLimit)object)!=null) {
        _metric=((FrequencyRequirementLimit)object).getMetric();
      }
      final FrequencyMetric metric = _metric;
      LimitType _limitType = null;
      if (((FrequencyRequirementLimit)object)!=null) {
        _limitType=((FrequencyRequirementLimit)object).getLimitType();
      }
      final LimitType limitType = _limitType;
      Frequency _limitValue = null;
      if (((FrequencyRequirementLimit)object)!=null) {
        _limitValue=((FrequencyRequirementLimit)object).getLimitValue();
      }
      final Frequency limitValue = _limitValue;
      String _xifexpression = null;
      if ((Objects.equal(metric, null) || Objects.equal(metric, FrequencyMetric._UNDEFINED_))) {
        _xifexpression = "<frequency metric>";
      } else {
        _xifexpression = metric.getLiteral();
      }
      final String s1 = _xifexpression;
      final String s2 = CustomItemProviderService.getLimitTypeText(limitType);
      final String s3 = CustomItemProviderService.getFrequencyText(limitValue);
      return ((s1 + s2) + s3);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getFrequencyRequirementLimitItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(FrequencyRequirementLimit.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__METRIC)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, true);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * PercentageRequirementLimitItemProvider
   */
  public static String getPercentageRequirementLimitItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof PercentageRequirementLimit)) {
      PercentageMetric _metric = null;
      if (((PercentageRequirementLimit)object)!=null) {
        _metric=((PercentageRequirementLimit)object).getMetric();
      }
      final PercentageMetric metric = _metric;
      LimitType _limitType = null;
      if (((PercentageRequirementLimit)object)!=null) {
        _limitType=((PercentageRequirementLimit)object).getLimitType();
      }
      final LimitType limitType = _limitType;
      double _xifexpression = (double) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((PercentageRequirementLimit)object).getLimitValue();
      }
      final double limitValue = _xifexpression;
      String _xifexpression_1 = null;
      if ((Objects.equal(metric, null) || Objects.equal(metric, PercentageMetric._UNDEFINED_))) {
        _xifexpression_1 = "<% metric>";
      } else {
        _xifexpression_1 = metric.getLiteral();
      }
      final String s1 = _xifexpression_1;
      final String s2 = CustomItemProviderService.getLimitTypeText(limitType);
      String _string = Double.toString(limitValue);
      final String s3 = (_string + " %");
      return ((s1 + s2) + s3);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TimeRequirementLimitItemProvider
   */
  public static String getTimeRequirementLimitItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeRequirementLimit)) {
      TimeMetric _metric = null;
      if (((TimeRequirementLimit)object)!=null) {
        _metric=((TimeRequirementLimit)object).getMetric();
      }
      final TimeMetric metric = _metric;
      LimitType _limitType = null;
      if (((TimeRequirementLimit)object)!=null) {
        _limitType=((TimeRequirementLimit)object).getLimitType();
      }
      final LimitType limitType = _limitType;
      SignedTime _limitValue = null;
      if (((TimeRequirementLimit)object)!=null) {
        _limitValue=((TimeRequirementLimit)object).getLimitValue();
      }
      final SignedTime limitValue = _limitValue;
      String _xifexpression = null;
      if ((Objects.equal(metric, null) || Objects.equal(metric, TimeMetric._UNDEFINED_))) {
        _xifexpression = "<time metric>";
      } else {
        _xifexpression = metric.getLiteral();
      }
      final String s1 = _xifexpression;
      final String s2 = CustomItemProviderService.getLimitTypeText(limitType);
      final String s3 = CustomItemProviderService.getTimeText(limitValue);
      return ((s1 + s2) + s3);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeRequirementLimitItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeRequirementLimit.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_REQUIREMENT_LIMIT__METRIC)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, true);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * ProcessRequirementItemProvider
   */
  public static String getProcessRequirementItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ProcessRequirement)) {
      String _name = null;
      if (((ProcessRequirement)object)!=null) {
        _name=((ProcessRequirement)object).getName();
      }
      final String reqName = _name;
      AbstractProcess _process = null;
      if (((ProcessRequirement)object)!=null) {
        _process=((ProcessRequirement)object).getProcess();
      }
      final AbstractProcess proc = _process;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(reqName);
      if (_isNullOrEmpty) {
        _xifexpression = "???";
      } else {
        _xifexpression = reqName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      String _name_1 = null;
      if (proc!=null) {
        _name_1=proc.getName();
      }
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name_1);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<process>";
      } else {
        EClass _eClass = proc.eClass();
        String _name_2 = _eClass.getName();
        String _plus = (_name_2 + " ");
        String _name_3 = proc.getName();
        _xifexpression_1 = (_plus + _name_3);
      }
      final String s2 = _xifexpression_1;
      return ((("Req " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getProcessRequirementItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ProcessRequirement.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.PROCESS_REQUIREMENT__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.PROCESS_REQUIREMENT__PROCESS)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * RunnableRequirementItemProvider
   */
  public static String getRunnableRequirementItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof RunnableRequirement)) {
      String _name = null;
      if (((RunnableRequirement)object)!=null) {
        _name=((RunnableRequirement)object).getName();
      }
      final String reqName = _name;
      org.eclipse.app4mc.amalthea.model.Runnable _runnable = null;
      if (((RunnableRequirement)object)!=null) {
        _runnable=((RunnableRequirement)object).getRunnable();
      }
      String _name_1 = null;
      if (_runnable!=null) {
        _name_1=_runnable.getName();
      }
      final String runName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(reqName);
      if (_isNullOrEmpty) {
        _xifexpression = "???";
      } else {
        _xifexpression = reqName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(runName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<runnable>";
      } else {
        _xifexpression_1 = ("Runnable " + runName);
      }
      final String s2 = _xifexpression_1;
      return ((("Req " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getRunnableRequirementItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(RunnableRequirement.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_REQUIREMENT__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_REQUIREMENT__RUNNABLE)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ProcessChainRequirementItemProvider
   */
  public static String getProcessChainRequirementItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ProcessChainRequirement)) {
      String _name = null;
      if (((ProcessChainRequirement)object)!=null) {
        _name=((ProcessChainRequirement)object).getName();
      }
      final String reqName = _name;
      ProcessChain _processChain = null;
      if (((ProcessChainRequirement)object)!=null) {
        _processChain=((ProcessChainRequirement)object).getProcessChain();
      }
      String _name_1 = null;
      if (_processChain!=null) {
        _name_1=_processChain.getName();
      }
      final String pcName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(reqName);
      if (_isNullOrEmpty) {
        _xifexpression = "???";
      } else {
        _xifexpression = reqName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(pcName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<process chain>";
      } else {
        _xifexpression_1 = ("Process Chain " + pcName);
      }
      final String s2 = _xifexpression_1;
      return ((("Req " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getProcessChainRequirementItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ProcessChainRequirement.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.PROCESS_CHAIN_REQUIREMENT__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.PROCESS_CHAIN_REQUIREMENT__PROCESS_CHAIN)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * DataAgeCycleItemProvider
   */
  public static String getDataAgeCycleItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DataAgeCycle)) {
      int _minimumCycle = ((DataAgeCycle)object).getMinimumCycle();
      String _plus = ("Age cycles c: " + Integer.valueOf(_minimumCycle));
      String _plus_1 = (_plus + " <= c <= ");
      int _maximumCycle = ((DataAgeCycle)object).getMaximumCycle();
      return (_plus_1 + Integer.valueOf(_maximumCycle));
    } else {
      return defaultText;
    }
  }
  
  /**
   * DataAgeTimeItemProvider
   */
  public static String getDataAgeTimeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DataAgeTime)) {
      Time _minimumTime = null;
      if (((DataAgeTime)object)!=null) {
        _minimumTime=((DataAgeTime)object).getMinimumTime();
      }
      final Time minTime = _minimumTime;
      Time _maximumTime = null;
      if (((DataAgeTime)object)!=null) {
        _maximumTime=((DataAgeTime)object).getMaximumTime();
      }
      final Time maxTime = _maximumTime;
      String _timeText = CustomItemProviderService.getTimeText(minTime);
      String _plus = ("Age time t: " + _timeText);
      String _plus_1 = (_plus + " <= t <= ");
      String _timeText_1 = CustomItemProviderService.getTimeText(maxTime);
      return (_plus_1 + _timeText_1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDataAgeTimeItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DataAgeTime.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * DataCoherencyGroupItemProvider
   */
  public static String getDataCoherencyGroupItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DataCoherencyGroup)) {
      String _name = null;
      if (((DataCoherencyGroup)object)!=null) {
        _name=((DataCoherencyGroup)object).getName();
      }
      final String name = _name;
      CoherencyDirection _direction = null;
      if (((DataCoherencyGroup)object)!=null) {
        _direction=((DataCoherencyGroup)object).getDirection();
      }
      final CoherencyDirection direction = _direction;
      DataCoherencyGroupScope _scope = null;
      if (((DataCoherencyGroup)object)!=null) {
        _scope=((DataCoherencyGroup)object).getScope();
      }
      final DataCoherencyGroupScope scope = _scope;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<group>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      if ((Objects.equal(direction, null) || Objects.equal(direction, CoherencyDirection._UNDEFINED_))) {
        _xifexpression_1 = "<direction>";
      } else {
        _xifexpression_1 = direction.getLiteral();
      }
      final String s2 = _xifexpression_1;
      String _switchResult = null;
      boolean _matched = false;
      if (scope instanceof RunnableScope) {
        _matched=true;
        String _xifexpression_2 = null;
        org.eclipse.app4mc.amalthea.model.Runnable _runnable = ((RunnableScope)scope).getRunnable();
        String _name_1 = null;
        if (_runnable!=null) {
          _name_1=_runnable.getName();
        }
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name_1);
        if (_isNullOrEmpty_1) {
          _xifexpression_2 = "<runnable>";
        } else {
          org.eclipse.app4mc.amalthea.model.Runnable _runnable_1 = ((RunnableScope)scope).getRunnable();
          String _name_2 = _runnable_1.getName();
          _xifexpression_2 = ("Runnable " + _name_2);
        }
        _switchResult = _xifexpression_2;
      }
      if (!_matched) {
        if (scope instanceof ProcessScope) {
          _matched=true;
          String _xifexpression_2 = null;
          AbstractProcess _process = ((ProcessScope)scope).getProcess();
          String _name_1 = null;
          if (_process!=null) {
            _name_1=_process.getName();
          }
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name_1);
          if (_isNullOrEmpty_1) {
            _xifexpression_2 = "<process>";
          } else {
            AbstractProcess _process_1 = ((ProcessScope)scope).getProcess();
            EClass _eClass = _process_1.eClass();
            String _name_2 = _eClass.getName();
            String _plus = (_name_2 + " ");
            AbstractProcess _process_2 = ((ProcessScope)scope).getProcess();
            String _name_3 = _process_2.getName();
            _xifexpression_2 = (_plus + _name_3);
          }
          _switchResult = _xifexpression_2;
        }
      }
      if (!_matched) {
        if (scope instanceof ComponentScope) {
          _matched=true;
          String _xifexpression_2 = null;
          Component _component = ((ComponentScope)scope).getComponent();
          String _name_1 = null;
          if (_component!=null) {
            _name_1=_component.getName();
          }
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name_1);
          if (_isNullOrEmpty_1) {
            _xifexpression_2 = "<component>";
          } else {
            Component _component_1 = ((ComponentScope)scope).getComponent();
            String _name_2 = _component_1.getName();
            _xifexpression_2 = ("Component " + _name_2);
          }
          _switchResult = _xifexpression_2;
        }
      }
      if (!_matched) {
        _switchResult = "?";
      }
      final String s3 = _switchResult;
      return (((((("CoherencyGroup " + s1) + " ") + s2) + " (Scope: ") + s3) + ")");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDataCoherencyGroupItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DataCoherencyGroup.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DATA_COHERENCY_GROUP__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DATA_COHERENCY_GROUP__DIRECTION)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DATA_COHERENCY_GROUP__SCOPE)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, true);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * EventChainReferenceItemProvider
   */
  public static String getEventChainReferenceItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof EventChainReference)) {
      EStructuralFeature _eContainingFeature = null;
      if (((EventChainReference)object)!=null) {
        _eContainingFeature=((EventChainReference)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      EventChain _eventChain = null;
      if (((EventChainReference)object)!=null) {
        _eventChain=((EventChainReference)object).getEventChain();
      }
      String _name = null;
      if (_eventChain!=null) {
        _name=_eventChain.getName();
      }
      final String chainName = _name;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name_1 = feature.getName();
        _xifexpression = (_name_1 + ": ");
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(chainName);
      if (_isNullOrEmpty) {
        _xifexpression_1 = "<chain>";
      } else {
        _xifexpression_1 = chainName;
      }
      final String s2 = _xifexpression_1;
      return (("Chain Ref " + s1) + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getEventChainReferenceItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(EventChainReference.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.EVENT_CHAIN_REFERENCE__EVENT_CHAIN)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * SubEventChainItemProvider
   */
  public static String getSubEventChainItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SubEventChain)) {
      EStructuralFeature _eContainingFeature = null;
      if (((SubEventChain)object)!=null) {
        _eContainingFeature=((SubEventChain)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      EventChain _eventChain = null;
      if (((SubEventChain)object)!=null) {
        _eventChain=((SubEventChain)object).getEventChain();
      }
      String _name = null;
      if (_eventChain!=null) {
        _name=_eventChain.getName();
      }
      final String chainName = _name;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name_1 = feature.getName();
        _xifexpression = (_name_1 + ":");
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(chainName);
      if (_isNullOrEmpty) {
        _xifexpression_1 = "<sub chain>";
      } else {
        _xifexpression_1 = ("Sub Chain " + chainName);
      }
      final String s2 = _xifexpression_1;
      return ((s1 + " ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSubEventChainItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SubEventChain.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SUB_EVENT_CHAIN__EVENT_CHAIN)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * TagGroupItemProvider
   */
  public static String getTagGroupItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TagGroup)) {
      Tag _tag = null;
      if (((TagGroup)object)!=null) {
        _tag=((TagGroup)object).getTag();
      }
      String _name = null;
      if (_tag!=null) {
        _name=_tag.getName();
      }
      final String tagName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(tagName);
      if (_isNullOrEmpty) {
        _xifexpression = "<tag>";
      } else {
        _xifexpression = (("\"" + tagName) + "\"");
      }
      final String s1 = _xifexpression;
      return ("Items with tag " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTagGroupItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TagGroup.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TAG_GROUP__TAG)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * TargetCallSequenceItemProvider
   */
  public static String getTargetCallSequenceItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TargetCallSequence)) {
      EList<CallSequence> _callSequences = null;
      if (((TargetCallSequence)object)!=null) {
        _callSequences=((TargetCallSequence)object).getCallSequences();
      }
      final EList<CallSequence> seq = _callSequences;
      String _xifexpression = null;
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(seq);
      if (_isNullOrEmpty) {
        _xifexpression = "<call sequence>";
      } else {
        final Function1<CallSequence, String> _function = (CallSequence it) -> {
          return it.getName();
        };
        List<String> _map = ListExtensions.<CallSequence, String>map(seq, _function);
        final Function1<String, Boolean> _function_1 = (String it) -> {
          return Boolean.valueOf(StringExtensions.isNullOrEmpty(it));
        };
        Iterable<String> _filter = IterableExtensions.<String>filter(_map, _function_1);
        String _join = IterableExtensions.join(_filter, ", ");
        String _plus = (" [" + _join);
        _xifexpression = (_plus + "]");
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * HwAccessPathItemProvider
   */
  public static String getHwAccessPathItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof HwAccessPath)) {
      String _name = null;
      if (((HwAccessPath)object)!=null) {
        _name=((HwAccessPath)object).getName();
      }
      final String name = _name;
      ComplexNode _source = null;
      if (((HwAccessPath)object)!=null) {
        _source=((HwAccessPath)object).getSource();
      }
      String _name_1 = null;
      if (_source!=null) {
        _name_1=_source.getName();
      }
      final String sourceName = _name_1;
      ComplexNode _target = null;
      if (((HwAccessPath)object)!=null) {
        _target=((HwAccessPath)object).getTarget();
      }
      String _name_2 = null;
      if (_target!=null) {
        _name_2=_target.getName();
      }
      final String targetName = _name_2;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<path>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(sourceName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<source>";
      } else {
        _xifexpression_1 = sourceName;
      }
      final String s2 = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(targetName);
      if (_isNullOrEmpty_2) {
        _xifexpression_2 = "<target>";
      } else {
        _xifexpression_2 = targetName;
      }
      final String s3 = _xifexpression_2;
      return ((((("AccessPath (Hardware) " + s1) + " : ") + s2) + " --> ") + s3);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getHwAccessPathItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(HwAccessPath.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.HW_ACCESS_PATH__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.HW_ACCESS_PATH__SOURCE)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.HW_ACCESS_PATH__TARGET)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.HW_ACCESS_PATH__HW_ELEMENTS)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * AccessPathRefItemProvider
   */
  public static String getAccessPathRefItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof AccessPathRef)) {
      LatencyAccessPath _ref = null;
      if (((AccessPathRef)object)!=null) {
        _ref=((AccessPathRef)object).getRef();
      }
      String _name = null;
      if (_ref!=null) {
        _name=_ref.getName();
      }
      final String refName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(refName);
      if (_isNullOrEmpty) {
        _xifexpression = "<path ref>";
      } else {
        _xifexpression = ("Path " + refName);
      }
      final String s1 = _xifexpression;
      return ("Ref -> " + s1);
    } else {
      return defaultText;
    }
  }
  
  /**
   * HwAccessPathRefItemProvider
   */
  public static String getHwAccessPathRefItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof HwAccessPathRef)) {
      HwAccessPath _ref = null;
      if (((HwAccessPathRef)object)!=null) {
        _ref=((HwAccessPathRef)object).getRef();
      }
      final HwAccessPath ref = _ref;
      String _xifexpression = null;
      boolean _equals = Objects.equal(ref, null);
      if (_equals) {
        _xifexpression = "<path ref>";
      } else {
        String _name = ref.getName();
        _xifexpression = ("Path " + _name);
      }
      final String s1 = _xifexpression;
      return ("Ref -> " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getHwAccessPathRefItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(HwAccessPathRef.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.HW_ACCESS_PATH_REF__REF)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * HwElementRefItemProvider
   */
  public static String getHwElementRefItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof HwElementRef)) {
      ComplexPort _port = null;
      if (((HwElementRef)object)!=null) {
        _port=((HwElementRef)object).getPort();
      }
      String _name = null;
      if (_port!=null) {
        _name=_port.getName();
      }
      final String portName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(portName);
      if (_isNullOrEmpty) {
        _xifexpression = "<port>";
      } else {
        _xifexpression = ("Port " + portName);
      }
      final String s1 = _xifexpression;
      return ("Ref -> " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getHwElementRefItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(HwElementRef.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.HW_ELEMENT_REF__PORT)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * LatencyAccessPathItemProvider
   */
  public static String getLatencyAccessPathItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof LatencyAccessPath)) {
      String _name = null;
      if (((LatencyAccessPath)object)!=null) {
        _name=((LatencyAccessPath)object).getName();
      }
      final String name = _name;
      ComplexNode _source = null;
      if (((LatencyAccessPath)object)!=null) {
        _source=((LatencyAccessPath)object).getSource();
      }
      String _name_1 = null;
      if (_source!=null) {
        _name_1=_source.getName();
      }
      final String sourceName = _name_1;
      ComplexNode _target = null;
      if (((LatencyAccessPath)object)!=null) {
        _target=((LatencyAccessPath)object).getTarget();
      }
      String _name_2 = null;
      if (_target!=null) {
        _name_2=_target.getName();
      }
      final String targetName = _name_2;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<path>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(sourceName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<source>";
      } else {
        _xifexpression_1 = sourceName;
      }
      final String s2 = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(targetName);
      if (_isNullOrEmpty_2) {
        _xifexpression_2 = "<target>";
      } else {
        _xifexpression_2 = targetName;
      }
      final String s3 = _xifexpression_2;
      return ((((("AccessPath (Latency) " + s1) + " : ") + s2) + " --> ") + s3);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getLatencyAccessPathItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(LatencyAccessPath.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.LATENCY_ACCESS_PATH__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.LATENCY_ACCESS_PATH__SOURCE)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.LATENCY_ACCESS_PATH__TARGET)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.LATENCY_ACCESS_PATH__LATENCIES)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * LatencyConstantItemProvider
   */
  public static String getLatencyConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof LatencyConstant)) {
      RWType _accessType = null;
      if (((LatencyConstant)object)!=null) {
        _accessType=((LatencyConstant)object).getAccessType();
      }
      final RWType type = _accessType;
      long _xifexpression = (long) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((LatencyConstant)object).getValue();
      }
      final long value = _xifexpression;
      String _xifexpression_1 = null;
      if ((Objects.equal(type, null) || Objects.equal(type, RWType._UNDEFINED_))) {
        _xifexpression_1 = "?";
      } else {
        _xifexpression_1 = type.getLiteral();
      }
      final String s1 = _xifexpression_1;
      final String s2 = Long.toString(value);
      return ((("Access: " + s1) + " -- Latency (constant): ") + s2);
    } else {
      return defaultText;
    }
  }
  
  /**
   * LatencyDeviationItemProvider
   */
  public static String getLatencyDeviationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof LatencyDeviation)) {
      RWType _accessType = null;
      if (((LatencyDeviation)object)!=null) {
        _accessType=((LatencyDeviation)object).getAccessType();
      }
      final RWType type = _accessType;
      Deviation<LongObject> _deviation = null;
      if (((LatencyDeviation)object)!=null) {
        _deviation=((LatencyDeviation)object).getDeviation();
      }
      Distribution<LongObject> _distribution = null;
      if (_deviation!=null) {
        _distribution=_deviation.getDistribution();
      }
      EClass _eClass = null;
      if (_distribution!=null) {
        _eClass=_distribution.eClass();
      }
      String _name = null;
      if (_eClass!=null) {
        _name=_eClass.getName();
      }
      final String distName = _name;
      String _xifexpression = null;
      if ((Objects.equal(type, null) || Objects.equal(type, RWType._UNDEFINED_))) {
        _xifexpression = "?";
      } else {
        _xifexpression = type.getLiteral();
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(distName);
      if (_isNullOrEmpty) {
        _xifexpression_1 = "<distribution>";
      } else {
        _xifexpression_1 = distName;
      }
      final String s2 = _xifexpression_1;
      return ((("Access: " + s1) + " -- Latency (deviation): ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getLatencyDeviationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(LatencyDeviation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.LATENCY_DEVIATION__ACCESS_TYPE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.LATENCY_DEVIATION__DEVIATION)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * MappingModelItemProvider
   */
  public static String getMappingModelItemProviderText(final Object object, final String defaultText) {
    return "Mapping";
  }
  
  /**
   * CoreAllocationItemProvider
   */
  public static String getCoreAllocationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof CoreAllocation)) {
      Scheduler _scheduler = null;
      if (((CoreAllocation)object)!=null) {
        _scheduler=((CoreAllocation)object).getScheduler();
      }
      String _name = null;
      if (_scheduler!=null) {
        _name=_scheduler.getName();
      }
      final String schedName = _name;
      EList<Core> _core = null;
      if (((CoreAllocation)object)!=null) {
        _core=((CoreAllocation)object).getCore();
      }
      final EList<Core> cores = _core;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(schedName);
      if (_isNullOrEmpty) {
        _xifexpression = "<scheduler>";
      } else {
        _xifexpression = ("Scheduler " + schedName);
      }
      final String s1 = _xifexpression;
      final Function1<Core, String> _function = (Core it) -> {
        String _xifexpression_1 = null;
        String _name_1 = it.getName();
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name_1);
        if (_isNullOrEmpty_1) {
          _xifexpression_1 = "???";
        } else {
          _xifexpression_1 = it.getName();
        }
        return _xifexpression_1;
      };
      List<String> _map = ListExtensions.<Core, String>map(cores, _function);
      final String s2 = IterableExtensions.join(_map, ", ");
      return (((("Allocation: " + s1) + " -- Cores ( ") + s2) + " )");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getCoreAllocationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(CoreAllocation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CORE_ALLOCATION__SCHEDULER)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CORE_ALLOCATION__CORE)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CORE_ALLOCATION__CUSTOM_PROPERTIES)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * ISRAllocationItemProvider
   */
  public static String getISRAllocationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ISRAllocation)) {
      InterruptController _controller = null;
      if (((ISRAllocation)object)!=null) {
        _controller=((ISRAllocation)object).getController();
      }
      String _name = null;
      if (_controller!=null) {
        _name=_controller.getName();
      }
      final String ctrlName = _name;
      ISR _isr = null;
      if (((ISRAllocation)object)!=null) {
        _isr=((ISRAllocation)object).getIsr();
      }
      String _name_1 = null;
      if (_isr!=null) {
        _name_1=_isr.getName();
      }
      final String isrName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(ctrlName);
      if (_isNullOrEmpty) {
        _xifexpression = "<controller>";
      } else {
        _xifexpression = ("Controller " + ctrlName);
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(isrName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<isr>";
      } else {
        _xifexpression_1 = ("ISR " + isrName);
      }
      final String s2 = _xifexpression_1;
      return ((("Allocation: " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getISRAllocationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ISRAllocation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ISR_ALLOCATION__CONTROLLER)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ISR_ALLOCATION__ISR)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * RunnableAllocationItemProvider
   */
  public static String getRunnableAllocationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof RunnableAllocation)) {
      Scheduler _scheduler = null;
      if (((RunnableAllocation)object)!=null) {
        _scheduler=((RunnableAllocation)object).getScheduler();
      }
      String _name = null;
      if (_scheduler!=null) {
        _name=_scheduler.getName();
      }
      final String schedName = _name;
      org.eclipse.app4mc.amalthea.model.Runnable _entity = null;
      if (((RunnableAllocation)object)!=null) {
        _entity=((RunnableAllocation)object).getEntity();
      }
      String _name_1 = null;
      if (_entity!=null) {
        _name_1=_entity.getName();
      }
      final String entityName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(schedName);
      if (_isNullOrEmpty) {
        _xifexpression = "<scheduler>";
      } else {
        _xifexpression = ("Scheduler " + schedName);
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(entityName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<runnable>";
      } else {
        _xifexpression_1 = ("Runnable " + entityName);
      }
      final String s2 = _xifexpression_1;
      return ((("Allocation: " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getRunnableAllocationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(RunnableAllocation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_ALLOCATION__ENTITY)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_ALLOCATION__SCHEDULER)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * TaskAllocationItemProvider
   */
  public static String getTaskAllocationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TaskAllocation)) {
      TaskScheduler _scheduler = null;
      if (((TaskAllocation)object)!=null) {
        _scheduler=((TaskAllocation)object).getScheduler();
      }
      String _name = null;
      if (_scheduler!=null) {
        _name=_scheduler.getName();
      }
      final String schedName = _name;
      Task _task = null;
      if (((TaskAllocation)object)!=null) {
        _task=((TaskAllocation)object).getTask();
      }
      String _name_1 = null;
      if (_task!=null) {
        _name_1=_task.getName();
      }
      final String taskName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(schedName);
      if (_isNullOrEmpty) {
        _xifexpression = "<scheduler>";
      } else {
        _xifexpression = ("Scheduler " + schedName);
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(taskName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<task>";
      } else {
        _xifexpression_1 = ("Task " + taskName);
      }
      final String s2 = _xifexpression_1;
      return ((("Allocation: " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTaskAllocationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TaskAllocation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TASK_ALLOCATION__TASK)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TASK_ALLOCATION__SCHEDULER)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * AbstractElementMappingItemProvider
   */
  public static String getAbstractElementMappingItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof AbstractElementMapping)) {
      Memory _memory = null;
      if (((AbstractElementMapping)object)!=null) {
        _memory=((AbstractElementMapping)object).getMemory();
      }
      String _name = null;
      if (_memory!=null) {
        _name=_memory.getName();
      }
      final String memName = _name;
      AbstractElementMemoryInformation _abstractElement = null;
      if (((AbstractElementMapping)object)!=null) {
        _abstractElement=((AbstractElementMapping)object).getAbstractElement();
      }
      final AbstractElementMemoryInformation elem = _abstractElement;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(memName);
      if (_isNullOrEmpty) {
        _xifexpression = "<memory>";
      } else {
        _xifexpression = ("Memory " + memName);
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      String _name_1 = null;
      if (elem!=null) {
        _name_1=elem.getName();
      }
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name_1);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<element>";
      } else {
        EClass _eClass = elem.eClass();
        String _name_2 = _eClass.getName();
        String _plus = (_name_2 + " ");
        String _name_3 = elem.getName();
        _xifexpression_1 = (_plus + _name_3);
      }
      final String s2 = _xifexpression_1;
      return ((("Mapping: " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getAbstractElementMappingItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(AbstractElementMapping.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__MEMORY)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * SectionMappingItemProvider
   */
  public static String getSectionMappingItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SectionMapping)) {
      Memory _memory = null;
      if (((SectionMapping)object)!=null) {
        _memory=((SectionMapping)object).getMemory();
      }
      String _name = null;
      if (_memory!=null) {
        _name=_memory.getName();
      }
      final String memName = _name;
      Section _section = null;
      if (((SectionMapping)object)!=null) {
        _section=((SectionMapping)object).getSection();
      }
      String _name_1 = null;
      if (_section!=null) {
        _name_1=_section.getName();
      }
      final String secName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(memName);
      if (_isNullOrEmpty) {
        _xifexpression = "<memory>";
      } else {
        _xifexpression = ("Memory " + memName);
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(secName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<section>";
      } else {
        _xifexpression_1 = ("Section " + secName);
      }
      final String s2 = _xifexpression_1;
      return ((("Mapping: " + s1) + " -- ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSectionMappingItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SectionMapping.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SECTION_MAPPING__MEMORY)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.SECTION_MAPPING__SECTION)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * OsAPIInstructionsItemProvider
   */
  public static String getOsAPIInstructionsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof OsAPIInstructions)) {
      EStructuralFeature _eContainingFeature = null;
      if (((OsAPIInstructions)object)!=null) {
        _eContainingFeature=((OsAPIInstructions)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "API Instructions";
      } else {
        _xifexpression = feature.getName();
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * OsBufferingItemProvider
   */
  public static String getOsBufferingItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof OsBuffering)) {
      String _bufferingAlgorithm = null;
      if (((OsBuffering)object)!=null) {
        _bufferingAlgorithm=((OsBuffering)object).getBufferingAlgorithm();
      }
      final String algo = _bufferingAlgorithm;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(algo);
      if (_isNullOrEmpty) {
        _xifexpression = "<algorithm>";
      } else {
        _xifexpression = algo;
      }
      final String s1 = _xifexpression;
      return ("OS Buffering " + s1);
    } else {
      return defaultText;
    }
  }
  
  /**
   * OsExecutionInstructionsConstantItemProvider
   */
  public static String getOsExecutionInstructionsConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof OsExecutionInstructionsConstant)) {
      EStructuralFeature _eContainingFeature = null;
      if (((OsExecutionInstructionsConstant)object)!=null) {
        _eContainingFeature=((OsExecutionInstructionsConstant)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "Execution Instructions (constant)";
      } else {
        _xifexpression = feature.getName();
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * OsExecutionInstructionsDeviationItemProvider
   */
  public static String getOsExecutionInstructionsDeviationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof OsExecutionInstructionsDeviation)) {
      EStructuralFeature _eContainingFeature = null;
      if (((OsExecutionInstructionsDeviation)object)!=null) {
        _eContainingFeature=((OsExecutionInstructionsDeviation)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "Execution Instructions (deviation)";
      } else {
        _xifexpression = feature.getName();
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * OsInstructionsItemProvider
   */
  public static String getOsInstructionsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof OsInstructions)) {
      String _name = null;
      if (((OsInstructions)object)!=null) {
        _name=((OsInstructions)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "OS Instructions";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * OsISRInstructionsItemProvider
   */
  public static String getOsISRInstructionsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof OsISRInstructions)) {
      EStructuralFeature _eContainingFeature = null;
      if (((OsISRInstructions)object)!=null) {
        _eContainingFeature=((OsISRInstructions)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        _xifexpression = feature.getName();
      }
      final String s1 = _xifexpression;
      return s1;
    } else {
      return defaultText;
    }
  }
  
  /**
   * ProcessPrototypeAllocationConstraintItemProvider
   */
  public static String getProcessPrototypeAllocationConstraintItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ProcessPrototypeAllocationConstraint)) {
      ProcessPrototype _processPrototype = null;
      if (((ProcessPrototypeAllocationConstraint)object)!=null) {
        _processPrototype=((ProcessPrototypeAllocationConstraint)object).getProcessPrototype();
      }
      String _name = null;
      if (_processPrototype!=null) {
        _name=_processPrototype.getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<process prototype>";
      } else {
        _xifexpression = ("Prototype " + name);
      }
      final String s1 = _xifexpression;
      return ("Constraint allocation of " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getProcessPrototypeAllocationConstraintItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ProcessPrototypeAllocationConstraint.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT__PROCESS_PROTOTYPE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ProcessAllocationConstraintItemProvider
   */
  public static String getProcessAllocationConstraintItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ProcessAllocationConstraint)) {
      org.eclipse.app4mc.amalthea.model.Process _process = null;
      if (((ProcessAllocationConstraint)object)!=null) {
        _process=((ProcessAllocationConstraint)object).getProcess();
      }
      final org.eclipse.app4mc.amalthea.model.Process proc = _process;
      String _xifexpression = null;
      String _name = null;
      if (proc!=null) {
        _name=proc.getName();
      }
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "<process>";
      } else {
        EClass _eClass = proc.eClass();
        String _name_1 = _eClass.getName();
        String _plus = (_name_1 + " ");
        String _name_2 = proc.getName();
        _xifexpression = (_plus + _name_2);
      }
      final String s1 = _xifexpression;
      return ("Constraint allocation of " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getProcessAllocationConstraintItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ProcessAllocationConstraint.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.PROCESS_ALLOCATION_CONSTRAINT__PROCESS)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * RunnableAllocationConstraintItemProvider
   */
  public static String getRunnableAllocationConstraintItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof RunnableAllocationConstraint)) {
      org.eclipse.app4mc.amalthea.model.Runnable _runnable = null;
      if (((RunnableAllocationConstraint)object)!=null) {
        _runnable=((RunnableAllocationConstraint)object).getRunnable();
      }
      String _name = null;
      if (_runnable!=null) {
        _name=_runnable.getName();
      }
      final String runName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(runName);
      if (_isNullOrEmpty) {
        _xifexpression = "<runnable>";
      } else {
        _xifexpression = ("Runnable " + runName);
      }
      final String s1 = _xifexpression;
      return ("Constraint allocation of " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getRunnableAllocationConstraintItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(RunnableAllocationConstraint.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_ALLOCATION_CONSTRAINT__RUNNABLE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * AbstractElementMappingConstraintItemProvider
   */
  public static String getAbstractElementMappingConstraintItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof AbstractElementMappingConstraint)) {
      AbstractElementMemoryInformation _abstractElement = null;
      if (((AbstractElementMappingConstraint)object)!=null) {
        _abstractElement=((AbstractElementMappingConstraint)object).getAbstractElement();
      }
      final AbstractElementMemoryInformation elem = _abstractElement;
      String _xifexpression = null;
      String _name = null;
      if (elem!=null) {
        _name=elem.getName();
      }
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "<element>";
      } else {
        EClass _eClass = elem.eClass();
        String _name_1 = _eClass.getName();
        String _plus = (_name_1 + " ");
        String _name_2 = elem.getName();
        _xifexpression = (_plus + _name_2);
      }
      final String s1 = _xifexpression;
      return ("Constraint mapping of " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getAbstractElementMappingConstraintItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(AbstractElementMappingConstraint.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * SectionMappingConstraintItemProvider
   */
  public static String getSectionMappingConstraintItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SectionMappingConstraint)) {
      Section _section = null;
      if (((SectionMappingConstraint)object)!=null) {
        _section=((SectionMappingConstraint)object).getSection();
      }
      String _name = null;
      if (_section!=null) {
        _name=_section.getName();
      }
      final String secName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(secName);
      if (_isNullOrEmpty) {
        _xifexpression = "<section>";
      } else {
        _xifexpression = ("Section " + secName);
      }
      final String s1 = _xifexpression;
      return ("Constraint mapping of " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSectionMappingConstraintItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SectionMappingConstraint.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SECTION_MAPPING_CONSTRAINT__SECTION)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ModeValueListItemProvider
   */
  public static String getModeValueListItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ModeValueList)) {
      EStructuralFeature _eContainingFeature = null;
      if (((ModeValueList)object)!=null) {
        _eContainingFeature=((ModeValueList)object).eContainingFeature();
      }
      final EStructuralFeature feature = _eContainingFeature;
      String _xifexpression = null;
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _name = feature.getName();
        _xifexpression = (_name + ": ");
      }
      final String s1 = _xifexpression;
      return (s1 + defaultText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ModeValueListEntryItemProvider
   */
  public static String getModeValueListEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ModeValueListEntry)) {
      ModeValueProvider _valueProvider = null;
      if (((ModeValueListEntry)object)!=null) {
        _valueProvider=((ModeValueListEntry)object).getValueProvider();
      }
      final ModeValueProvider prov = _valueProvider;
      ModeLiteral _value = null;
      if (((ModeValueListEntry)object)!=null) {
        _value=((ModeValueListEntry)object).getValue();
      }
      final ModeLiteral value = _value;
      String _xifexpression = null;
      String _name = null;
      if (prov!=null) {
        _name=prov.getName();
      }
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "<mode label>";
      } else {
        String _name_1 = prov.getName();
        _xifexpression = ("Mode Label " + _name_1);
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _equals = Objects.equal(value, null);
      if (_equals) {
        _xifexpression_1 = "<value>";
      } else {
        _xifexpression_1 = value.toString();
      }
      final String s2 = _xifexpression_1;
      return ((s1 + " == ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getModeValueListEntryItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ModeValueListEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ArrivalCurveEntryItemProvider
   */
  public static String getArrivalCurveEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ArrivalCurveEntry)) {
      int _xifexpression = (int) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((ArrivalCurveEntry)object).getNumberOfEvents();
      }
      final int numEvents = _xifexpression;
      Time _lowerTimeBorder = null;
      if (((ArrivalCurveEntry)object)!=null) {
        _lowerTimeBorder=((ArrivalCurveEntry)object).getLowerTimeBorder();
      }
      final String s1 = CustomItemProviderService.getTimeText(_lowerTimeBorder);
      Time _upperTimeBorder = null;
      if (((ArrivalCurveEntry)object)!=null) {
        _upperTimeBorder=((ArrivalCurveEntry)object).getUpperTimeBorder();
      }
      final String s2 = CustomItemProviderService.getTimeText(_upperTimeBorder);
      return ((((("#events: " + Integer.valueOf(numEvents)) + " -- interval: ") + s1) + ", ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getArrivalCurveEntryItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ArrivalCurveEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__NUMBER_OF_EVENTS)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER)) {
        _matched=true;
      }
      if (!_matched) {
        if (Objects.equal(_featureID, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER)) {
          _matched=true;
        }
      }
      if (_matched) {
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, true);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  private static String getRunnableItemText(final RunnableItem item) {
    String _switchResult = null;
    boolean _matched = false;
    if (item instanceof LabelAccess) {
      _matched=true;
      _switchResult = CustomItemProviderService.getLabelAccessItemProviderText(item, null);
    }
    if (!_matched) {
      if (item instanceof RunnableCall) {
        _matched=true;
        _switchResult = CustomItemProviderService.getRunnableCallItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof InstructionsConstant) {
        _matched=true;
        _switchResult = CustomItemProviderService.getInstructionsConstantItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof InstructionsDeviation) {
        _matched=true;
        _switchResult = CustomItemProviderService.getInstructionsDeviationItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof Group) {
        _matched=true;
        _switchResult = CustomItemProviderService.getGroupItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof ProbabilityGroup) {
        _matched=true;
        _switchResult = "Probability Group";
      }
    }
    if (!_matched) {
      if (item instanceof ModeLabelAccess) {
        _matched=true;
        _switchResult = CustomItemProviderService.getModeLabelAccessItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof SemaphoreAccess) {
        _matched=true;
        _switchResult = CustomItemProviderService.getSemaphoreAccessItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof SenderReceiverRead) {
        _matched=true;
        _switchResult = CustomItemProviderService.getSenderReceiverReadItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof SenderReceiverWrite) {
        _matched=true;
        _switchResult = CustomItemProviderService.getSenderReceiverWriteItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof AsynchronousServerCall) {
        _matched=true;
        _switchResult = CustomItemProviderService.getAsynchronousServerCallItemProviderText(item, null);
      }
    }
    if (!_matched) {
      if (item instanceof SynchronousServerCall) {
        _matched=true;
        _switchResult = CustomItemProviderService.getSynchronousServerCallItemProviderText(item, null);
      }
    }
    return _switchResult;
  }
  
  /**
   * AccessPrecedenceSpecItemProvider
   */
  public static String getAccessPrecedenceSpecItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof AccessPrecedenceSpec)) {
      org.eclipse.app4mc.amalthea.model.Runnable _origin = null;
      if (((AccessPrecedenceSpec)object)!=null) {
        _origin=((AccessPrecedenceSpec)object).getOrigin();
      }
      String _name = null;
      if (_origin!=null) {
        _name=_origin.getName();
      }
      final String originName = _name;
      org.eclipse.app4mc.amalthea.model.Runnable _target = null;
      if (((AccessPrecedenceSpec)object)!=null) {
        _target=((AccessPrecedenceSpec)object).getTarget();
      }
      String _name_1 = null;
      if (_target!=null) {
        _name_1=_target.getName();
      }
      final String targetName = _name_1;
      Label _label = null;
      if (((AccessPrecedenceSpec)object)!=null) {
        _label=((AccessPrecedenceSpec)object).getLabel();
      }
      String _name_2 = null;
      if (_label!=null) {
        _name_2=_label.getName();
      }
      final String labelName = _name_2;
      AccessPrecedenceType _orderType = null;
      if (((AccessPrecedenceSpec)object)!=null) {
        _orderType=((AccessPrecedenceSpec)object).getOrderType();
      }
      final AccessPrecedenceType accessType = _orderType;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(originName);
      if (_isNullOrEmpty) {
        _xifexpression = "<runnable>";
      } else {
        _xifexpression = originName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(targetName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<runnable>";
      } else {
        _xifexpression_1 = targetName;
      }
      final String s2 = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(labelName);
      if (_isNullOrEmpty_2) {
        _xifexpression_2 = "<label>";
      } else {
        _xifexpression_2 = labelName;
      }
      final String s3 = _xifexpression_2;
      String _xifexpression_3 = null;
      if ((Objects.equal(accessType, null) || Objects.equal(accessType, AccessPrecedenceType._UNDEFINED_))) {
        _xifexpression_3 = "<access>";
      } else {
        _xifexpression_3 = accessType.getLiteral();
      }
      final String s4 = _xifexpression_3;
      return (((((((("Spec: " + s1) + " --> ") + s2) + " (") + s3) + " : ") + s4) + ")");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getAccessPrecedenceSpecItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(AccessPrecedenceSpec.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ACCESS_PRECEDENCE_SPEC__ORDER_TYPE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ACCESS_PRECEDENCE_SPEC__ORIGIN)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ACCESS_PRECEDENCE_SPEC__TARGET)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ACCESS_PRECEDENCE_SPEC__LABEL)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * OrderPrecedenceSpecItemProvider
   */
  public static String getOrderPrecedenceSpecItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof OrderPrecedenceSpec)) {
      org.eclipse.app4mc.amalthea.model.Runnable _origin = null;
      if (((OrderPrecedenceSpec)object)!=null) {
        _origin=((OrderPrecedenceSpec)object).getOrigin();
      }
      String _name = null;
      if (_origin!=null) {
        _name=_origin.getName();
      }
      final String originName = _name;
      org.eclipse.app4mc.amalthea.model.Runnable _target = null;
      if (((OrderPrecedenceSpec)object)!=null) {
        _target=((OrderPrecedenceSpec)object).getTarget();
      }
      String _name_1 = null;
      if (_target!=null) {
        _name_1=_target.getName();
      }
      final String targetName = _name_1;
      OrderType _orderType = null;
      if (((OrderPrecedenceSpec)object)!=null) {
        _orderType=((OrderPrecedenceSpec)object).getOrderType();
      }
      final OrderType order = _orderType;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(originName);
      if (_isNullOrEmpty) {
        _xifexpression = "<Runnable>";
      } else {
        _xifexpression = originName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(targetName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<Runnable>";
      } else {
        _xifexpression_1 = targetName;
      }
      final String s2 = _xifexpression_1;
      String _xifexpression_2 = null;
      if ((Objects.equal(order, null) || Objects.equal(order, OrderType._UNDEFINED_))) {
        _xifexpression_2 = "<order>";
      } else {
        _xifexpression_2 = order.getLiteral();
      }
      final String s3 = _xifexpression_2;
      return (((((("Spec: " + s1) + " --> ") + s2) + " (") + s3) + ")");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getOrderPrecedenceSpecItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(OrderPrecedenceSpec.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ORDER_PRECEDENCE_SPEC__ORDER_TYPE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ORDER_PRECEDENCE_SPEC__ORIGIN)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ORDER_PRECEDENCE_SPEC__TARGET)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * AsynchronousServerCallItemProvider
   */
  public static String getAsynchronousServerCallItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof AsynchronousServerCall)) {
      org.eclipse.app4mc.amalthea.model.Runnable _serverRunnable = null;
      if (((AsynchronousServerCall)object)!=null) {
        _serverRunnable=((AsynchronousServerCall)object).getServerRunnable();
      }
      String _name = null;
      if (_serverRunnable!=null) {
        _name=_serverRunnable.getName();
      }
      final String serverRun = _name;
      org.eclipse.app4mc.amalthea.model.Runnable _resultRunnable = null;
      if (((AsynchronousServerCall)object)!=null) {
        _resultRunnable=((AsynchronousServerCall)object).getResultRunnable();
      }
      String _name_1 = null;
      if (_resultRunnable!=null) {
        _name_1=_resultRunnable.getName();
      }
      final String resultRun = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(serverRun);
      if (_isNullOrEmpty) {
        _xifexpression = "<runnable>";
      } else {
        _xifexpression = serverRun;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(resultRun);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<runnable>";
      } else {
        _xifexpression_1 = resultRun;
      }
      final String s2 = _xifexpression_1;
      return (((("call server: " + s1) + " (async - result: ") + s2) + ")");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getAsynchronousServerCallItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(AsynchronousServerCall.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * SynchronousServerCallItemProvider
   */
  public static String getSynchronousServerCallItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SynchronousServerCall)) {
      org.eclipse.app4mc.amalthea.model.Runnable _serverRunnable = null;
      if (((SynchronousServerCall)object)!=null) {
        _serverRunnable=((SynchronousServerCall)object).getServerRunnable();
      }
      String _name = null;
      if (_serverRunnable!=null) {
        _name=_serverRunnable.getName();
      }
      final String serverRun = _name;
      WaitingBehaviour _waitingBehaviour = null;
      if (((SynchronousServerCall)object)!=null) {
        _waitingBehaviour=((SynchronousServerCall)object).getWaitingBehaviour();
      }
      final WaitingBehaviour waiting = _waitingBehaviour;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(serverRun);
      if (_isNullOrEmpty) {
        _xifexpression = "<runnable>";
      } else {
        _xifexpression = serverRun;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      if ((Objects.equal(waiting, null) || Objects.equal(waiting, WaitingBehaviour._UNDEFINED_))) {
        _xifexpression_1 = "undefined";
      } else {
        _xifexpression_1 = waiting.getLiteral();
      }
      final String s2 = _xifexpression_1;
      return (((("call server: " + s1) + " (sync - ") + s2) + " waiting)");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSynchronousServerCallItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SynchronousServerCall.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ChainedProcessPrototypeItemProvider
   */
  public static String getChainedProcessPrototypeItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ChainedProcessPrototype)) {
      ProcessPrototype _prototype = null;
      if (((ChainedProcessPrototype)object)!=null) {
        _prototype=((ChainedProcessPrototype)object).getPrototype();
      }
      String _name = null;
      if (_prototype!=null) {
        _name=_prototype.getName();
      }
      final String proto = _name;
      int _xifexpression = (int) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((ChainedProcessPrototype)object).getApply();
      }
      final int apply = _xifexpression;
      int _xifexpression_1 = (int) 0;
      boolean _equals_1 = Objects.equal(object, null);
      if (_equals_1) {
        _xifexpression_1 = 0;
      } else {
        _xifexpression_1 = ((ChainedProcessPrototype)object).getOffset();
      }
      final int offset = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(proto);
      if (_isNullOrEmpty) {
        _xifexpression_2 = "<process prototype>";
      } else {
        _xifexpression_2 = proto;
      }
      final String s1 = _xifexpression_2;
      return (((((("Chained Prototype " + s1) + "(apply: ") + Integer.valueOf(apply)) + " offset: ") + Integer.valueOf(offset)) + ")");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getChainedProcessPrototypeItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ChainedProcessPrototype.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__PROTOTYPE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__APPLY)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__OFFSET)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * DeviationRunnableItemItemProvider
   */
  public static String getDeviationRunnableItemItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DeviationRunnableItem)) {
      RunnableItem _runnableItem = null;
      if (((DeviationRunnableItem)object)!=null) {
        _runnableItem=((DeviationRunnableItem)object).getRunnableItem();
      }
      final RunnableItem runItem = _runnableItem;
      final String s1 = "( distribution )";
      String _xifexpression = null;
      boolean _equals = Objects.equal(runItem, null);
      if (_equals) {
        _xifexpression = "<runnable item>";
      } else {
        _xifexpression = CustomItemProviderService.getRunnableItemText(runItem);
      }
      final String s2 = _xifexpression;
      return ((s1 + " ~~> ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDeviationRunnableItemItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DeviationRunnableItem.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * GroupItemProvider
   */
  public static String getGroupItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof Group)) {
      String _xifexpression = null;
      String _name = ((Group)object).getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = null;
      } else {
        _xifexpression = ((Group)object).getName();
      }
      final String name = _xifexpression;
      boolean _xifexpression_1 = false;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression_1 = false;
      } else {
        _xifexpression_1 = ((Group)object).isOrdered();
      }
      final boolean ordered = _xifexpression_1;
      String _xifexpression_2 = null;
      if (ordered) {
        _xifexpression_2 = "Sequence";
      } else {
        _xifexpression_2 = "Set";
      }
      final String result = _xifexpression_2;
      String _xifexpression_3 = null;
      boolean _equals_1 = Objects.equal(name, null);
      if (_equals_1) {
        _xifexpression_3 = result;
      } else {
        _xifexpression_3 = ((result + " ") + name);
      }
      return _xifexpression_3;
    }
    return null;
  }
  
  public static String getGroupItemProviderImageName(final Object object) {
    if ((object instanceof Group)) {
      boolean _xifexpression = false;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = false;
      } else {
        _xifexpression = ((Group)object).isOrdered();
      }
      final boolean ordered = _xifexpression;
      String _xifexpression_1 = null;
      if (ordered) {
        _xifexpression_1 = "ordered";
      } else {
        _xifexpression_1 = "unordered";
      }
      return ("Group_" + _xifexpression_1);
    }
    return null;
  }
  
  /**
   * InstructionsConstantItemProvider
   */
  public static String getInstructionsConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof InstructionsConstant)) {
      long _xifexpression = (long) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((InstructionsConstant)object).getValue();
      }
      final long instr = _xifexpression;
      String _string = Long.toString(instr);
      return ("instructions (constant): " + _string);
    } else {
      return defaultText;
    }
  }
  
  /**
   * InstructionsDeviationItemProvider
   */
  public static String getInstructionsDeviationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof InstructionsDeviation)) {
      Deviation<LongObject> _deviation = null;
      if (((InstructionsDeviation)object)!=null) {
        _deviation=((InstructionsDeviation)object).getDeviation();
      }
      Distribution<LongObject> _distribution = null;
      if (_deviation!=null) {
        _distribution=_deviation.getDistribution();
      }
      EClass _eClass = null;
      if (_distribution!=null) {
        _eClass=_distribution.eClass();
      }
      String _name = null;
      if (_eClass!=null) {
        _name=_eClass.getName();
      }
      final String distName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(distName);
      if (_isNullOrEmpty) {
        _xifexpression = "<distribution>";
      } else {
        _xifexpression = distName;
      }
      final String s1 = _xifexpression;
      return ("instructions (deviation): " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getInstructionsDeviationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(InstructionsDeviation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.INSTRUCTIONS_DEVIATION__DEVIATION)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * InterProcessActivationItemProvider
   */
  public static String getInterProcessActivationItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof InterProcessActivation)) {
      Stimulus _stimulus = null;
      if (((InterProcessActivation)object)!=null) {
        _stimulus=((InterProcessActivation)object).getStimulus();
      }
      String _name = null;
      if (_stimulus!=null) {
        _name=_stimulus.getName();
      }
      final String sitmulusName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(sitmulusName);
      if (_isNullOrEmpty) {
        _xifexpression = "<stimulus>";
      } else {
        _xifexpression = sitmulusName;
      }
      final String s1 = _xifexpression;
      return ("activate " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getInterProcessActivationItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(InterProcessActivation.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.INTER_PROCESS_ACTIVATION__STIMULUS)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ModeLiteralItemProvider
   */
  public static String getModeLiteralItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ModeLiteral)) {
      return ((ModeLiteral)object).toString();
    } else {
      return defaultText;
    }
  }
  
  /**
   * ModeSwitchItemProvider
   */
  public static String getModeSwitchItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ModeSwitch)) {
      ModeValueProvider _valueProvider = ((ModeSwitch)object).getValueProvider();
      String _name = null;
      if (_valueProvider!=null) {
        _name=_valueProvider.getName();
      }
      final String valueName = _name;
      ModeValueProvider _valueProvider_1 = ((ModeSwitch)object).getValueProvider();
      Mode _mode = null;
      if (_valueProvider_1!=null) {
        _mode=_valueProvider_1.getMode();
      }
      String _name_1 = null;
      if (_mode!=null) {
        _name_1=_mode.getName();
      }
      final String modeName = _name_1;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(valueName);
      if (_isNullOrEmpty) {
        _xifexpression = "<mode label>";
      } else {
        _xifexpression = valueName;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(modeName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<mode>";
      } else {
        _xifexpression_1 = modeName;
      }
      final String s2 = _xifexpression_1;
      return (((("Switch " + s1) + " (") + s2) + ")");
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getModeSwitchItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ModeSwitch.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.MODE_SWITCH__VALUE_PROVIDER)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.MODE_SWITCH__ENTRIES)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * ModeSwitchEntryItemProvider
   */
  public static String getModeSwitchEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ModeSwitchEntry)) {
      final boolean isDefault = ((ModeSwitchEntry)object).isDefault();
      ModeLiteral _value = null;
      if (((ModeSwitchEntry)object)!=null) {
        _value=((ModeSwitchEntry)object).getValue();
      }
      String _name = null;
      if (_value!=null) {
        _name=_value.getName();
      }
      final String valueName = _name;
      String _xifexpression = null;
      if (isDefault) {
        _xifexpression = "default: ";
      } else {
        _xifexpression = "case: ";
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(valueName);
      if (_isNullOrEmpty) {
        _xifexpression_1 = "<mode literal>";
      } else {
        _xifexpression_1 = valueName;
      }
      final String s2 = _xifexpression_1;
      return (s1 + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getModeSwitchEntryItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ModeSwitchEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.MODE_SWITCH_ENTRY__DEFAULT)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.MODE_SWITCH_ENTRY__VALUE)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * TaskRunnableCallItemProvider
   */
  public static String getTaskRunnableCallItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TaskRunnableCall)) {
      org.eclipse.app4mc.amalthea.model.Runnable _runnable = null;
      if (((TaskRunnableCall)object)!=null) {
        _runnable=((TaskRunnableCall)object).getRunnable();
      }
      String _name = null;
      if (_runnable!=null) {
        _name=_runnable.getName();
      }
      final String runName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(runName);
      if (_isNullOrEmpty) {
        _xifexpression = "<runnable>";
      } else {
        _xifexpression = runName;
      }
      final String s1 = _xifexpression;
      return ("call " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTaskRunnableCallItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TaskRunnableCall.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TASK_RUNNABLE_CALL__RUNNABLE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TASK_RUNNABLE_CALL__STATISTIC)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * LabelAccessItemProvider
   */
  public static String getLabelAccessItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof LabelAccess)) {
      LabelAccessEnum _access = null;
      if (((LabelAccess)object)!=null) {
        _access=((LabelAccess)object).getAccess();
      }
      final LabelAccessEnum access = _access;
      Label _data = null;
      if (((LabelAccess)object)!=null) {
        _data=((LabelAccess)object).getData();
      }
      String _name = null;
      if (_data!=null) {
        _name=_data.getName();
      }
      final String labelName = _name;
      String _xifexpression = null;
      if ((Objects.equal(access, null) || Objects.equal(access, LabelAccessEnum._UNDEFINED_))) {
        _xifexpression = "<access>";
      } else {
        _xifexpression = access.getLiteral();
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(labelName);
      if (_isNullOrEmpty) {
        _xifexpression_1 = "<label>";
      } else {
        _xifexpression_1 = labelName;
      }
      final String s2 = _xifexpression_1;
      return ((s1 + " ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getLabelAccessItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(LabelAccess.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.LABEL_ACCESS__ACCESS)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.LABEL_ACCESS__DATA)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.LABEL_ACCESS__STATISTIC)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * SemaphoreAccessItemProvider
   */
  public static String getSemaphoreAccessItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SemaphoreAccess)) {
      SemaphoreAccessEnum _access = null;
      if (((SemaphoreAccess)object)!=null) {
        _access=((SemaphoreAccess)object).getAccess();
      }
      final SemaphoreAccessEnum access = _access;
      Semaphore _semaphore = null;
      if (((SemaphoreAccess)object)!=null) {
        _semaphore=((SemaphoreAccess)object).getSemaphore();
      }
      String _name = null;
      if (_semaphore!=null) {
        _name=_semaphore.getName();
      }
      final String semName = _name;
      String _xifexpression = null;
      if ((Objects.equal(access, null) || Objects.equal(access, SemaphoreAccessEnum._UNDEFINED_))) {
        _xifexpression = "<access>";
      } else {
        _xifexpression = access.getLiteral();
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(semName);
      if (_isNullOrEmpty) {
        _xifexpression_1 = "<semaphore>";
      } else {
        _xifexpression_1 = semName;
      }
      final String s2 = _xifexpression_1;
      return ((s1 + " ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSemaphoreAccessItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SemaphoreAccess.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SEMAPHORE_ACCESS__ACCESS)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * ModeLabelAccessItemProvider
   */
  public static String getModeLabelAccessItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ModeLabelAccess)) {
      LabelAccessEnum _access = null;
      if (((ModeLabelAccess)object)!=null) {
        _access=((ModeLabelAccess)object).getAccess();
      }
      final LabelAccessEnum access = _access;
      ModeLabel _data = null;
      if (((ModeLabelAccess)object)!=null) {
        _data=((ModeLabelAccess)object).getData();
      }
      String _name = null;
      if (_data!=null) {
        _name=_data.getName();
      }
      final String label = _name;
      String _xifexpression = null;
      if ((Objects.equal(access, null) || Objects.equal(access, LabelAccessEnum._UNDEFINED_))) {
        _xifexpression = "<access>";
      } else {
        _xifexpression = access.getLiteral();
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(label);
      if (_isNullOrEmpty) {
        _xifexpression_1 = "<mode label>";
      } else {
        _xifexpression_1 = label;
      }
      final String s2 = _xifexpression_1;
      return ((s1 + " ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getModeLabelAccessItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ModeLabelAccess.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.MODE_LABEL_ACCESS__ACCESS)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.MODE_LABEL_ACCESS__DATA)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * RunnableCallItemProvider
   */
  public static String getRunnableCallItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof RunnableCall)) {
      org.eclipse.app4mc.amalthea.model.Runnable _runnable = null;
      if (((RunnableCall)object)!=null) {
        _runnable=((RunnableCall)object).getRunnable();
      }
      String _name = null;
      if (_runnable!=null) {
        _name=_runnable.getName();
      }
      final String runName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(runName);
      if (_isNullOrEmpty) {
        _xifexpression = "<runnable>";
      } else {
        _xifexpression = runName;
      }
      final String s1 = _xifexpression;
      return ("call " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getRunnableCallItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(RunnableCall.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_CALL__RUNNABLE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.RUNNABLE_CALL__STATISTIC)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, false);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * ProbabilityRunnableItemItemProvider
   */
  public static String getProbabilityRunnableItemItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ProbabilityRunnableItem)) {
      int _xifexpression = (int) 0;
      boolean _equals = Objects.equal(object, null);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = ((ProbabilityRunnableItem)object).getProbability();
      }
      final int probability = _xifexpression;
      RunnableItem _runnableItem = null;
      if (((ProbabilityRunnableItem)object)!=null) {
        _runnableItem=((ProbabilityRunnableItem)object).getRunnableItem();
      }
      final RunnableItem runItem = _runnableItem;
      final String s1 = (("(" + Integer.valueOf(probability)) + ")");
      String _xifexpression_1 = null;
      boolean _equals_1 = Objects.equal(runItem, null);
      if (_equals_1) {
        _xifexpression_1 = "<runnable item>";
      } else {
        _xifexpression_1 = CustomItemProviderService.getRunnableItemText(runItem);
      }
      final String s2 = _xifexpression_1;
      return ((s1 + " ~~> ") + s2);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getProbabilityRunnableItemItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ProbabilityRunnableItem.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__PROBABILITY)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM)) {
        _matched=true;
        Object _notifier_1 = notification.getNotifier();
        ViewerNotification _viewerNotification_1 = new ViewerNotification(notification, _notifier_1, true, true);
        list.add(_viewerNotification_1);
      }
    }
    return list;
  }
  
  /**
   * SenderReceiverReadItemProvider
   */
  public static String getSenderReceiverReadItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SenderReceiverRead)) {
      Label _label = null;
      if (((SenderReceiverRead)object)!=null) {
        _label=((SenderReceiverRead)object).getLabel();
      }
      String _name = null;
      if (_label!=null) {
        _name=_label.getName();
      }
      final String labelName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(labelName);
      if (_isNullOrEmpty) {
        _xifexpression = "<label>";
      } else {
        _xifexpression = ("Label " + labelName);
      }
      final String s1 = _xifexpression;
      return ("Sender Receiver - Read " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSenderReceiverReadItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SenderReceiverRead.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SENDER_RECEIVER_READ__LABEL)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * SenderReceiverWriteItemProvider
   */
  public static String getSenderReceiverWriteItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SenderReceiverWrite)) {
      Label _label = null;
      if (((SenderReceiverWrite)object)!=null) {
        _label=((SenderReceiverWrite)object).getLabel();
      }
      String _name = null;
      if (_label!=null) {
        _name=_label.getName();
      }
      final String labelName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(labelName);
      if (_isNullOrEmpty) {
        _xifexpression = "<label>";
      } else {
        _xifexpression = ("Label " + labelName);
      }
      final String s1 = _xifexpression;
      return ("Sender Receiver - Write " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSenderReceiverWriteItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SenderReceiverWrite.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SENDER_RECEIVER_WRITE__LABEL)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * SetEventItemProvider
   */
  public static String getSetEventItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof SetEvent)) {
      org.eclipse.app4mc.amalthea.model.Process _process = null;
      if (((SetEvent)object)!=null) {
        _process=((SetEvent)object).getProcess();
      }
      final org.eclipse.app4mc.amalthea.model.Process proc = _process;
      String _xifexpression = null;
      String _name = null;
      if (proc!=null) {
        _name=proc.getName();
      }
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "<process>";
      } else {
        EClass _eClass = proc.eClass();
        String _name_1 = _eClass.getName();
        String _plus = (_name_1 + " ");
        String _name_2 = proc.getName();
        _xifexpression = (_plus + _name_2);
      }
      final String s1 = _xifexpression;
      return ("SetEvent " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getSetEventItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(SetEvent.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.SET_EVENT__PROCESS)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * WaitEventItemProvider
   */
  public static String getWaitEventItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof WaitEvent)) {
      WaitingBehaviour _waitingBehaviour = null;
      if (((WaitEvent)object)!=null) {
        _waitingBehaviour=((WaitEvent)object).getWaitingBehaviour();
      }
      final WaitingBehaviour waiting = _waitingBehaviour;
      String _xifexpression = null;
      if ((Objects.equal(waiting, null) || Objects.equal(waiting, WaitingBehaviour._UNDEFINED_))) {
        _xifexpression = "<waiting>";
      } else {
        _xifexpression = waiting.getLiteral();
      }
      final String s1 = _xifexpression;
      return ("WaitEvent " + s1);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ClearEventItemProvider
   */
  public static String getClearEventItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ClearEvent)) {
      return "ClearEvent";
    } else {
      return defaultText;
    }
  }
  
  /**
   * BaseTypeDefinitionItemProvider
   */
  public static String getBaseTypeDefinitionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof BaseTypeDefinition)) {
      String _name = null;
      if (((BaseTypeDefinition)object)!=null) {
        _name=((BaseTypeDefinition)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<type definition>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return ("BaseType " + s1);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TypeDefinitionItemProvider
   */
  public static String getTypeDefinitionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TypeDefinition)) {
      String _name = null;
      if (((TypeDefinition)object)!=null) {
        _name=((TypeDefinition)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<type definition>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return ("Type " + s1);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TypeRefItemProvider
   */
  public static String getTypeRefItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TypeRef)) {
      TypeDefinition _typeDef = null;
      if (((TypeRef)object)!=null) {
        _typeDef=((TypeRef)object).getTypeDef();
      }
      String _name = null;
      if (_typeDef!=null) {
        _name=_typeDef.getName();
      }
      final String typeName = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(typeName);
      if (_isNullOrEmpty) {
        _xifexpression = "<type definition>";
      } else {
        _xifexpression = typeName;
      }
      final String s1 = _xifexpression;
      return ("TypeRef " + s1);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTypeRefItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TypeRef.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TYPE_REF__TYPE_DEF)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
    }
    return list;
  }
  
  /**
   * DataPlatformMappingItemProvider
   */
  public static String getDataPlatformMappingItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DataPlatformMapping)) {
      String _platformName = null;
      if (((DataPlatformMapping)object)!=null) {
        _platformName=((DataPlatformMapping)object).getPlatformName();
      }
      final String name = _platformName;
      String _platformType = null;
      if (((DataPlatformMapping)object)!=null) {
        _platformType=((DataPlatformMapping)object).getPlatformType();
      }
      final String typeName = _platformType;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "<platform>";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(typeName);
      if (_isNullOrEmpty_1) {
        _xifexpression_1 = "<type>";
      } else {
        _xifexpression_1 = typeName;
      }
      final String s2 = _xifexpression_1;
      return ((("Platform Mapping: " + s1) + " --> ") + s2);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DataTypeDefinitionItemProvider
   */
  public static String getDataTypeDefinitionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DataTypeDefinition)) {
      String _name = null;
      if (((DataTypeDefinition)object)!=null) {
        _name=((DataTypeDefinition)object).getName();
      }
      final String name = _name;
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        _xifexpression = "???";
      } else {
        _xifexpression = name;
      }
      final String s1 = _xifexpression;
      return ("DataType " + s1);
    } else {
      return defaultText;
    }
  }
}
