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

public class DjinniInterfaceMemberFunctionImpl extends ASTWrapperPsiElement implements DjinniInterfaceMemberFunction {

  public DjinniInterfaceMemberFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjinniVisitor visitor) {
    visitor.visitInterfaceMemberFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjinniVisitor) accept((DjinniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DjinniInterfaceFunctionParamList getInterfaceFunctionParamList() {
    return findChildByClass(DjinniInterfaceFunctionParamList.class);
  }

  @Override
  @Nullable
  public DjinniTypeReference getTypeReference() {
    return findChildByClass(DjinniTypeReference.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @NotNull
  public PsiElement getLeftParamBrace() {
    return findNotNullChildByType(LEFT_PARAM_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getRightParamBrace() {
    return findNotNullChildByType(RIGHT_PARAM_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getSemicolon() {
    return findNotNullChildByType(SEMICOLON);
  }

  @Override
  @Nullable
  public PsiElement getConst() {
    return findChildByType(CONST);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getStatic() {
    return findChildByType(STATIC);
  }

}
