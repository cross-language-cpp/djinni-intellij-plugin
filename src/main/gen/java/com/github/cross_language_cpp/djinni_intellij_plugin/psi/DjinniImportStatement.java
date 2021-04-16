// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.openapi.util.TextRange;

public interface DjinniImportStatement extends PsiNamedElement {

  @NotNull
  PsiElement getAt();

  @NotNull
  PsiElement getImport();

  @NotNull
  PsiElement getStringLiteral();

  @NotNull String getName();

  PsiElement setName(String newName);

  TextRange getRangeOfPath();

  @NotNull String getPath();

}
