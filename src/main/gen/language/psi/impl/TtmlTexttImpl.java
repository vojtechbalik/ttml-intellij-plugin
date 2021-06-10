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

public class TtmlTexttImpl extends ASTWrapperPsiElement implements TtmlTextt {

  public TtmlTexttImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TtmlVisitor visitor) {
    visitor.visitTextt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtmlVisitor) accept((TtmlVisitor)visitor);
    else super.accept(visitor);
  }

}
