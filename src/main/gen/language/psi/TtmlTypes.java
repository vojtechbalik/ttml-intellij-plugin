// This is a generated file. Not intended for manual editing.
package language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import language.psi.impl.*;

public interface TtmlTypes {

  IElementType MODIFIER = new TtmlElementType("MODIFIER");
  IElementType TEXTT = new TtmlElementType("TEXTT");
  IElementType URL = new TtmlElementType("URL");
  IElementType URL_TEXT_MARKUP = new TtmlElementType("URL_TEXT_MARKUP");

  IElementType STATE_MOD = new TtmlTokenType("STATE_MOD");
  IElementType TEXT_TOK = new TtmlTokenType("TEXT_TOK");
  IElementType URL_END_MOD = new TtmlTokenType("URL_END_MOD");
  IElementType URL_START_MOD = new TtmlTokenType("URL_START_MOD");
  IElementType URL_TEXT_SEP_MOD = new TtmlTokenType("URL_TEXT_SEP_MOD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MODIFIER) {
        return new TtmlModifierImpl(node);
      }
      else if (type == TEXTT) {
        return new TtmlTexttImpl(node);
      }
      else if (type == URL) {
        return new TtmlUrlImpl(node);
      }
      else if (type == URL_TEXT_MARKUP) {
        return new TtmlUrlTextMarkupImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
