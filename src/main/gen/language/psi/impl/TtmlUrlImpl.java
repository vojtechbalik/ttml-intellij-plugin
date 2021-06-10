// This is a generated file. Not intended for manual editing.
package language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static language.psi.TtmlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import language.psi.*;

public class TtmlUrlImpl extends ASTWrapperPsiElement implements TtmlUrl {

  public TtmlUrlImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TtmlVisitor visitor) {
    visitor.visitUrl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtmlVisitor) accept((TtmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtmlTextt getTextt() {
    return findChildByClass(TtmlTextt.class);
  }

  @Override
  @Nullable
  public TtmlUrlTextMarkup getUrlTextMarkup() {
    return findChildByClass(TtmlUrlTextMarkup.class);
  }

}
