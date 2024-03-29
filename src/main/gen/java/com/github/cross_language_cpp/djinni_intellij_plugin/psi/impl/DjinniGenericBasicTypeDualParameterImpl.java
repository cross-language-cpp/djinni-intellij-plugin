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

public class DjinniGenericBasicTypeDualParameterImpl extends ASTWrapperPsiElement implements DjinniGenericBasicTypeDualParameter {

  public DjinniGenericBasicTypeDualParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjinniVisitor visitor) {
    visitor.visitGenericBasicTypeDualParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjinniVisitor) accept((DjinniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DjinniTypeReference> getTypeReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjinniTypeReference.class);
  }

  @Override
  @NotNull
  public PsiElement getLeftGenericsBrace() {
    return findNotNullChildByType(LEFT_GENERICS_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getListSeparator() {
    return findNotNullChildByType(LIST_SEPARATOR);
  }

  @Override
  @NotNull
  public PsiElement getRightGenericsBrace() {
    return findNotNullChildByType(RIGHT_GENERICS_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getMap() {
    return findNotNullChildByType(MAP);
  }

}
