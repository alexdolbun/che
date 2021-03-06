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
package org.eclipse.che.ide.terminal;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Custom keyDown handler for {@link TerminalJso}
 *
 * @author Oleksandr Andriienko
 */
public class CustomKeyEventTerminalHandler extends JavaScriptObject {
  protected CustomKeyEventTerminalHandler() {}

  public static native CustomKeyEventTerminalHandler create() /*-{
        return function onKeyEvent(ev) {
            var C = 67;
            var V = 86;
            if (ev.ctrlKey && !(ev.shiftKey || ev.metaKey || ev.altKey)) {

                // handle Ctrl + V
                if (ev.keyCode === V) {
                    return false;
                }

                // handle Ctrl + C. Notice: scope "this" it's a terminal scope.
                if (ev.keyCode === C && this.hasSelection()) {
                    return false;
                }
            }
            return true;
        }
    }-*/;
}
