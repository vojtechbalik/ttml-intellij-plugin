// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import language.psi.TtmlTypes;
import com.intellij.psi.TokenType;
import org.jetbrains.annotations.NotNull;

%%

%class TtmlLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

//%debug

%{
      private IElementType modifierToken(char modChar) {
              switch(modChar) {
                  case '[':
                      return TtmlTypes.URL_START_MOD;
                  case ']':
                      return TtmlTypes.URL_END_MOD;
                  case '_':
                      return TtmlTypes.URL_TEXT_SEP_MOD;
                  default:
                      return TtmlTypes.STATE_MOD;
              }
      }
%}

REGULAR_CHAR=[^\^]
MOD_CHAR=[@A-Z\\\^\?\[\]_]
CARET="^"

//%state WAITING_MOD

%%

<YYINITIAL> {REGULAR_CHAR}+                                 { yybegin(YYINITIAL); return TtmlTypes.TEXT_TOK; }

<YYINITIAL> {CARET} {MOD_CHAR}                              { yybegin(YYINITIAL); return modifierToken(yytext().charAt(1)); }

<YYINITIAL> {CARET} | {CARET} [^]                           { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }