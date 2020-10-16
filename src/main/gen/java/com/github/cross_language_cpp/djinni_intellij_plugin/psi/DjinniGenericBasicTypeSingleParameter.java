// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjinniGenericBasicTypeSingleParameter extends PsiElement {

  @NotNull
  DjinniTypeReference getTypeReference();

  @NotNull
  PsiElement getLeftGenericsBrace();

  @NotNull
  PsiElement getRightGenericsBrace();

  @Nullable
  PsiElement getList();

  @Nullable
  PsiElement getOptional();

  @Nullable
  PsiElement getSet();

}
