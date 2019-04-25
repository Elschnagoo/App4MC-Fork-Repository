/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.validation.core;

import org.eclipse.emf.ecore.EObject;

/**
 *  
 */
public class Result {

  private Severity severity = Severity.UNDEFINED;
  private String messageId = "";

  private final String message;
  private final EObject target;

  /**
   * @param description the text
   * @param target the object that was validated
   */
  public Result(final String description, final EObject target) {
    this.message = description;
    this.target = target;
  }

  /**
   * @return the target that was validated
   */
  public EObject getTarget() {
    return this.target;
  }

  /**
   * @return the messageId
   */
  public String getMessageId() {
    return this.messageId;
  }


  /**
   * @return the description
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * @return the severityLevel
   */
  public Severity getSeverityLevel() {
    return this.severity;
  }

  /**
   * @param severity the severity to set
   */
  public void setSeverityLevel(final Severity severity) {
    this.severity = severity;
  }

  /**
   * @param messageId the messageId
   */
  public void setMessageId(final String messageId) {
    this.messageId = messageId;
  }

  @Override
  public String toString() {
    return this.messageId + ": " + this.message + " (" + this.target + ")";
  }
}
