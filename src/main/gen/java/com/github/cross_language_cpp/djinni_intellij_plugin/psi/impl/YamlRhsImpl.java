// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.cross_language_cpp.djinni_intellij_plugin.psi.YamlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.cross_language_cpp.djinni_intellij_plugin.psi.*;
import com.intellij.navigation.ItemPresentation;

public class YamlRhsImpl extends ASTWrapperPsiElement implements YamlRhs {

  public YamlRhsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YamlVisitor visitor) {
    visitor.visitRhs(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YamlVisitor) accept((YamlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getValue() {
    return findNotNullChildByType(VALUE);
  }

  @Override
  public String getName() {
    return YamlPsiImplUtil.getName(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return YamlPsiImplUtil.getPresentation(this);
  }

}
