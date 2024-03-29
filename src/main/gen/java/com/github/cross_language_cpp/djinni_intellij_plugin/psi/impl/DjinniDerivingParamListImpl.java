// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.cross_language_cpp.djinni_intellij_plugin.psi.DjinniTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.cross_language_cpp.djinni_intellij_plugin.psi.*;

public class DjinniDerivingParamListImpl extends ASTWrapperPsiElement implements DjinniDerivingParamList {

  public DjinniDerivingParamListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjinniVisitor visitor) {
    visitor.visitDerivingParamList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjinniVisitor) accept((DjinniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DjinniDerivingParam getDerivingParam() {
    return findNotNullChildByClass(DjinniDerivingParam.class);
  }

  @Override
  @Nullable
  public DjinniDerivingParamList getDerivingParamList() {
    return findChildByClass(DjinniDerivingParamList.class);
  }

  @Override
  @Nullable
  public PsiElement getListSeparator() {
    return findChildByType(LIST_SEPARATOR);
  }

}
