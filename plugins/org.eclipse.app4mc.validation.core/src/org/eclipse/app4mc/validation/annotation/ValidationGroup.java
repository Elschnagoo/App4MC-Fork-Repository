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

package org.eclipse.app4mc.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.Severity;

/**
 * Annotation for validation profiles.
 * 
 * Optionally mapping from {@link Validation} to {@link Severity}.
 * Can be used multiple times per class (repeatable).
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(ValidationGroupList.class)
public @interface ValidationGroup {

  /**
   * @return the severity of this group of validations. default to {@link Severity#ERROR}
   */
  Severity severity() default Severity.ERROR;

  /**
   * @return the defined validations
   */
  Class<? extends IValidation>[] validations();
}
