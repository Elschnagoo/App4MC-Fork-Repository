/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx;

import org.eclipse.sphinx.emf.ecore.ExtendedEObjectImpl;


public class AmaltheaExtendedEObjectImpl extends ExtendedEObjectImpl {

//	/**
//	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
//	 */
//	@Override
//	public void eNotify(final Notification notification) {
//		super.eNotify(notification);
//
//		// Send additional notifications
//		if (containerNotificationRequired() && (eContainer() != null)) {
//			final Notification n = new ENotificationImpl((InternalEObject) eContainer(), Notification.SET,
//					eContainingFeature(), this, this);
//
//			eContainer().eNotify(n);
//		}
//	}
//
//	/**
//	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotificationRequired()
//	 */
//	@Override
//	public boolean eNotificationRequired() {
//		return super.eNotificationRequired();
//	}
//
//	// default implementation
//	public boolean containerNotificationRequired() {
//		return false;
//	}

}
