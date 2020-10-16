// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjinniGenericBasicTypeDualParameter extends PsiElement {

  @NotNull
  List<DjinniTypeReference> getTypeReferenceList();

  @NotNull
  PsiElement getLeftGenericsBrace();

  @NotNull
  PsiElement getListSeparator();

  @NotNull
  PsiElement getRightGenericsBrace();

  @NotNull
  PsiElement getMap();

}
