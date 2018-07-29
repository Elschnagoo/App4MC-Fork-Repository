/**
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 */
package org.eclipse.app4mc.amalthea.visualization.hw.templates;

import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class HWBlockDiagramCreator {
  public CharSequence generateLevel(final HWModel model, final HwStructure s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(s.getName());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("frame \"");
        String _name = s.getName();
        _builder.append(_name, "\t");
        _builder.append("\" as ");
        String _convertFluxString = this.convertFluxString(s.getName());
        _builder.append(_convertFluxString, "\t");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          boolean _isEmpty = s.getModules().isEmpty();
          boolean _not_1 = (!_isEmpty);
          if (_not_1) {
            {
              EList<HwModule> _modules = s.getModules();
              for(final HwModule m : _modules) {
                {
                  boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(m.getName());
                  boolean _not_2 = (!_isNullOrEmpty_1);
                  if (_not_2) {
                    {
                      if ((m instanceof ProcessingUnit)) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("[");
                        String _convertFluxString_1 = this.convertFluxString(((ProcessingUnit)m).getName());
                        _builder.append(_convertFluxString_1, "\t\t");
                        _builder.append("] as ");
                        String _convertFluxString_2 = this.convertFluxString(((ProcessingUnit)m).getName());
                        _builder.append(_convertFluxString_2, "\t\t");
                        _builder.append(" <<ProcessingUnit>>");
                        _builder.newLineIfNotEmpty();
                      } else {
                        if ((m instanceof Memory)) {
                          _builder.append("\t");
                          _builder.append("\t");
                          _builder.append("[");
                          String _convertFluxString_3 = this.convertFluxString(((Memory)m).getName());
                          _builder.append(_convertFluxString_3, "\t\t");
                          _builder.append("] as ");
                          String _convertFluxString_4 = this.convertFluxString(((Memory)m).getName());
                          _builder.append(_convertFluxString_4, "\t\t");
                          _builder.append(" <<Memory>>");
                          _builder.newLineIfNotEmpty();
                        } else {
                          if ((m instanceof ConnectionHandler)) {
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("[");
                            String _convertFluxString_5 = this.convertFluxString(((ConnectionHandler)m).getName());
                            _builder.append(_convertFluxString_5, "\t\t");
                            _builder.append("] as ");
                            String _convertFluxString_6 = this.convertFluxString(((ConnectionHandler)m).getName());
                            _builder.append(_convertFluxString_6, "\t\t");
                            _builder.append(" <<ConnectionHandler>>");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("[");
                            String _convertFluxString_7 = this.convertFluxString(m.getName());
                            _builder.append(_convertFluxString_7, "\t\t");
                            _builder.append("] as ");
                            String _convertFluxString_8 = this.convertFluxString(m.getName());
                            _builder.append(_convertFluxString_8, "\t\t");
                            _builder.append(" <<Cache>>");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    Shell _activeShell = Display.getDefault().getActiveShell();
                    String _string = m.toString();
                    String _plus = ("Missing HW Module name: " + _string);
                    MessageDialog.openError(_activeShell, "AMALTHEA HW Visualization", _plus);
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        {
          EList<HwStructure> _structures = s.getStructures();
          for(final HwStructure su : _structures) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _generateLevel = this.generateLevel(model, su);
            _builder.append(_generateLevel, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t");
        Shell _activeShell_1 = Display.getDefault().getActiveShell();
        String _string_1 = s.toString();
        String _plus_1 = ("Name of HwStructure is missing " + _string_1);
        MessageDialog.openError(_activeShell_1, "AMALTHEA HW Visualization", _plus_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\' add physical connections:");
    _builder.newLine();
    {
      boolean _isEmpty_1 = s.getConnections().isEmpty();
      boolean _not_3 = (!_isEmpty_1);
      if (_not_3) {
        {
          EList<HwConnection> _connections = s.getConnections();
          for(final HwConnection c : _connections) {
            {
              boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(c.getName());
              boolean _not_4 = (!_isNullOrEmpty_2);
              if (_not_4) {
                _builder.append("\t");
                _builder.append("\' ");
                EObject _eContainer = c.getPort1().eContainer();
                String _convertFluxString_9 = this.convertFluxString(((ReferableBaseObject) _eContainer).getName());
                _builder.append(_convertFluxString_9, "\t");
                _builder.append(" - ");
                EObject _eContainer_1 = c.getPort2().eContainer();
                String _convertFluxString_10 = this.convertFluxString(((ReferableBaseObject) _eContainer_1).getName());
                _builder.append(_convertFluxString_10, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                EObject _eContainer_2 = c.getPort1().eContainer();
                String _convertFluxString_11 = this.convertFluxString(((ReferableBaseObject) _eContainer_2).getName());
                _builder.append(_convertFluxString_11, "\t");
                _builder.append(" -- ");
                EObject _eContainer_3 = c.getPort2().eContainer();
                String _convertFluxString_12 = this.convertFluxString(((ReferableBaseObject) _eContainer_3).getName());
                _builder.append(_convertFluxString_12, "\t");
                _builder.append(" : ");
                String _name_1 = c.getName();
                _builder.append(_name_1, "\t");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\' ");
                EObject _eContainer_4 = c.getPort1().eContainer();
                String _convertFluxString_13 = this.convertFluxString(((ReferableBaseObject) _eContainer_4).getName());
                _builder.append(_convertFluxString_13, "\t");
                _builder.append(" - ");
                EObject _eContainer_5 = c.getPort2().eContainer();
                String _convertFluxString_14 = this.convertFluxString(((ReferableBaseObject) _eContainer_5).getName());
                _builder.append(_convertFluxString_14, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                EObject _eContainer_6 = c.getPort1().eContainer();
                String _convertFluxString_15 = this.convertFluxString(((ReferableBaseObject) _eContainer_6).getName());
                _builder.append(_convertFluxString_15, "\t");
                _builder.append(" -- ");
                EObject _eContainer_7 = c.getPort2().eContainer();
                String _convertFluxString_16 = this.convertFluxString(((ReferableBaseObject) _eContainer_7).getName());
                _builder.append(_convertFluxString_16, "\t");
                _builder.append(" : ");
                String _string_2 = c.toString();
                _builder.append(_string_2, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateLogicalRoutes(final HWModel model, final HwStructure s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = s.getModules().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<HwModule> _modules = s.getModules();
          for(final HwModule m : _modules) {
            {
              if ((m instanceof ProcessingUnit)) {
                final ProcessingUnit pUnit = ((ProcessingUnit) m);
                _builder.newLineIfNotEmpty();
                {
                  EList<HwAccessElement> _accessElements = pUnit.getAccessElements();
                  for(final HwAccessElement ae : _accessElements) {
                    {
                      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(ae.getName());
                      boolean _not_1 = (!_isNullOrEmpty);
                      if (_not_1) {
                        {
                          HwDestination _destination = ae.getDestination();
                          boolean _tripleNotEquals = (_destination != null);
                          if (_tripleNotEquals) {
                            String _convertFluxString = this.convertFluxString(pUnit.getName());
                            _builder.append(_convertFluxString);
                            _builder.append(" ..>");
                            String _convertFluxString_1 = this.convertFluxString(ae.getDestination().getName());
                            _builder.append(_convertFluxString_1);
                            _builder.append(" : ");
                            String _name = ae.getName();
                            _builder.append(_name);
                            _builder.newLineIfNotEmpty();
                          } else {
                            Shell _activeShell = Display.getDefault().getActiveShell();
                            String _name_1 = ae.getName();
                            String _plus = ("Missing Destination of AccessElement:" + _name_1);
                            MessageDialog.openError(_activeShell, "AMALTHEA HW Visualization", _plus);
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      } else {
                        {
                          HwDestination _destination_1 = ae.getDestination();
                          boolean _tripleNotEquals_1 = (_destination_1 != null);
                          if (_tripleNotEquals_1) {
                            String _convertFluxString_2 = this.convertFluxString(pUnit.getName());
                            _builder.append(_convertFluxString_2);
                            _builder.append(" ..>");
                            String _convertFluxString_3 = this.convertFluxString(ae.getDestination().getName());
                            _builder.append(_convertFluxString_3);
                            _builder.append(" : ");
                            String _string = ae.toString();
                            _builder.append(_string);
                            _builder.newLineIfNotEmpty();
                          } else {
                            Shell _activeShell_1 = Display.getDefault().getActiveShell();
                            String _string_1 = ae.toString();
                            String _plus_1 = ("Missing Destination of AccessElement:" + _string_1);
                            MessageDialog.openError(_activeShell_1, "AMALTHEA HW Visualization", _plus_1);
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      EList<HwStructure> _structures = s.getStructures();
      for(final HwStructure su : _structures) {
        CharSequence _generateLogicalRoutes = this.generateLogicalRoutes(model, su);
        _builder.append(_generateLogicalRoutes);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generatePlantUmlContent(final HWModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    {
      boolean _isEmpty = model.getStructures().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<HwStructure> _structures = model.getStructures();
          for(final HwStructure s : _structures) {
            CharSequence _generateLevel = this.generateLevel(model, s);
            _builder.append(_generateLevel);
            _builder.newLineIfNotEmpty();
            _builder.append("\' add logical connections:");
            _builder.newLine();
            CharSequence _generateLogicalRoutes = this.generateLogicalRoutes(model, s);
            _builder.append(_generateLogicalRoutes);
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        MessageDialog.openError(Display.getDefault().getActiveShell(), "AMALTHEA HW Visualization", "No Structure in the model");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("skinparam component {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("backgroundColor<<ProcessingUnit>> #8CACFF");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("borderColor<<ProcessingUnit>> #000000");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("backgroundColor<<ConnectionHandler>> #FFFFA0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("borderColor<<ConnectionHandler>> #000000");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("backgroundColor<<Memory>> #60FF82");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("borderColor<<Memory>> #000000");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("backgroundColor<<Cache>> #C8FFA6");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("borderColor<<Cache>> #000000");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ArrowFontColor #C0C0C0");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@enduml");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public String convertFluxString(final String instring) {
    return this.convertGenericString(instring, "_");
  }
  
  public String convertGenericString(final String instring, final String replacestring) {
    final String Regex = "/";
    final String tmpstr0 = instring.replaceAll(Regex, replacestring);
    final String Regex1 = " ";
    final String tmpstr1 = tmpstr0.replaceAll(Regex1, replacestring);
    final String Regex2 = "\\(";
    final String tmpstr2 = tmpstr1.replaceAll(Regex2, replacestring);
    final String Regex3 = "\\)";
    final String tmpstr3 = tmpstr2.replaceAll(Regex3, replacestring);
    final String Regex4 = "-";
    final String tmpstr4 = tmpstr3.replaceAll(Regex4, replacestring);
    final String Regex5 = "\\+";
    final String tmpstr5 = tmpstr4.replaceAll(Regex5, replacestring);
    final String Regex6 = "%2f";
    final String tmpstr6 = tmpstr5.replaceAll(Regex6, replacestring);
    final String Regex7 = "\\(";
    final String tmpstr7 = tmpstr6.replaceAll(Regex7, replacestring);
    final String Regex8 = "\\)";
    final String tmpstr8 = tmpstr7.replaceAll(Regex8, replacestring);
    final String Regex9 = "%2b";
    final String Replace9 = "plus";
    final String tmpstr9 = tmpstr8.replaceAll(Regex9, Replace9);
    final String Regex10 = "%3a%3a";
    final String tmpstr10 = tmpstr9.replaceAll(Regex10, replacestring);
    final String Regex11 = "\\.";
    final String tmpstr11 = tmpstr10.replaceAll(Regex11, replacestring);
    return tmpstr11;
  }
}
