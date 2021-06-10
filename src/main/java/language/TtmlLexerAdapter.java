// Copyright 2000-2021 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package language;

import com.intellij.lexer.FlexAdapter;

public class TtmlLexerAdapter extends FlexAdapter {

    public TtmlLexerAdapter() {
        super(new TtmlLexer(null));
    }

}