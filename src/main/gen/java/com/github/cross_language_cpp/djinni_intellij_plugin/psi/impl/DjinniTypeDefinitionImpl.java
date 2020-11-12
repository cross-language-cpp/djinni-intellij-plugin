// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.cross_language_cpp.djinni_intellij_plugin.psi.DjinniTypes.*;
import com.github.cross_language_cpp.djinni_intellij_plugin.psi.*;
import com.github.cross_language_cpp.djinni_intellij_plugin.psi.impl.DjinniPsiImplUtil.DjinniType;
import com.intellij.navigation.ItemPresentation;

public class DjinniTypeDefinitionImpl extends DjinniNamedElementImpl implements DjinniTypeDefinition {

  public DjinniTypeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjinniVisitor visitor) {
    visitor.visitTypeDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjinniVisitor) accept((DjinniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DjinniDerivingParamList getDerivingParamList() {
    return findChildByClass(DjinniDerivingParamList.class);
  }

  @Override
  @NotNull
  public List<DjinniEnumMember> getEnumMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjinniEnumMember.class);
  }

  @Override
  @Nullable
  public DjinniEnumTypeVariant getEnumTypeVariant() {
    return findChildByClass(DjinniEnumTypeVariant.class);
  }

  @Override
  @NotNull
  public List<DjinniFlagsMember> getFlagsMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjinniFlagsMember.class);
  }

  @Override
  @Nullable
  public DjinniFlagsTypeVariant getFlagsTypeVariant() {
    return findChildByClass(DjinniFlagsTypeVariant.class);
  }

  @Override
  @NotNull
  public List<DjinniInterfaceMember> getInterfaceMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjinniInterfaceMember.class);
  }

  @Override
  @Nullable
  public DjinniInterfaceTypeVariant getInterfaceTypeVariant() {
    return findChildByClass(DjinniInterfaceTypeVariant.class);
  }

  @Override
  @NotNull
  public List<DjinniRecordMember> getRecordMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjinniRecordMember.class);
  }

  @Override
  @Nullable
  public DjinniRecordTypeVariant getRecordTypeVariant() {
    return findChildByClass(DjinniRecordTypeVariant.class);
  }

  @Override
  @NotNull
  public PsiElement getEq() {
    return findNotNullChildByType(EQ);
  }

  @Override
  @NotNull
  public PsiElement getLeftBlockBrace() {
    return findNotNullChildByType(LEFT_BLOCK_BRACE);
  }

  @Override
  @Nullable
  public PsiElement getLeftParamBrace() {
    return findChildByType(LEFT_PARAM_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getRightBlockBrace() {
    return findNotNullChildByType(RIGHT_BLOCK_BRACE);
  }

  @Override
  @Nullable
  public PsiElement getRightParamBrace() {
    return findChildByType(RIGHT_PARAM_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  public String getTypeName() {
    return DjinniPsiImplUtil.getTypeName(this);
  }

  @Override
  @NotNull
  public DjinniType getDjinniType() {
    return DjinniPsiImplUtil.getDjinniType(this);
  }

  @Override
  public String getName() {
    return DjinniPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return DjinniPsiImplUtil.setName(this, newName);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return DjinniPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return DjinniPsiImplUtil.getPresentation(this);
  }

}
