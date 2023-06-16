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
/**
 * The Jakarta NoSQL column module.
 * <p>
 * A column family is a NoSQL object that contains columns of related data. It is a tuple (pair)
 * that consists of a key-value pair, where the key is mapped to a value that is a set of columns.
 * In analogy with relational databases, a column family is as a <b>"table"</b>, each key-value pair being a <b>"row"</b>.
 * </p>
 */
module jakarta.nosql.column {
    requires jakarta.nosql.core;
    exports jakarta.nosql.column;
}