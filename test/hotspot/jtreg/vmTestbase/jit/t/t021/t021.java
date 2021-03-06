/*
 * Copyright (c) 2008, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 *
 * @summary converted from VM Testbase jit/t/t021.
 * VM Testbase keywords: [jit, quick]
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @build jit.t.t021.t021
 * @run driver ExecDriver --java jit.t.t021.t021
 */

package jit.t.t021;

import nsk.share.TestFailure;
import nsk.share.GoldChecker;

// opc_fconst_0, opc_fconst_1, opc_fconst_2, opc_fload_<n>, opc_fload,
// opc_fadd, opc_fsub, opc_fmul, opc_fdiv
class t021
{
    public static final GoldChecker goldChecker = new GoldChecker( "t021" );

    public static void main(String argv[])
    {
        float a, b, c, d, e;

        a = 0.0f;
        b = 1.0f;
        c = 2.0f;
        e = 41.0f - c;
        d = a + b * c / e;

        t021.goldChecker.println(a);
        t021.goldChecker.println(b);
        t021.goldChecker.println(c);
        t021.goldChecker.println(d);
        t021.goldChecker.check();
    }
}
