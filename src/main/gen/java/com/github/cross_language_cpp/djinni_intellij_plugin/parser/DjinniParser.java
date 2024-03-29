// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.cross_language_cpp.djinni_intellij_plugin.psi.DjinniTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DjinniParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return djinniFile(b, l + 1);
  }

  /* ********************************************************** */
  // 'bool' | 'i8' | 'i16' | 'i32' | 'i64' | 'f32' | 'f64' | 'string' | 'binary' | 'date'
  public static boolean basicType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basicType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TYPE, "<basic type>");
    r = consumeToken(b, "bool");
    if (!r) r = consumeToken(b, "i8");
    if (!r) r = consumeToken(b, "i16");
    if (!r) r = consumeToken(b, "i32");
    if (!r) r = consumeToken(b, "i64");
    if (!r) r = consumeToken(b, "f32");
    if (!r) r = consumeToken(b, "f64");
    if (!r) r = consumeToken(b, "string");
    if (!r) r = consumeToken(b, "binary");
    if (!r) r = consumeToken(b, "date");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // const constNamedValue COLON typeReference EQ constValue SEMICOLON
  public static boolean constMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constMember")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST);
    r = r && constNamedValue(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && typeReference(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && constValue(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONST_MEMBER, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean constNamedValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constNamedValue")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CONST_NAMED_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BLOCK_BRACE constRecordMemberList RIGHT_BLOCK_BRACE
  static boolean constRecord(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constRecord")) return false;
    if (!nextTokenIs(b, LEFT_BLOCK_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BLOCK_BRACE);
    r = r && constRecordMemberList(b, l + 1);
    r = r && consumeToken(b, RIGHT_BLOCK_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier EQ constValue
  public static boolean constRecordMemberElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constRecordMemberElement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQ);
    r = r && constValue(b, l + 1);
    exit_section_(b, m, CONST_RECORD_MEMBER_ELEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (constRecordMemberElement ',' constRecordMemberList) | (constRecordMemberElement [','])
  static boolean constRecordMemberList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constRecordMemberList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constRecordMemberList_0(b, l + 1);
    if (!r) r = constRecordMemberList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constRecordMemberElement ',' constRecordMemberList
  private static boolean constRecordMemberList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constRecordMemberList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constRecordMemberElement(b, l + 1);
    r = r && consumeToken(b, LIST_SEPARATOR);
    r = r && constRecordMemberList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constRecordMemberElement [',']
  private static boolean constRecordMemberList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constRecordMemberList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constRecordMemberElement(b, l + 1);
    r = r && constRecordMemberList_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean constRecordMemberList_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constRecordMemberList_1_1")) return false;
    consumeToken(b, LIST_SEPARATOR);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean constReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constReference")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CONST_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // string_literal | number_literal | constReference | constRecord
  public static boolean constValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_VALUE, "<const value>");
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = constReference(b, l + 1);
    if (!r) r = constRecord(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // eq_keyword | ord | parcelable
  public static boolean derivingParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derivingParam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DERIVING_PARAM, "<deriving param>");
    r = consumeToken(b, EQ_KEYWORD);
    if (!r) r = consumeToken(b, ORD);
    if (!r) r = consumeToken(b, PARCELABLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (derivingParam ',' derivingParamList) | derivingParam
  public static boolean derivingParamList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derivingParamList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DERIVING_PARAM_LIST, "<deriving param list>");
    r = derivingParamList_0(b, l + 1);
    if (!r) r = derivingParam(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // derivingParam ',' derivingParamList
  private static boolean derivingParamList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derivingParamList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = derivingParam(b, l + 1);
    r = r && consumeToken(b, LIST_SEPARATOR);
    r = r && derivingParamList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean djinniFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "djinniFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "djinniFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // enumTypeVariant LEFT_BLOCK_BRACE enumMember* RIGHT_BLOCK_BRACE
  static boolean enumDescription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDescription")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumTypeVariant(b, l + 1);
    r = r && consumeToken(b, LEFT_BLOCK_BRACE);
    r = r && enumDescription_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BLOCK_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // enumMember*
  private static boolean enumDescription_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDescription_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumDescription_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // enumValue SEMICOLON
  public static boolean enumMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumMember")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumValue(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ENUM_MEMBER, r);
    return r;
  }

  /* ********************************************************** */
  // enum
  public static boolean enumTypeVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumTypeVariant")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENUM);
    exit_section_(b, m, ENUM_TYPE_VARIANT, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean enumValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumValue")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUM_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // AT extern string_literal
  public static boolean externStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "externStatement")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, EXTERN, STRING_LITERAL);
    exit_section_(b, m, EXTERN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // flagsTypeVariant LEFT_BLOCK_BRACE flagsMember* RIGHT_BLOCK_BRACE
  static boolean flagsDescription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsDescription")) return false;
    if (!nextTokenIs(b, FLAGS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = flagsTypeVariant(b, l + 1);
    r = r && consumeToken(b, LEFT_BLOCK_BRACE);
    r = r && flagsDescription_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BLOCK_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // flagsMember*
  private static boolean flagsDescription_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsDescription_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!flagsMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "flagsDescription_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // flagsValue [ EQ ( 'all' | 'none' ) ] SEMICOLON
  public static boolean flagsMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsMember")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = flagsValue(b, l + 1);
    r = r && flagsMember_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FLAGS_MEMBER, r);
    return r;
  }

  // [ EQ ( 'all' | 'none' ) ]
  private static boolean flagsMember_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsMember_1")) return false;
    flagsMember_1_0(b, l + 1);
    return true;
  }

  // EQ ( 'all' | 'none' )
  private static boolean flagsMember_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsMember_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && flagsMember_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'all' | 'none'
  private static boolean flagsMember_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsMember_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, "all");
    if (!r) r = consumeToken(b, "none");
    return r;
  }

  /* ********************************************************** */
  // flags
  public static boolean flagsTypeVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsTypeVariant")) return false;
    if (!nextTokenIs(b, FLAGS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FLAGS);
    exit_section_(b, m, FLAGS_TYPE_VARIANT, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean flagsValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flagsValue")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FLAGS_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // (PLUS 'c') | (PLUS 'j') | (PLUS 'o') | (PLUS 'p') | (PLUS 's')
  public static boolean generator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator")) return false;
    if (!nextTokenIs(b, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generator_0(b, l + 1);
    if (!r) r = generator_1(b, l + 1);
    if (!r) r = generator_2(b, l + 1);
    if (!r) r = generator_3(b, l + 1);
    if (!r) r = generator_4(b, l + 1);
    exit_section_(b, m, GENERATOR, r);
    return r;
  }

  // PLUS 'c'
  private static boolean generator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && consumeToken(b, "c");
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS 'j'
  private static boolean generator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && consumeToken(b, "j");
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS 'o'
  private static boolean generator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && consumeToken(b, "o");
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS 'p'
  private static boolean generator_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && consumeToken(b, "p");
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS 's'
  private static boolean generator_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && consumeToken(b, "s");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // genericBasicTypeSingleParameter | genericBasicTypeDualParameter
  public static boolean genericBasicType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericBasicType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_BASIC_TYPE, "<generic basic type>");
    r = genericBasicTypeSingleParameter(b, l + 1);
    if (!r) r = genericBasicTypeDualParameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // map LEFT_GENERICS_BRACE typeReference LIST_SEPARATOR typeReference RIGHT_GENERICS_BRACE
  public static boolean genericBasicTypeDualParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericBasicTypeDualParameter")) return false;
    if (!nextTokenIs(b, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAP, LEFT_GENERICS_BRACE);
    r = r && typeReference(b, l + 1);
    r = r && consumeToken(b, LIST_SEPARATOR);
    r = r && typeReference(b, l + 1);
    r = r && consumeToken(b, RIGHT_GENERICS_BRACE);
    exit_section_(b, m, GENERIC_BASIC_TYPE_DUAL_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // (list | set | optional) !space LEFT_GENERICS_BRACE typeReference RIGHT_GENERICS_BRACE
  public static boolean genericBasicTypeSingleParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericBasicTypeSingleParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_BASIC_TYPE_SINGLE_PARAMETER, "<generic basic type single parameter>");
    r = genericBasicTypeSingleParameter_0(b, l + 1);
    r = r && genericBasicTypeSingleParameter_1(b, l + 1);
    r = r && consumeToken(b, LEFT_GENERICS_BRACE);
    r = r && typeReference(b, l + 1);
    r = r && consumeToken(b, RIGHT_GENERICS_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // list | set | optional
  private static boolean genericBasicTypeSingleParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericBasicTypeSingleParameter_0")) return false;
    boolean r;
    r = consumeToken(b, LIST);
    if (!r) r = consumeToken(b, SET);
    if (!r) r = consumeToken(b, OPTIONAL);
    return r;
  }

  // !space
  private static boolean genericBasicTypeSingleParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericBasicTypeSingleParameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, SPACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AT import string_literal
  public static boolean importStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStatement")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, IMPORT, STRING_LITERAL);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // interfaceTypeVariant LEFT_BLOCK_BRACE interfaceMember* RIGHT_BLOCK_BRACE
  static boolean interfaceDescription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDescription")) return false;
    if (!nextTokenIs(b, INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interfaceTypeVariant(b, l + 1);
    r = r && consumeToken(b, LEFT_BLOCK_BRACE);
    r = r && interfaceDescription_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BLOCK_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // interfaceMember*
  private static boolean interfaceDescription_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDescription_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interfaceMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interfaceDescription_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier COLON typeReference
  public static boolean interfaceFunctionParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceFunctionParam")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && typeReference(b, l + 1);
    exit_section_(b, m, INTERFACE_FUNCTION_PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // (interfaceFunctionParam ',' interfaceFunctionParamList) | interfaceFunctionParam
  public static boolean interfaceFunctionParamList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceFunctionParamList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interfaceFunctionParamList_0(b, l + 1);
    if (!r) r = interfaceFunctionParam(b, l + 1);
    exit_section_(b, m, INTERFACE_FUNCTION_PARAM_LIST, r);
    return r;
  }

  // interfaceFunctionParam ',' interfaceFunctionParamList
  private static boolean interfaceFunctionParamList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceFunctionParamList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interfaceFunctionParam(b, l + 1);
    r = r && consumeToken(b, LIST_SEPARATOR);
    r = r && interfaceFunctionParamList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constMember | interfaceMemberFunction
  public static boolean interfaceMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MEMBER, "<interface member>");
    r = constMember(b, l + 1);
    if (!r) r = interfaceMemberFunction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [static | const] identifier LEFT_PARAM_BRACE interfaceFunctionParamList? RIGHT_PARAM_BRACE [COLON typeReference] SEMICOLON
  public static boolean interfaceMemberFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMemberFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MEMBER_FUNCTION, "<interface member function>");
    r = interfaceMemberFunction_0(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, LEFT_PARAM_BRACE);
    r = r && interfaceMemberFunction_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARAM_BRACE);
    r = r && interfaceMemberFunction_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [static | const]
  private static boolean interfaceMemberFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMemberFunction_0")) return false;
    interfaceMemberFunction_0_0(b, l + 1);
    return true;
  }

  // static | const
  private static boolean interfaceMemberFunction_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMemberFunction_0_0")) return false;
    boolean r;
    r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, CONST);
    return r;
  }

  // interfaceFunctionParamList?
  private static boolean interfaceMemberFunction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMemberFunction_3")) return false;
    interfaceFunctionParamList(b, l + 1);
    return true;
  }

  // [COLON typeReference]
  private static boolean interfaceMemberFunction_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMemberFunction_5")) return false;
    interfaceMemberFunction_5_0(b, l + 1);
    return true;
  }

  // COLON typeReference
  private static boolean interfaceMemberFunction_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMemberFunction_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && typeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // interface generator*
  public static boolean interfaceTypeVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceTypeVariant")) return false;
    if (!nextTokenIs(b, INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTERFACE);
    r = r && interfaceTypeVariant_1(b, l + 1);
    exit_section_(b, m, INTERFACE_TYPE_VARIANT, r);
    return r;
  }

  // generator*
  private static boolean interfaceTypeVariant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceTypeVariant_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interfaceTypeVariant_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // importStatement | externStatement | typeDefinition
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    if (!nextTokenIs(b, "", AT, IDENTIFIER)) return false;
    boolean r;
    r = importStatement(b, l + 1);
    if (!r) r = externStatement(b, l + 1);
    if (!r) r = typeDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // basicType | genericBasicType
  public static boolean predefinedType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predefinedType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREDEFINED_TYPE, "<predefined type>");
    r = basicType(b, l + 1);
    if (!r) r = genericBasicType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // recordTypeVariant LEFT_BLOCK_BRACE recordMember* RIGHT_BLOCK_BRACE ['deriving' LEFT_PARAM_BRACE derivingParamList RIGHT_PARAM_BRACE]
  static boolean recordDescription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordDescription")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = recordTypeVariant(b, l + 1);
    r = r && consumeToken(b, LEFT_BLOCK_BRACE);
    r = r && recordDescription_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BLOCK_BRACE);
    r = r && recordDescription_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // recordMember*
  private static boolean recordDescription_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordDescription_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!recordMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordDescription_2", c)) break;
    }
    return true;
  }

  // ['deriving' LEFT_PARAM_BRACE derivingParamList RIGHT_PARAM_BRACE]
  private static boolean recordDescription_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordDescription_4")) return false;
    recordDescription_4_0(b, l + 1);
    return true;
  }

  // 'deriving' LEFT_PARAM_BRACE derivingParamList RIGHT_PARAM_BRACE
  private static boolean recordDescription_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordDescription_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "deriving");
    r = r && consumeToken(b, LEFT_PARAM_BRACE);
    r = r && derivingParamList(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARAM_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constMember | recordMemberVariable
  public static boolean recordMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordMember")) return false;
    if (!nextTokenIs(b, "<record member>", CONST, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_MEMBER, "<record member>");
    r = constMember(b, l + 1);
    if (!r) r = recordMemberVariable(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON typeReference SEMICOLON
  public static boolean recordMemberVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordMemberVariable")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && typeReference(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RECORD_MEMBER_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // record generator*
  public static boolean recordTypeVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeVariant")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && recordTypeVariant_1(b, l + 1);
    exit_section_(b, m, RECORD_TYPE_VARIANT, r);
    return r;
  }

  // generator*
  private static boolean recordTypeVariant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordTypeVariant_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "recordTypeVariant_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier EQ typeDescription
  public static boolean typeDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQ);
    r = r && typeDescription(b, l + 1);
    exit_section_(b, m, TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // enumDescription | flagsDescription | recordDescription | interfaceDescription
  static boolean typeDescription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDescription")) return false;
    boolean r;
    r = enumDescription(b, l + 1);
    if (!r) r = flagsDescription(b, l + 1);
    if (!r) r = recordDescription(b, l + 1);
    if (!r) r = interfaceDescription(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // predefinedType | identifier
  public static boolean typeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_REFERENCE, "<type reference>");
    r = predefinedType(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
