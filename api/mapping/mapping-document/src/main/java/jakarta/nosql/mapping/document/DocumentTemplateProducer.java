/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package jakarta.nosql.mapping.document;


import jakarta.nosql.document.DocumentManager;


/**
 * The producer of {@link DocumentTemplate}
 */
public interface DocumentTemplateProducer {

    /**
     * creates a {@link DocumentTemplate}
     *
     * @param <T>               the DocumentTemplate instance
     * @param manager the manager
     * @return a new instance
     * @throws NullPointerException when manager is null
     */
    <T extends DocumentTemplate> T get(DocumentManager manager);

}
