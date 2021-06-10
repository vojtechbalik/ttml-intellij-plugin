// This is a generated file. Not intended for manual editing.
package language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static language.psi.TtmlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TtmlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return ttmlFile(b, l + 1);
  }

  /* ********************************************************** */
  // STATE_MOD | url
  public static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    if (!nextTokenIs(b, "<modifier>", STATE_MOD, URL_START_MOD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER, "<modifier>");
    r = consumeToken(b, STATE_MOD);
    if (!r) r = url(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TEXT_TOK
  public static boolean textt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textt")) return false;
    if (!nextTokenIs(b, TEXT_TOK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT_TOK);
    exit_section_(b, m, TEXTT, r);
    return r;
  }

  /* ********************************************************** */
  // (textt | modifier)*
  static boolean ttmlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ttmlFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ttmlFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ttmlFile", c)) break;
    }
    return true;
  }

  // textt | modifier
  private static boolean ttmlFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ttmlFile_0")) return false;
    boolean r;
    r = textt(b, l + 1);
    if (!r) r = modifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // URL_START_MOD textt? (URL_TEXT_SEP_MOD url_text_markup?)? URL_END_MOD
  public static boolean url(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url")) return false;
    if (!nextTokenIs(b, URL_START_MOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, URL_START_MOD);
    r = r && url_1(b, l + 1);
    r = r && url_2(b, l + 1);
    r = r && consumeToken(b, URL_END_MOD);
    exit_section_(b, m, URL, r);
    return r;
  }

  // textt?
  private static boolean url_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_1")) return false;
    textt(b, l + 1);
    return true;
  }

  // (URL_TEXT_SEP_MOD url_text_markup?)?
  private static boolean url_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_2")) return false;
    url_2_0(b, l + 1);
    return true;
  }

  // URL_TEXT_SEP_MOD url_text_markup?
  private static boolean url_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, URL_TEXT_SEP_MOD);
    r = r && url_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // url_text_markup?
  private static boolean url_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_2_0_1")) return false;
    url_text_markup(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (textt | STATE_MOD)*
  public static boolean url_text_markup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_text_markup")) return false;
    Marker m = enter_section_(b, l, _NONE_, URL_TEXT_MARKUP, "<url text markup>");
    while (true) {
      int c = current_position_(b);
      if (!url_text_markup_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "url_text_markup", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // textt | STATE_MOD
  private static boolean url_text_markup_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_text_markup_0")) return false;
    boolean r;
    r = textt(b, l + 1);
    if (!r) r = consumeToken(b, STATE_MOD);
    return r;
  }

}
