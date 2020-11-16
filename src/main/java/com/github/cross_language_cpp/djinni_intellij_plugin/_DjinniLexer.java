/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.github.cross_language_cpp.djinni_intellij_plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.cross_language_cpp.djinni_intellij_plugin.psi.DjinniTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_DjinniLexer.flex</tt>
 */
public class _DjinniLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 14208 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\2\11\1\14\1\36\3\11\1\37\10\11\1\40\1\41\5\14\1\42\1\43"+
    "\11\11\1\44\2\11\1\45\5\11\1\46\4\11\1\47\1\50\4\11\51\14\1\51\3\14\1\52\1"+
    "\53\4\14\1\54\12\11\1\55\u0381\11");

  /* The ZZ_CMAP_Y table has 2944 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\10\1\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\24\12\13\1\25"+
    "\1\13\1\26\1\25\1\13\1\27\4\1\1\13\1\30\1\31\2\1\2\13\1\30\1\1\1\32\1\25\5"+
    "\13\1\33\1\34\1\35\1\1\1\36\1\13\1\1\1\37\5\13\1\40\1\41\1\42\1\13\1\30\1"+
    "\43\1\13\1\44\1\45\1\1\1\13\1\46\4\1\1\13\1\47\4\1\1\50\2\13\1\51\1\1\1\52"+
    "\1\16\1\25\1\53\1\54\1\55\1\56\1\57\1\60\2\16\1\61\1\54\1\55\1\62\1\1\1\63"+
    "\1\1\1\64\1\65\1\22\1\55\1\66\1\1\1\67\1\16\1\70\1\71\1\54\1\55\1\66\1\1\1"+
    "\60\1\16\1\41\1\72\1\73\1\74\1\75\1\1\1\67\2\1\1\76\1\36\1\55\1\51\1\1\1\77"+
    "\1\16\1\1\1\100\1\36\1\55\1\101\1\1\1\57\1\16\1\102\1\76\1\36\1\13\1\103\1"+
    "\57\1\104\1\16\1\42\1\105\1\106\1\13\1\107\1\110\3\1\1\25\2\13\1\111\1\110"+
    "\3\1\1\112\1\113\1\114\1\115\1\116\1\117\2\1\1\67\3\1\1\120\1\13\1\121\1\1"+
    "\1\122\7\1\2\13\1\30\1\123\1\1\1\124\1\125\1\126\1\127\1\1\2\13\1\130\2\13"+
    "\1\131\24\13\1\132\1\133\2\13\1\132\2\13\1\134\1\135\1\14\3\13\1\135\3\13"+
    "\1\30\2\1\1\13\1\1\5\13\1\136\1\25\45\13\1\137\1\13\1\140\1\30\4\13\1\30\1"+
    "\141\1\142\1\16\1\13\1\16\1\13\1\16\1\142\1\67\3\13\1\143\1\1\1\144\4\1\5"+
    "\13\1\27\1\145\1\13\1\146\4\13\1\40\1\13\1\147\3\1\1\13\1\150\1\151\2\13\1"+
    "\152\1\13\1\75\3\1\1\13\1\110\3\13\1\151\4\1\1\153\5\1\1\105\2\13\1\143\1"+
    "\154\3\1\1\155\1\13\1\156\1\42\2\13\1\40\1\1\2\13\1\143\1\1\1\37\1\42\1\13"+
    "\1\150\1\46\5\1\1\157\1\160\14\13\4\1\21\13\1\136\2\13\1\136\1\161\1\13\1"+
    "\150\3\13\1\162\1\163\1\164\1\121\1\163\1\165\1\1\1\166\2\1\1\167\1\1\1\170"+
    "\1\1\1\121\6\1\1\171\1\172\1\173\1\174\1\175\3\1\1\176\147\1\2\13\1\147\2"+
    "\13\1\147\10\13\1\177\1\200\2\13\1\130\3\13\1\201\1\1\1\13\1\110\4\202\4\1"+
    "\1\123\35\1\1\203\2\1\1\204\1\25\4\13\1\205\1\25\4\13\1\131\1\105\1\13\1\150"+
    "\1\25\4\13\1\147\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\40\4\1\135\13\1\40\2"+
    "\1\10\13\1\121\4\1\2\13\1\150\20\13\1\121\1\13\1\206\1\1\2\13\1\147\1\123"+
    "\1\13\1\150\4\13\1\40\2\1\1\207\1\210\5\13\1\211\1\13\1\147\1\27\3\1\1\207"+
    "\1\212\1\13\1\31\1\1\3\13\1\143\1\210\2\13\1\143\3\1\1\213\1\42\1\13\1\40"+
    "\1\13\1\110\1\1\1\13\1\121\1\50\2\13\1\31\1\123\1\1\1\214\1\215\2\13\1\46"+
    "\1\1\1\216\1\1\1\13\1\217\3\13\1\220\1\221\1\222\1\30\1\64\1\223\1\224\1\202"+
    "\2\13\1\131\1\40\7\13\1\31\1\1\72\13\1\143\1\13\1\225\2\13\1\152\20\1\26\13"+
    "\1\150\6\13\1\75\2\1\1\110\1\226\1\55\1\227\1\230\6\13\1\16\1\1\1\155\25\13"+
    "\1\150\1\1\4\13\1\210\2\13\1\27\2\1\1\152\7\1\1\214\7\13\1\121\2\1\1\25\1"+
    "\30\1\25\1\30\1\231\4\13\1\147\1\232\1\233\2\1\1\234\1\13\1\14\1\235\2\150"+
    "\2\1\7\13\1\30\30\1\1\13\1\121\3\13\1\67\2\1\2\13\1\1\1\13\1\236\2\13\1\40"+
    "\1\13\1\150\2\13\1\237\3\1\11\13\1\150\1\1\2\13\1\237\1\13\1\152\2\13\1\27"+
    "\3\13\1\143\11\1\23\13\1\110\1\13\1\40\1\27\11\1\1\240\2\13\1\241\1\13\1\40"+
    "\1\13\1\110\1\13\1\147\4\1\1\13\1\242\1\13\1\40\1\13\1\75\4\1\3\13\1\243\4"+
    "\1\1\67\1\244\1\13\1\143\2\1\1\13\1\121\1\13\1\121\2\1\1\120\1\13\1\151\1"+
    "\1\3\13\1\40\1\13\1\40\1\13\1\31\1\13\1\16\6\1\4\13\1\46\3\1\3\13\1\31\3\13"+
    "\1\31\60\1\1\155\2\13\1\27\4\1\1\155\2\13\2\1\1\13\1\46\1\1\1\155\1\13\1\110"+
    "\2\1\2\13\1\245\1\155\2\13\1\31\1\246\1\247\2\1\1\13\1\22\1\152\5\1\1\250"+
    "\1\251\1\46\2\13\1\147\2\1\1\71\1\54\1\55\1\66\1\1\1\252\1\16\11\1\3\13\1"+
    "\151\1\253\3\1\3\13\1\1\1\254\13\1\2\13\1\147\2\1\1\255\2\1\3\13\1\1\1\256"+
    "\3\1\2\13\1\30\5\1\1\13\1\75\30\1\4\13\1\1\1\123\34\1\3\13\1\46\20\1\1\55"+
    "\1\13\1\147\1\1\1\67\2\1\1\210\1\13\67\1\71\13\1\75\16\1\14\13\1\143\53\1"+
    "\2\13\1\147\75\1\44\13\1\110\33\1\43\13\1\46\1\13\1\147\7\1\1\13\1\150\1\1"+
    "\3\13\1\1\1\143\1\1\1\155\1\257\1\13\67\1\4\13\1\151\1\67\3\1\1\155\4\1\1"+
    "\67\1\1\76\13\1\121\1\1\57\13\1\31\20\1\1\16\77\1\6\13\1\30\1\121\1\46\1\75"+
    "\66\1\5\13\1\214\3\13\1\142\1\260\1\261\1\262\3\13\1\263\1\264\1\13\1\265"+
    "\1\266\1\36\24\13\1\267\1\13\1\36\1\131\1\13\1\131\1\13\1\214\1\13\1\214\1"+
    "\147\1\13\1\147\1\13\1\55\1\13\1\55\1\13\1\216\3\1\14\13\1\151\3\1\4\13\1"+
    "\143\113\1\1\262\1\13\1\270\1\271\1\272\1\273\1\274\1\275\1\276\1\152\1\277"+
    "\1\152\24\1\55\13\1\110\2\1\103\13\1\151\15\13\1\150\150\13\1\16\25\1\41\13"+
    "\1\150\36\1");

  /* The ZZ_CMAP_A table has 3072 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\4\1\22\0\1\2\1\0\1\6\1\3\3\0\1\4\1\26\1\27\1\0\1\21\1\20\1\7\1\11"+
    "\1\0\12\10\1\16\1\17\1\24\1\15\1\25\1\0\1\30\32\14\1\0\1\5\2\0\1\13\1\0\1"+
    "\37\1\14\1\43\1\45\1\31\1\35\1\40\1\14\1\47\2\14\1\36\1\34\1\32\1\44\1\52"+
    "\1\46\1\42\1\41\1\50\1\33\2\14\1\51\2\14\1\22\1\0\1\23\7\0\1\1\12\0\1\2\11"+
    "\0\1\12\12\0\1\12\4\0\1\12\5\0\27\12\1\0\12\12\4\0\14\12\16\0\5\12\7\0\1\12"+
    "\1\0\1\12\1\0\5\12\1\0\2\12\2\0\4\12\1\0\1\12\6\0\1\12\1\0\3\12\1\0\1\12\1"+
    "\0\4\12\1\0\23\12\1\0\13\12\10\0\6\12\1\0\26\12\2\0\1\12\6\0\10\12\10\0\13"+
    "\12\5\0\3\12\33\0\6\12\1\0\1\12\17\0\2\12\7\0\2\12\12\0\3\12\2\0\2\12\1\0"+
    "\16\12\15\0\11\12\13\0\1\12\30\0\6\12\4\0\2\12\4\0\1\12\5\0\6\12\4\0\1\12"+
    "\11\0\1\12\3\0\1\12\7\0\11\12\7\0\5\12\1\0\10\12\6\0\26\12\3\0\1\12\2\0\1"+
    "\12\7\0\11\12\4\0\10\12\2\0\2\12\2\0\26\12\1\0\7\12\1\0\1\12\3\0\4\12\3\0"+
    "\1\12\20\0\1\12\15\0\2\12\1\0\1\12\5\0\6\12\4\0\2\12\1\0\2\12\1\0\2\12\1\0"+
    "\2\12\17\0\4\12\1\0\1\12\3\0\3\12\20\0\11\12\1\0\2\12\1\0\2\12\1\0\5\12\3"+
    "\0\1\12\2\0\1\12\30\0\1\12\13\0\10\12\2\0\1\12\3\0\1\12\1\0\6\12\3\0\3\12"+
    "\1\0\4\12\3\0\2\12\1\0\1\12\1\0\2\12\3\0\2\12\3\0\3\12\3\0\14\12\13\0\10\12"+
    "\1\0\2\12\10\0\3\12\5\0\1\12\4\0\10\12\1\0\6\12\1\0\5\12\3\0\1\12\3\0\2\12"+
    "\15\0\13\12\2\0\1\12\6\0\3\12\10\0\1\12\5\0\22\12\3\0\10\12\1\0\11\12\1\0"+
    "\1\12\2\0\7\12\11\0\1\12\1\0\2\12\15\0\2\12\1\0\1\12\2\0\2\12\1\0\1\12\2\0"+
    "\1\12\6\0\4\12\1\0\7\12\1\0\3\12\1\0\1\12\1\0\1\12\2\0\2\12\1\0\4\12\1\0\2"+
    "\12\11\0\1\12\2\0\5\12\1\0\1\12\25\0\14\12\1\0\24\12\13\0\5\12\22\0\7\12\4"+
    "\0\4\12\3\0\1\12\3\0\2\12\7\0\3\12\4\0\15\12\14\0\1\12\1\0\6\12\1\0\1\12\5"+
    "\0\1\12\2\0\13\12\1\0\15\12\1\0\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2\0\1\12\1"+
    "\0\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2\0\16\12\2\0\6\12\2\0\15\12\2\0\1\12\1"+
    "\2\17\12\1\0\10\12\7\0\15\12\1\0\6\12\23\0\1\12\4\0\1\12\3\0\5\12\2\0\22\12"+
    "\1\0\1\12\5\0\17\12\1\0\16\12\2\0\5\12\13\0\14\12\13\0\1\12\15\0\7\12\7\0"+
    "\16\12\15\0\2\12\11\0\4\12\1\0\4\12\3\0\2\12\11\0\10\12\1\0\1\12\1\0\1\12"+
    "\1\0\1\12\1\0\6\12\1\0\7\12\1\0\1\12\3\0\3\12\1\0\7\12\3\0\4\12\2\0\6\12\4"+
    "\0\13\2\15\0\2\1\5\0\1\2\17\0\1\2\1\0\1\12\15\0\1\12\2\0\1\12\4\0\1\12\2\0"+
    "\12\12\1\0\1\12\3\0\5\12\6\0\1\12\1\0\1\12\1\0\1\12\1\0\4\12\1\0\13\12\2\0"+
    "\4\12\5\0\5\12\4\0\1\12\4\0\2\12\13\0\5\12\6\0\4\12\3\0\2\12\14\0\10\12\7"+
    "\0\10\12\1\0\7\12\1\0\1\2\4\0\2\12\12\0\5\12\5\0\2\12\3\0\7\12\6\0\3\12\12"+
    "\0\2\12\13\0\11\12\2\0\27\12\2\0\7\12\1\0\3\12\1\0\4\12\1\0\4\12\2\0\6\12"+
    "\3\0\1\12\1\0\1\12\2\0\5\12\1\0\12\12\12\0\5\12\1\0\3\12\1\0\10\12\4\0\7\12"+
    "\3\0\1\12\3\0\2\12\1\0\1\12\3\0\2\12\2\0\5\12\2\0\1\12\1\0\1\12\30\0\3\12"+
    "\3\0\6\12\2\0\6\12\2\0\6\12\11\0\7\12\4\0\5\12\3\0\5\12\5\0\1\12\1\0\10\12"+
    "\1\0\5\12\1\0\1\12\1\0\2\12\1\0\2\12\1\0\12\12\6\0\12\12\2\0\6\12\2\0\6\12"+
    "\2\0\6\12\2\0\3\12\3\0\14\12\1\0\16\12\1\0\2\12\1\0\2\12\1\0\10\12\6\0\4\12"+
    "\4\0\16\12\2\0\1\12\1\0\14\12\1\0\2\12\3\0\1\12\2\0\4\12\1\0\2\12\12\0\10"+
    "\12\6\0\6\12\1\0\3\12\1\0\12\12\3\0\1\12\12\0\4\12\25\0\1\12\1\0\1\12\3\0"+
    "\7\12\1\0\1\12\1\0\4\12\1\0\17\12\1\0\2\12\14\0\3\12\7\0\4\12\11\0\2\12\1"+
    "\0\1\12\20\0\4\12\10\0\1\12\13\0\10\12\5\0\3\12\2\0\1\12\2\0\2\12\2\0\4\12"+
    "\1\0\14\12\1\0\1\12\1\0\7\12\1\0\21\12\1\0\4\12\2\0\10\12\1\0\7\12\1\0\14"+
    "\12\1\0\4\12\1\0\5\12\1\0\1\12\3\0\14\12\2\0\10\12\1\0\2\12\1\0\1\12\2\0\1"+
    "\12\1\0\12\12\1\0\4\12\1\0\1\12\1\0\1\12\6\0\1\12\4\0\1\12\1\0\1\12\1\0\1"+
    "\12\1\0\3\12\1\0\2\12\1\0\1\12\2\0\1\12\1\0\1\12\1\0\1\12\1\0\1\12\1\0\1\12"+
    "\1\0\2\12\1\0\1\12\2\0\4\12\1\0\7\12\1\0\4\12\1\0\4\12\1\0\1\12\1\0\12\12"+
    "\1\0\5\12\1\0\3\12\1\0\5\12\1\0\5\12");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\3\1\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\11\5\1\0\1\23"+
    "\3\0\2\4\1\5\1\24\14\5\1\23\2\5\1\25"+
    "\2\5\1\26\3\5\1\27\3\5\1\30\2\5\1\31"+
    "\7\5\1\32\2\5\1\33\3\5\1\34\1\35\1\36"+
    "\2\5\1\37\2\5\1\40\1\5\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\53\0\53\0\53\0\53\0\53"+
    "\0\53\0\53\0\53\0\53\0\53\0\53\0\53\0\u01d9"+
    "\0\u0204\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331"+
    "\0\254\0\53\0\u035c\0\327\0\u0387\0\u03b2\0\u0158\0\u03dd"+
    "\0\u0183\0\u0408\0\u0433\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a"+
    "\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1\0\327\0\u060c\0\u0637"+
    "\0\u0183\0\u0662\0\u068d\0\u0183\0\u06b8\0\u06e3\0\u070e\0\u0183"+
    "\0\u0739\0\u0764\0\u078f\0\u0183\0\u07ba\0\u07e5\0\u0183\0\u0810"+
    "\0\u083b\0\u0866\0\u0891\0\u08bc\0\u08e7\0\u0912\0\u0183\0\u093d"+
    "\0\u0968\0\u0183\0\u0993\0\u09be\0\u09e9\0\u0183\0\u0183\0\u0183"+
    "\0\u0a14\0\u0a3f\0\u0183\0\u0a6a\0\u0a95\0\u0183\0\u0ac0\0\u0183";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\12\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\2\12\1\31\1\32\1\33\2\12\1\34\1\35"+
    "\1\36\1\37\2\12\1\40\3\12\54\0\2\3\50\0"+
    "\1\4\1\0\51\4\4\41\1\42\1\43\45\41\5\44"+
    "\1\45\1\42\44\44\10\0\1\46\52\0\1\10\1\47"+
    "\1\0\2\13\14\0\22\13\10\0\1\47\52\0\1\12"+
    "\2\0\2\12\14\0\22\12\10\0\1\13\2\0\2\13"+
    "\14\0\22\13\10\0\1\12\2\0\2\12\14\0\1\12"+
    "\1\50\13\12\1\51\2\12\1\52\1\12\10\0\1\12"+
    "\2\0\2\12\14\0\6\12\1\53\13\12\10\0\1\12"+
    "\2\0\2\12\14\0\5\12\1\54\14\12\10\0\1\12"+
    "\2\0\2\12\14\0\16\12\1\55\3\12\10\0\1\12"+
    "\2\0\2\12\14\0\1\56\16\12\1\57\2\12\10\0"+
    "\1\12\2\0\2\12\14\0\1\60\21\12\10\0\1\12"+
    "\2\0\2\12\14\0\13\12\1\61\6\12\10\0\1\12"+
    "\2\0\2\12\14\0\11\12\1\62\7\12\1\63\10\0"+
    "\1\12\2\0\2\12\14\0\1\12\1\64\1\12\1\65"+
    "\16\12\1\41\1\0\51\41\5\44\1\45\1\66\44\44"+
    "\10\0\1\46\1\47\51\0\1\12\2\0\2\12\14\0"+
    "\2\12\1\67\17\12\10\0\1\12\2\0\2\12\14\0"+
    "\17\12\1\70\2\12\10\0\1\12\2\0\2\12\14\0"+
    "\21\12\1\71\10\0\1\12\2\0\2\12\14\0\6\12"+
    "\1\72\13\12\10\0\1\12\2\0\2\12\14\0\10\12"+
    "\1\73\11\12\10\0\1\12\2\0\2\12\14\0\17\12"+
    "\1\74\2\12\10\0\1\12\2\0\2\12\14\0\6\12"+
    "\1\75\13\12\10\0\1\12\2\0\2\12\14\0\12\12"+
    "\1\76\7\12\10\0\1\12\2\0\2\12\14\0\1\12"+
    "\1\77\20\12\10\0\1\12\2\0\2\12\14\0\14\12"+
    "\1\100\5\12\10\0\1\12\2\0\2\12\14\0\17\12"+
    "\1\101\2\12\10\0\1\12\2\0\2\12\14\0\17\12"+
    "\1\102\2\12\10\0\1\12\2\0\2\12\14\0\21\12"+
    "\1\103\10\0\1\12\2\0\2\12\14\0\3\12\1\104"+
    "\16\12\10\0\1\12\2\0\2\12\14\0\1\105\21\12"+
    "\10\0\1\12\2\0\2\12\14\0\7\12\1\106\12\12"+
    "\10\0\1\12\2\0\2\12\14\0\17\12\1\107\2\12"+
    "\10\0\1\12\2\0\2\12\14\0\17\12\1\110\2\12"+
    "\10\0\1\12\2\0\2\12\14\0\13\12\1\111\6\12"+
    "\10\0\1\12\2\0\2\12\14\0\10\12\1\112\11\12"+
    "\10\0\1\12\2\0\2\12\14\0\16\12\1\113\3\12"+
    "\10\0\1\12\2\0\2\12\14\0\1\114\21\12\10\0"+
    "\1\12\2\0\2\12\14\0\13\12\1\115\6\12\10\0"+
    "\1\12\2\0\2\12\14\0\11\12\1\116\10\12\10\0"+
    "\1\12\2\0\2\12\14\0\10\12\1\117\11\12\10\0"+
    "\1\12\2\0\2\12\14\0\16\12\1\120\3\12\10\0"+
    "\1\12\2\0\2\12\14\0\11\12\1\121\10\12\10\0"+
    "\1\12\2\0\2\12\14\0\17\12\1\122\2\12\10\0"+
    "\1\12\2\0\2\12\14\0\13\12\1\123\6\12\10\0"+
    "\1\12\2\0\2\12\14\0\11\12\1\124\10\12\10\0"+
    "\1\12\2\0\2\12\14\0\11\12\1\125\10\12\10\0"+
    "\1\12\2\0\2\12\14\0\1\12\1\126\20\12\10\0"+
    "\1\12\2\0\2\12\14\0\12\12\1\127\7\12\10\0"+
    "\1\12\2\0\2\12\14\0\14\12\1\130\5\12\10\0"+
    "\1\12\2\0\2\12\14\0\1\12\1\131\20\12\10\0"+
    "\1\12\2\0\2\12\14\0\4\12\1\132\15\12\10\0"+
    "\1\12\2\0\2\12\14\0\17\12\1\133\2\12\10\0"+
    "\1\12\2\0\2\12\14\0\6\12\1\134\13\12\10\0"+
    "\1\12\2\0\2\12\14\0\6\12\1\135\13\12\10\0"+
    "\1\12\2\0\2\12\14\0\5\12\1\136\14\12\10\0"+
    "\1\12\2\0\2\12\14\0\12\12\1\137\7\12\10\0"+
    "\1\12\2\0\2\12\14\0\1\140\21\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2795];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\11\1\14\11\11\1\1\0\1\11\3\0"+
    "\73\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _DjinniLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _DjinniLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 34: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 35: break;
          case 3: 
            { return COMMENT;
            } 
            // fall through
          case 36: break;
          case 4: 
            { return NUMBER_LITERAL;
            } 
            // fall through
          case 37: break;
          case 5: 
            { return IDENTIFIER;
            } 
            // fall through
          case 38: break;
          case 6: 
            { return TEXT;
            } 
            // fall through
          case 39: break;
          case 7: 
            { return EQ;
            } 
            // fall through
          case 40: break;
          case 8: 
            { return COLON;
            } 
            // fall through
          case 41: break;
          case 9: 
            { return SEMICOLON;
            } 
            // fall through
          case 42: break;
          case 10: 
            { return LIST_SEPARATOR;
            } 
            // fall through
          case 43: break;
          case 11: 
            { return PLUS;
            } 
            // fall through
          case 44: break;
          case 12: 
            { return LEFT_BLOCK_BRACE;
            } 
            // fall through
          case 45: break;
          case 13: 
            { return RIGHT_BLOCK_BRACE;
            } 
            // fall through
          case 46: break;
          case 14: 
            { return LEFT_GENERICS_BRACE;
            } 
            // fall through
          case 47: break;
          case 15: 
            { return RIGHT_GENERICS_BRACE;
            } 
            // fall through
          case 48: break;
          case 16: 
            { return LEFT_PARAM_BRACE;
            } 
            // fall through
          case 49: break;
          case 17: 
            { return RIGHT_PARAM_BRACE;
            } 
            // fall through
          case 50: break;
          case 18: 
            { return AT;
            } 
            // fall through
          case 51: break;
          case 19: 
            { return STRING_LITERAL;
            } 
            // fall through
          case 52: break;
          case 20: 
            { return EQ_KEYWORD;
            } 
            // fall through
          case 53: break;
          case 21: 
            { return MAP;
            } 
            // fall through
          case 54: break;
          case 22: 
            { return SET;
            } 
            // fall through
          case 55: break;
          case 23: 
            { return ORD;
            } 
            // fall through
          case 56: break;
          case 24: 
            { return ENUM;
            } 
            // fall through
          case 57: break;
          case 25: 
            { return LIST;
            } 
            // fall through
          case 58: break;
          case 26: 
            { return FLAGS;
            } 
            // fall through
          case 59: break;
          case 27: 
            { return CONST;
            } 
            // fall through
          case 60: break;
          case 28: 
            { return EXTERN;
            } 
            // fall through
          case 61: break;
          case 29: 
            { return STATIC;
            } 
            // fall through
          case 62: break;
          case 30: 
            { return RECORD;
            } 
            // fall through
          case 63: break;
          case 31: 
            { return IMPORT;
            } 
            // fall through
          case 64: break;
          case 32: 
            { return OPTIONAL;
            } 
            // fall through
          case 65: break;
          case 33: 
            { return INTERFACE;
            } 
            // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
