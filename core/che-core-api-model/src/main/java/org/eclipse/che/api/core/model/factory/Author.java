/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.core.model.factory;

/**
 * Defines the contract for the factory creator instance.
 *
 * @author Anton Korneta
 */
public interface Author {

  /** Identifier of the user who created factory, it is mandatory */
  String getUserId();

  /** Creation time of factory, set by the server (in milliseconds, from Unix epoch, no timezone) */
  Long getCreated();
}
