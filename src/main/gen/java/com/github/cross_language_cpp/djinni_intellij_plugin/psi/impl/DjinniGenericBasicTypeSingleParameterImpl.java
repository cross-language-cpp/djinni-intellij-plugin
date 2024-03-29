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

public class DjinniGenericBasicTypeSingleParameterImpl extends ASTWrapperPsiElement implements DjinniGenericBasicTypeSingleParameter {

  public DjinniGenericBasicTypeSingleParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjinniVisitor visitor) {
    visitor.visitGenericBasicTypeSingleParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjinniVisitor) accept((DjinniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DjinniTypeReference getTypeReference() {
    return findNotNullChildByClass(DjinniTypeReference.class);
  }

  @Override
  @NotNull
  public PsiElement getLeftGenericsBrace() {
    return findNotNullChildByType(LEFT_GENERICS_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getRightGenericsBrace() {
    return findNotNullChildByType(RIGHT_GENERICS_BRACE);
  }

  @Override
  @Nullable
  public PsiElement getList() {
    return findChildByType(LIST);
  }

  @Override
  @Nullable
  public PsiElement getOptional() {
    return findChildByType(OPTIONAL);
  }

  @Override
  @Nullable
  public PsiElement getSet() {
    return findChildByType(SET);
  }

}
