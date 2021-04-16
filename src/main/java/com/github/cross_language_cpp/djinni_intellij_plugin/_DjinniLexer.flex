package com.github.cross_language_cpp.djinni_intellij_plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.cross_language_cpp.djinni_intellij_plugin.psi.DjinniTypes.*;

%%

%{
  public _DjinniLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _DjinniLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
COMMENT=#.*
STRING_LITERAL=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER_LITERAL=-?([0-9]+(\.[0-9]*)?)|(\.[0-9]+)
IDENTIFIER=[:letter:][a-zA-Z_0-9]*
TEXT=[a-zA-Z_0-9]+

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "="                   { return EQ; }
  ":"                   { return COLON; }
  ";"                   { return SEMICOLON; }
  ","                   { return LIST_SEPARATOR; }
  "+"                   { return PLUS; }
  "{"                   { return LEFT_BLOCK_BRACE; }
  "}"                   { return RIGHT_BLOCK_BRACE; }
  "<"                   { return LEFT_GENERICS_BRACE; }
  ">"                   { return RIGHT_GENERICS_BRACE; }
  "("                   { return LEFT_PARAM_BRACE; }
  ")"                   { return RIGHT_PARAM_BRACE; }
  "@"                   { return AT; }
  "enum"                { return ENUM; }
  "flags"               { return FLAGS; }
  "record"              { return RECORD; }
  "eq"                  { return EQ_KEYWORD; }
  "ord"                 { return ORD; }
  "parcelable"          { return PARCELABLE; }
  "interface"           { return INTERFACE; }
  "static"              { return STATIC; }
  "const"               { return CONST; }
  "extern"              { return EXTERN; }
  "import"              { return IMPORT; }
  "list"                { return LIST; }
  "set"                 { return SET; }
  "optional"            { return OPTIONAL; }
  "map"                 { return MAP; }

  {SPACE}               { return SPACE; }
  {COMMENT}             { return COMMENT; }
  {STRING_LITERAL}      { return STRING_LITERAL; }
  {NUMBER_LITERAL}      { return NUMBER_LITERAL; }
  {IDENTIFIER}          { return IDENTIFIER; }
  {TEXT}                { return TEXT; }

}

[^] { return BAD_CHARACTER; }
