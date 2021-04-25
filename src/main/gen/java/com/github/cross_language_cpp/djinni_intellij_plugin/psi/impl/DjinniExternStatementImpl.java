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
import com.intellij.openapi.util.TextRange;

public class DjinniExternStatementImpl extends DjinniImportStatementBaseImpl implements DjinniExternStatement {

  public DjinniExternStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjinniVisitor visitor) {
    visitor.visitExternStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjinniVisitor) accept((DjinniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getAt() {
    return findNotNullChildByType(AT);
  }

  @Override
  @NotNull
  public PsiElement getExtern() {
    return findNotNullChildByType(EXTERN);
  }

  @Override
  @NotNull
  public PsiElement getStringLiteral() {
    return findNotNullChildByType(STRING_LITERAL);
  }

  @Override
  public @NotNull String getName() {
    return DjinniPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return DjinniPsiImplUtil.setName(this, newName);
  }

  @Override
  public TextRange getRangeOfPath() {
    return DjinniPsiImplUtil.getRangeOfPath(this);
  }

  @Override
  public @NotNull String getPath() {
    return DjinniPsiImplUtil.getPath(this);
  }

}
