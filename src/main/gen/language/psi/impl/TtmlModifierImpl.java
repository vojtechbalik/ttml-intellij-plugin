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

public class TtmlModifierImpl extends ASTWrapperPsiElement implements TtmlModifier {

  public TtmlModifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TtmlVisitor visitor) {
    visitor.visitModifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtmlVisitor) accept((TtmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtmlUrl getUrl() {
    return findChildByClass(TtmlUrl.class);
  }

}
