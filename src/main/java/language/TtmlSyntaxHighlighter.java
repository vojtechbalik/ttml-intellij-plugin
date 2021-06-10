// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import language.psi.TtmlTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class TtmlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final IElementType[] MODIFIER_TOKENS = new IElementType[]{
            TtmlTypes.STATE_MOD,
            TtmlTypes.URL_START_MOD,
            TtmlTypes.URL_END_MOD,
            TtmlTypes.URL_TEXT_SEP_MOD,
    };

    public static final TextAttributesKey MODIFIER =
            createTextAttributesKey("TTML_MODIFIER", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey TEXT =
            createTextAttributesKey("TTML_TEXT", HighlighterColors.TEXT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("TTML_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] TEXT_KEYS = new TextAttributesKey[]{TEXT};
    private static final TextAttributesKey[] MOD_KEYS = new TextAttributesKey[]{MODIFIER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new TtmlLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (Arrays.asList(MODIFIER_TOKENS).contains(tokenType)) {
            return MOD_KEYS;
        } else if (tokenType.equals(TtmlTypes.TEXT_TOK)) {
            return TEXT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }

}
