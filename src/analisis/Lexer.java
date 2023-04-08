// DO NOT EDIT
// Generated by JFlex 1.9.0 http://jflex.de/
// source: Lexer.Flex

package analisis;

import java_cup.runtime.*;

@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\1\22\0\1\1\1\4"+
    "\4\0\1\5\1\0\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\0\1\14\12\15\1\0\1\16\1\17\1\20"+
    "\1\21\2\0\32\22\4\0\1\22\1\0\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\2\22"+
    "\1\34\1\35\1\36\1\37\1\40\1\22\1\41\1\42"+
    "\1\43\1\44\1\45\3\22\1\46\1\47\1\50\1\51"+
    "\7\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\20\20\1\21\1\1\1\22\1\23\1\24\1\25"+
    "\1\26\1\0\1\27\1\30\1\31\1\32\15\20\1\33"+
    "\17\20\1\34\15\20\1\35\6\20\1\36\2\20\1\37"+
    "\3\20\1\40\10\20\1\41\2\20\1\42\22\20\1\43"+
    "\1\20\1\44\2\20\1\45\12\20\1\46\3\20\1\47"+
    "\5\20\1\50\6\20\1\51\1\52\5\20\1\53\1\54"+
    "\1\20\1\55\1\56\12\20\1\57\5\20\1\60\2\20"+
    "\1\61\1\20\1\62\5\20\1\63\1\20\1\64\1\20"+
    "\1\65\1\66\1\67\1\70\2\20\1\71\1\72\1\20"+
    "\1\73\1\74\1\75\1\20\1\76\1\20\1\77";

  private static int [] zzUnpackAction() {
    int [] result = new int[226];
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
    "\0\0\0\52\0\124\0\52\0\176\0\250\0\52\0\52"+
    "\0\52\0\322\0\52\0\374\0\u0126\0\u0150\0\52\0\u017a"+
    "\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276\0\u02a0\0\u02ca"+
    "\0\u02f4\0\u031e\0\u0348\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u041a"+
    "\0\u0444\0\u046e\0\52\0\u0498\0\52\0\52\0\52\0\52"+
    "\0\52\0\u04c2\0\u04ec\0\52\0\52\0\52\0\u0516\0\u0540"+
    "\0\u056a\0\u0594\0\u05be\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0690"+
    "\0\u06ba\0\u06e4\0\u070e\0\u01f8\0\u0738\0\u0762\0\u078c\0\u07b6"+
    "\0\u07e0\0\u080a\0\u0834\0\u085e\0\u0888\0\u08b2\0\u08dc\0\u0906"+
    "\0\u0930\0\u095a\0\u0984\0\52\0\u09ae\0\u09d8\0\u0a02\0\u0a2c"+
    "\0\u0a56\0\u0a80\0\u0aaa\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c"+
    "\0\u0ba6\0\u01f8\0\u0bd0\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2"+
    "\0\u01f8\0\u0ccc\0\u0cf6\0\u01f8\0\u0d20\0\u0d4a\0\u0d74\0\u01f8"+
    "\0\u0d9e\0\u0dc8\0\u0df2\0\u0e1c\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4"+
    "\0\u01f8\0\u0eee\0\u0f18\0\u01f8\0\u0f42\0\u0f6c\0\u0f96\0\u0fc0"+
    "\0\u0fea\0\u1014\0\u103e\0\u1068\0\u1092\0\u10bc\0\u10e6\0\u1110"+
    "\0\u113a\0\u1164\0\u118e\0\u11b8\0\u11e2\0\u120c\0\u01f8\0\u1236"+
    "\0\u01f8\0\u1260\0\u128a\0\u01f8\0\u12b4\0\u12de\0\u1308\0\u1332"+
    "\0\u135c\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e\0\u01f8\0\u1458"+
    "\0\u1482\0\u14ac\0\u01f8\0\u14d6\0\u1500\0\u152a\0\u1554\0\u157e"+
    "\0\u01f8\0\u15a8\0\u15d2\0\u15fc\0\u1626\0\u1650\0\u167a\0\u01f8"+
    "\0\u01f8\0\u16a4\0\u16ce\0\u16f8\0\u1722\0\u174c\0\u01f8\0\u01f8"+
    "\0\u1776\0\u01f8\0\u01f8\0\u17a0\0\u17ca\0\u17f4\0\u181e\0\u1848"+
    "\0\u1872\0\u189c\0\u18c6\0\u18f0\0\u191a\0\u01f8\0\u1944\0\u196e"+
    "\0\u1998\0\u19c2\0\u19ec\0\u01f8\0\u1a16\0\u1a40\0\u01f8\0\u1a6a"+
    "\0\u01f8\0\u1a94\0\u1abe\0\u1ae8\0\u1b12\0\u1b3c\0\u01f8\0\u1b66"+
    "\0\u01f8\0\u1b90\0\u01f8\0\u01f8\0\u01f8\0\u01f8\0\u1bba\0\u1be4"+
    "\0\u01f8\0\u01f8\0\u1c0e\0\u01f8\0\u01f8\0\u01f8\0\u1c38\0\u01f8"+
    "\0\u1c62\0\u01f8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[226];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\23\1\25\1\26\1\27"+
    "\1\30\1\23\1\31\1\32\1\33\1\34\1\23\1\35"+
    "\1\36\1\23\1\37\1\40\1\41\1\42\1\23\1\43"+
    "\1\44\1\45\53\0\1\3\70\0\1\46\36\0\1\47"+
    "\55\0\1\50\53\0\1\51\52\0\1\52\52\0\1\16"+
    "\4\0\25\53\23\0\1\54\51\0\1\55\51\0\1\56"+
    "\46\0\1\23\4\0\25\23\20\0\1\23\4\0\2\23"+
    "\1\57\1\23\1\60\11\23\1\61\6\23\20\0\1\23"+
    "\4\0\1\23\1\62\3\23\1\63\7\23\1\64\7\23"+
    "\20\0\1\23\4\0\5\23\1\65\3\23\1\66\13\23"+
    "\20\0\1\23\4\0\14\23\1\67\3\23\1\70\4\23"+
    "\20\0\1\23\4\0\1\23\1\71\7\23\1\72\10\23"+
    "\1\73\2\23\20\0\1\23\4\0\17\23\1\74\5\23"+
    "\20\0\1\23\4\0\14\23\1\75\10\23\20\0\1\23"+
    "\4\0\15\23\1\76\4\23\1\77\2\23\20\0\1\23"+
    "\4\0\1\23\1\100\7\23\1\101\13\23\20\0\1\23"+
    "\4\0\2\23\1\102\22\23\20\0\1\23\4\0\5\23"+
    "\1\103\7\23\1\104\4\23\1\105\2\23\20\0\1\23"+
    "\4\0\1\23\1\106\3\23\1\107\3\23\1\110\13\23"+
    "\20\0\1\23\4\0\5\23\1\111\17\23\20\0\1\23"+
    "\4\0\20\23\1\112\4\23\20\0\1\23\4\0\5\23"+
    "\1\113\17\23\53\0\1\114\1\0\2\52\1\4\47\52"+
    "\15\0\1\53\4\0\25\53\20\0\1\23\4\0\17\23"+
    "\1\115\5\23\20\0\1\23\4\0\13\23\1\116\11\23"+
    "\20\0\1\23\4\0\1\23\1\117\23\23\20\0\1\23"+
    "\4\0\4\23\1\120\20\23\20\0\1\23\4\0\17\23"+
    "\1\121\5\23\20\0\1\23\4\0\13\23\1\122\1\123"+
    "\10\23\20\0\1\23\4\0\3\23\1\124\21\23\20\0"+
    "\1\23\4\0\20\23\1\125\4\23\20\0\1\23\4\0"+
    "\3\23\1\126\15\23\1\127\3\23\20\0\1\23\4\0"+
    "\21\23\1\130\3\23\20\0\1\23\4\0\12\23\1\131"+
    "\12\23\20\0\1\23\4\0\14\23\1\132\10\23\20\0"+
    "\1\23\4\0\14\23\1\133\10\23\20\0\1\23\4\0"+
    "\11\23\1\134\13\23\20\0\1\23\4\0\7\23\1\135"+
    "\15\23\20\0\1\23\4\0\3\23\1\136\21\23\20\0"+
    "\1\23\4\0\14\23\1\137\10\23\20\0\1\23\4\0"+
    "\5\23\1\140\6\23\1\141\10\23\20\0\1\23\4\0"+
    "\21\23\1\142\3\23\20\0\1\23\4\0\17\23\1\143"+
    "\5\23\20\0\1\23\4\0\17\23\1\144\5\23\20\0"+
    "\1\23\4\0\5\23\1\145\17\23\20\0\1\23\4\0"+
    "\12\23\1\146\1\23\1\147\10\23\20\0\1\23\4\0"+
    "\7\23\1\150\15\23\20\0\1\23\4\0\14\23\1\151"+
    "\10\23\20\0\1\23\4\0\13\23\1\152\11\23\20\0"+
    "\1\23\4\0\1\23\1\153\23\23\20\0\1\23\4\0"+
    "\14\23\1\154\2\23\1\155\5\23\20\0\1\23\4\0"+
    "\11\23\1\156\13\23\20\0\1\23\4\0\11\23\1\157"+
    "\13\23\20\0\1\23\4\0\7\23\1\160\15\23\20\0"+
    "\1\23\4\0\1\23\1\161\23\23\20\0\1\23\4\0"+
    "\17\23\1\162\5\23\20\0\1\23\4\0\11\23\1\163"+
    "\3\23\1\164\7\23\20\0\1\23\4\0\4\23\1\165"+
    "\20\23\20\0\1\23\4\0\12\23\1\166\12\23\20\0"+
    "\1\23\4\0\16\23\1\167\6\23\20\0\1\23\4\0"+
    "\5\23\1\170\17\23\20\0\1\23\4\0\5\23\1\171"+
    "\17\23\20\0\1\23\4\0\1\23\1\172\23\23\20\0"+
    "\1\23\4\0\20\23\1\173\4\23\20\0\1\23\4\0"+
    "\3\23\1\174\21\23\20\0\1\23\4\0\3\23\1\175"+
    "\21\23\20\0\1\23\4\0\11\23\1\176\13\23\20\0"+
    "\1\23\4\0\5\23\1\177\17\23\20\0\1\23\4\0"+
    "\21\23\1\200\3\23\20\0\1\23\4\0\14\23\1\201"+
    "\10\23\20\0\1\23\4\0\5\23\1\202\17\23\20\0"+
    "\1\23\4\0\20\23\1\203\4\23\20\0\1\23\4\0"+
    "\17\23\1\204\5\23\20\0\1\23\4\0\11\23\1\205"+
    "\13\23\20\0\1\23\4\0\11\23\1\206\13\23\20\0"+
    "\1\23\4\0\15\23\1\207\7\23\20\0\1\23\4\0"+
    "\16\23\1\210\6\23\20\0\1\23\4\0\17\23\1\211"+
    "\5\23\20\0\1\23\4\0\21\23\1\212\3\23\20\0"+
    "\1\23\4\0\4\23\1\213\20\23\20\0\1\23\4\0"+
    "\17\23\1\214\5\23\20\0\1\23\4\0\21\23\1\215"+
    "\3\23\20\0\1\23\4\0\1\23\1\216\23\23\20\0"+
    "\1\23\4\0\1\23\1\217\23\23\20\0\1\23\4\0"+
    "\5\23\1\220\17\23\20\0\1\23\4\0\11\23\1\221"+
    "\13\23\20\0\1\23\4\0\1\23\1\222\23\23\20\0"+
    "\1\23\4\0\5\23\1\223\17\23\20\0\1\23\4\0"+
    "\14\23\1\224\10\23\20\0\1\23\4\0\17\23\1\225"+
    "\5\23\20\0\1\23\4\0\4\23\1\226\20\23\20\0"+
    "\1\23\4\0\15\23\1\227\7\23\20\0\1\23\4\0"+
    "\11\23\1\230\13\23\20\0\1\23\4\0\11\23\1\231"+
    "\13\23\20\0\1\23\4\0\3\23\1\232\21\23\20\0"+
    "\1\23\4\0\20\23\1\233\4\23\20\0\1\23\4\0"+
    "\5\23\1\234\17\23\20\0\1\23\4\0\21\23\1\235"+
    "\3\23\20\0\1\23\4\0\14\23\1\236\10\23\20\0"+
    "\1\23\4\0\15\23\1\237\7\23\20\0\1\23\4\0"+
    "\21\23\1\240\3\23\20\0\1\23\4\0\17\23\1\241"+
    "\5\23\20\0\1\23\4\0\21\23\1\242\3\23\20\0"+
    "\1\23\4\0\5\23\1\243\17\23\20\0\1\23\4\0"+
    "\1\23\1\244\7\23\1\245\13\23\20\0\1\23\4\0"+
    "\1\23\1\246\23\23\20\0\1\23\4\0\11\23\1\247"+
    "\13\23\20\0\1\23\4\0\17\23\1\250\5\23\20\0"+
    "\1\23\4\0\17\23\1\251\5\23\20\0\1\23\4\0"+
    "\14\23\1\252\10\23\20\0\1\23\4\0\3\23\1\253"+
    "\21\23\20\0\1\23\4\0\17\23\1\254\5\23\20\0"+
    "\1\23\4\0\14\23\1\255\10\23\20\0\1\23\4\0"+
    "\4\23\1\256\20\23\20\0\1\23\4\0\15\23\1\257"+
    "\7\23\20\0\1\23\4\0\15\23\1\260\7\23\20\0"+
    "\1\23\4\0\15\23\1\261\7\23\20\0\1\23\4\0"+
    "\15\23\1\262\7\23\20\0\1\23\4\0\15\23\1\263"+
    "\7\23\20\0\1\23\4\0\14\23\1\264\10\23\20\0"+
    "\1\23\4\0\17\23\1\265\5\23\20\0\1\23\4\0"+
    "\5\23\1\266\17\23\20\0\1\23\4\0\14\23\1\267"+
    "\10\23\20\0\1\23\4\0\1\23\1\270\23\23\20\0"+
    "\1\23\4\0\11\23\1\271\13\23\20\0\1\23\4\0"+
    "\17\23\1\272\5\23\20\0\1\23\4\0\14\23\1\273"+
    "\10\23\20\0\1\23\4\0\12\23\1\274\12\23\20\0"+
    "\1\23\4\0\4\23\1\275\20\23\20\0\1\23\4\0"+
    "\17\23\1\276\5\23\20\0\1\23\4\0\24\23\1\277"+
    "\20\0\1\23\4\0\11\23\1\300\13\23\20\0\1\23"+
    "\4\0\1\23\1\301\23\23\20\0\1\23\4\0\20\23"+
    "\1\302\4\23\20\0\1\23\4\0\5\23\1\303\17\23"+
    "\20\0\1\23\4\0\14\23\1\304\10\23\20\0\1\23"+
    "\4\0\5\23\1\305\17\23\20\0\1\23\4\0\1\23"+
    "\1\306\23\23\20\0\1\23\4\0\17\23\1\307\5\23"+
    "\20\0\1\23\4\0\1\23\1\310\23\23\20\0\1\23"+
    "\4\0\20\23\1\311\4\23\20\0\1\23\4\0\24\23"+
    "\1\312\20\0\1\23\4\0\1\23\1\313\23\23\20\0"+
    "\1\23\4\0\1\23\1\314\23\23\20\0\1\23\4\0"+
    "\1\23\1\315\23\23\20\0\1\23\4\0\5\23\1\316"+
    "\17\23\20\0\1\23\4\0\15\23\1\317\7\23\20\0"+
    "\1\23\4\0\15\23\1\320\7\23\20\0\1\23\4\0"+
    "\17\23\1\321\5\23\20\0\1\23\4\0\1\23\1\322"+
    "\23\23\20\0\1\23\4\0\17\23\1\323\5\23\20\0"+
    "\1\23\4\0\17\23\1\324\5\23\20\0\1\23\4\0"+
    "\20\23\1\325\4\23\20\0\1\23\4\0\20\23\1\326"+
    "\4\23\20\0\1\23\4\0\1\23\1\327\23\23\20\0"+
    "\1\23\4\0\21\23\1\330\3\23\20\0\1\23\4\0"+
    "\20\23\1\331\4\23\20\0\1\23\4\0\17\23\1\332"+
    "\5\23\20\0\1\23\4\0\17\23\1\333\5\23\20\0"+
    "\1\23\4\0\14\23\1\334\10\23\20\0\1\23\4\0"+
    "\17\23\1\335\5\23\20\0\1\23\4\0\17\23\1\336"+
    "\5\23\20\0\1\23\4\0\22\23\1\337\2\23\20\0"+
    "\1\23\4\0\15\23\1\340\7\23\20\0\1\23\4\0"+
    "\17\23\1\341\5\23\20\0\1\23\4\0\1\23\1\342"+
    "\23\23\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[7308];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\3\11\1\1\1\11"+
    "\3\1\1\11\23\1\1\11\1\1\5\11\1\0\1\1"+
    "\3\11\35\1\1\11\226\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[226];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type){
        Symbol s = new Symbol(type, yyline, yycolumn);
        codigo.FrmPrincipal.tokens.add(s);
        return s;
    }
    private Symbol symbol(int type, Object value){
        Symbol s = new Symbol(type, yyline, yycolumn, value);
        codigo.FrmPrincipal.tokens.add(s);
        return s;
    }

    private void reportarError(String error, String cuerpo, int linea){
        codigo.FrmPrincipal.errores.agregarErrorLexico(error, linea, cuerpo);
        //System.out.println(cuerpo);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { reportarError("EL1", yytext(), yyline + 1);return symbol(sym.error);
            }
          // fall through
          case 64: break;
          case 2:
            { /*Ignore*/
            }
          // fall through
          case 65: break;
          case 3:
            { return symbol(sym.NEGACION);
            }
          // fall through
          case 66: break;
          case 4:
            { return symbol(sym.PARENTESIS_ABIERTO);
            }
          // fall through
          case 67: break;
          case 5:
            { return symbol(sym.PARENTESIS_CERRADO);
            }
          // fall through
          case 68: break;
          case 6:
            { return symbol(sym.AR_MULTIPLICACION);
            }
          // fall through
          case 69: break;
          case 7:
            { return symbol(sym.AR_SUMA);
            }
          // fall through
          case 70: break;
          case 8:
            { return symbol(sym.COMA);
            }
          // fall through
          case 71: break;
          case 9:
            { return symbol(sym.AR_RESTA);
            }
          // fall through
          case 72: break;
          case 10:
            { return symbol(sym.AR_DIVISION);
            }
          // fall through
          case 73: break;
          case 11:
            { return symbol(sym.NUMERO, Integer.parseInt(yytext()));
            }
          // fall through
          case 74: break;
          case 12:
            { return symbol(sym.PUNTO_COMA);
            }
          // fall through
          case 75: break;
          case 13:
            { return symbol(sym.REL_MENOR);
            }
          // fall through
          case 76: break;
          case 14:
            { return symbol(sym.ASIGNACION);
            }
          // fall through
          case 77: break;
          case 15:
            { return symbol(sym.REL_MAYOR);
            }
          // fall through
          case 78: break;
          case 16:
            { return symbol(sym.IDENTIFICADOR, yytext().length() <= 16 ? yytext(): yytext().substring(0,16));
            }
          // fall through
          case 79: break;
          case 17:
            { return symbol(sym.LLAVE_ABIERTA);
            }
          // fall through
          case 80: break;
          case 18:
            { return symbol(sym.LLAVE_CERRADA);
            }
          // fall through
          case 81: break;
          case 19:
            { return symbol(sym.REL_DIFERENTE);
            }
          // fall through
          case 82: break;
          case 20:
            { return symbol(sym.LOGICO_AND);
            }
          // fall through
          case 83: break;
          case 21:
            { return symbol(sym.INC);
            }
          // fall through
          case 84: break;
          case 22:
            { return symbol(sym.DEC);
            }
          // fall through
          case 85: break;
          case 23:
            { reportarError("EL2", yytext().length() <= 16 ? yytext(): yytext().substring(0,16), yyline + 1);return symbol(sym.error, yytext());
            }
          // fall through
          case 86: break;
          case 24:
            { return symbol(sym.REL_MENOR_IGUAL);
            }
          // fall through
          case 87: break;
          case 25:
            { return symbol(sym.REL_IGUAL);
            }
          // fall through
          case 88: break;
          case 26:
            { return symbol(sym.REL_MAYOR_IGUAL);
            }
          // fall through
          case 89: break;
          case 27:
            { return symbol(sym.HR);
            }
          // fall through
          case 90: break;
          case 28:
            { return symbol(sym.LOGICO_OR);
            }
          // fall through
          case 91: break;
          case 29:
            { return symbol(sym.FIN);
            }
          // fall through
          case 92: break;
          case 30:
            { return symbol(sym.MIN);
            }
          // fall through
          case 93: break;
          case 31:
            { return symbol(sym.POR);
            }
          // fall through
          case 94: break;
          case 32:
            { return symbol(sym.SEG);
            }
          // fall through
          case 95: break;
          case 33:
            { return symbol(sym.CADA);
            }
          // fall through
          case 96: break;
          case 34:
            { return symbol(sym.COMO);
            }
          // fall through
          case 97: break;
          case 35:
            { return symbol(sym.SINO);
            }
          // fall through
          case 98: break;
          case 36:
            { return symbol(sym.USAR);
            }
          // fall through
          case 99: break;
          case 37:
            { return symbol(sym.ABRIR);
            }
          // fall through
          case 100: break;
          case 38:
            { return symbol(sym.OP_BOOLEANO, false);
            }
          // fall through
          case 101: break;
          case 39:
            { return symbol(sym.LUCES);
            }
          // fall through
          case 102: break;
          case 40:
            { return symbol(sym.SALIR);
            }
          // fall through
          case 103: break;
          case 41:
            { return symbol(sym.APAGAR);
            }
          // fall through
          case 104: break;
          case 42:
            { return symbol(sym.CERRAR);
            }
          // fall through
          case 105: break;
          case 43:
            { return symbol(sym.ENTERO);
            }
          // fall through
          case 106: break;
          case 44:
            { return symbol(sym.ESTADO);
            }
          // fall through
          case 107: break;
          case 45:
            { return symbol(sym.INICIO);
            }
          // fall through
          case 108: break;
          case 46:
            { return symbol(sym.LOGICO);
            }
          // fall through
          case 109: break;
          case 47:
            { return symbol(sym.ADMITIR);
            }
          // fall through
          case 110: break;
          case 48:
            { return symbol(sym.FUNCION);
            }
          // fall through
          case 111: break;
          case 49:
            { return symbol(sym.OBTENER);
            }
          // fall through
          case 112: break;
          case 50:
            { return symbol(sym.PUERTAS);
            }
          // fall through
          case 113: break;
          case 51:
            { return symbol(sym.COMIENZO);
            }
          // fall through
          case 114: break;
          case 52:
            { return symbol(sym.DECLARAR);
            }
          // fall through
          case 115: break;
          case 53:
            { return symbol(sym.ENCENDER);
            }
          // fall through
          case 116: break;
          case 54:
            { return symbol(sym.MANTENER);
            }
          // fall through
          case 117: break;
          case 55:
            { return symbol(sym.MIENTRAS);
            }
          // fall through
          case 118: break;
          case 56:
            { return symbol(sym.PERSONAS);
            }
          // fall through
          case 119: break;
          case 57:
            { return symbol(sym.VENTANAS);
            }
          // fall through
          case 120: break;
          case 58:
            { return symbol(sym.VENTILAR);
            }
          // fall through
          case 121: break;
          case 59:
            { return symbol(sym.CONDICION);
            }
          // fall through
          case 122: break;
          case 60:
            { return symbol(sym.DISPENSAR);
            }
          // fall through
          case 123: break;
          case 61:
            { return symbol(sym.SANITIZAR);
            }
          // fall through
          case 124: break;
          case 62:
            { return symbol(sym.OP_BOOLEANO, true);
            }
          // fall through
          case 125: break;
          case 63:
            { return symbol(sym.TEMPERATURA);
            }
          // fall through
          case 126: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
