package org.adligo.bytes.shared;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.adligo.i_bytes.shared.I_Bytes;

/**
 * This class is a immutable representation of bytes, which mimics immutability
 * by providing a view of a underlying byte array or ByteArrays. Mimicking
 * immutability allows use of a psudo functional style while NOT duplicating
 * memory for actual immutability. <br/>
 *   Also note that a {@link Supplier}&lt;Optional&lt;Bytes&gt;&gt;> or 
 * {@link Consumer}&lt;Optional&lt;Bytes&gt;&gt; may be 
 * used to represent infinite streams of Bytes. <br/>
 * This class also contains a list of all
 * {@link <a href="https://en.wikipedia.org/wiki/Endianness">Little Ending</a>} 
 * Unsigned bytes (i.e. {@link Bytes#U0} ).
 * 
 * 
 * @author scott
 *
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code><pre>
 */
public class Bytes implements I_Bytes {
  public static final String HEX_CHARS = "0123456789abcdef";
  // 084c 2a6d 195e 3b7f
  public static final String HEX_CHARS_REVERSED = "084c2a6d195e3b7f";
  
  public static final byte U0 = 0x00;
  public static final byte U1 = 0x01;
  public static final byte U2 = 0x02;
  public static final byte U3 = 0x03;
  public static final byte U4 = 0x04;
  public static final byte U5 = 0x05;
  public static final byte U6 = 0x06;
  public static final byte U7 = 0x07;
  public static final byte U8 = 0x08;
  public static final byte U9 = 0x09;
  public static final byte U10 = 0x0a;
  public static final byte U11 = 0x0b;
  public static final byte U12 = 0x0c;
  public static final byte U13 = 0x0d;
  public static final byte U14 = 0x0e;
  public static final byte U15 = 0x0f;

  public static final byte U16 = 0x10;
  public static final byte U17 = 0x11;
  public static final byte U18 = 0x12;
  public static final byte U19 = 0x13;
  public static final byte U20 = 0x14;
  public static final byte U21 = 0x15;
  public static final byte U22 = 0x16;
  public static final byte U23 = 0x17;
  public static final byte U24 = 0x18;
  public static final byte U25 = 0x19;
  public static final byte U26 = 0x1a;
  public static final byte U27 = 0x1b;
  public static final byte U28 = 0x1c;
  public static final byte U29 = 0x1d;
  public static final byte U30 = 0x1e;
  public static final byte U31 = 0x1f;

  public static final byte U32 = 0x20;
  public static final byte U33 = 0x21;
  public static final byte U34 = 0x22;
  public static final byte U35 = 0x23;
  public static final byte U36 = 0x24;
  public static final byte U37 = 0x25;
  public static final byte U38 = 0x26;
  public static final byte U39 = 0x27;
  public static final byte U40 = 0x28;
  public static final byte U41 = 0x29;
  public static final byte U42 = 0x2a;
  public static final byte U43 = 0x2b;
  public static final byte U44 = 0x2c;
  public static final byte U45 = 0x2d;
  public static final byte U46 = 0x2e;
  public static final byte U47 = 0x2f;

  public static final byte U48 = 0x30;
  public static final byte U49 = 0x31;
  public static final byte U50 = 0x32;
  public static final byte U51 = 0x33;
  public static final byte U52 = 0x34;
  public static final byte U53 = 0x35;
  public static final byte U54 = 0x36;
  public static final byte U55 = 0x37;
  public static final byte U56 = 0x38;
  public static final byte U57 = 0x39;
  public static final byte U58 = 0x3a;
  public static final byte U59 = 0x3b;
  public static final byte U60 = 0x3c;
  public static final byte U61 = 0x3d;
  public static final byte U62 = 0x3e;
  public static final byte U63 = 0x3f;

  public static final byte U64 = 0x40;
  public static final byte U65 = 0x41;
  public static final byte U66 = 0x42;
  public static final byte U67 = 0x43;
  public static final byte U68 = 0x44;
  public static final byte U69 = 0x45;
  public static final byte U70 = 0x46;
  public static final byte U71 = 0x47;
  public static final byte U72 = 0x48;
  public static final byte U73 = 0x49;
  public static final byte U74 = 0x4a;
  public static final byte U75 = 0x4b;
  public static final byte U76 = 0x4c;
  public static final byte U77 = 0x4d;
  public static final byte U78 = 0x4e;
  public static final byte U79 = 0x4f;

  public static final byte U80 = 0x50;
  public static final byte U81 = 0x51;
  public static final byte U82 = 0x52;
  public static final byte U83 = 0x53;
  public static final byte U84 = 0x54;
  public static final byte U85 = 0x55;
  public static final byte U86 = 0x56;
  public static final byte U87 = 0x57;
  public static final byte U88 = 0x58;
  public static final byte U89 = 0x59;
  public static final byte U90 = 0x5a;
  public static final byte U91 = 0x5b;
  public static final byte U92 = 0x5c;
  public static final byte U93 = 0x5d;
  public static final byte U94 = 0x5e;
  public static final byte U95 = 0x5f;

  public static final byte U96 = 0x60;
  public static final byte U97 = 0x61;
  public static final byte U98 = 0x62;
  public static final byte U99 = 0x63;
  public static final byte U100 = 0x64;
  public static final byte U101 = 0x65;
  public static final byte U102 = 0x66;
  public static final byte U103 = 0x67;
  public static final byte U104 = 0x68;
  public static final byte U105 = 0x69;
  public static final byte U106 = 0x6a;
  public static final byte U107 = 0x6b;
  public static final byte U108 = 0x6c;
  public static final byte U109 = 0x6d;
  public static final byte U110 = 0x6e;
  public static final byte U111 = 0x6f;

  public static final byte U112 = 0x70;
  public static final byte U113 = 0x71;
  public static final byte U114 = 0x72;
  public static final byte U115 = 0x73;
  public static final byte U116 = 0x74;
  public static final byte U117 = 0x75;
  public static final byte U118 = 0x76;
  public static final byte U119 = 0x77;
  public static final byte U120 = 0x78;
  public static final byte U121 = 0x79;
  public static final byte U122 = 0x7a;
  public static final byte U123 = 0x7b;
  public static final byte U124 = 0x7c;
  public static final byte U125 = 0x7d;
  public static final byte U126 = 0x7e;
  public static final byte U127 = 0x7f;

  public static final byte U128 = (byte) 0x80;
  public static final byte U129 = (byte) 0x81;
  public static final byte U130 = (byte) 0x82;
  public static final byte U131 = (byte) 0x83;
  public static final byte U132 = (byte) 0x84;
  public static final byte U133 = (byte) 0x85;
  public static final byte U134 = (byte) 0x86;
  public static final byte U135 = (byte) 0x87;
  public static final byte U136 = (byte) 0x88;
  public static final byte U137 = (byte) 0x89;
  public static final byte U138 = (byte) 0x8a;
  public static final byte U139 = (byte) 0x8b;
  public static final byte U140 = (byte) 0x8c;
  public static final byte U141 = (byte) 0x8d;
  public static final byte U142 = (byte) 0x8e;
  public static final byte U143 = (byte) 0x8f;

  public static final byte U144 = (byte) 0x90;
  public static final byte U145 = (byte) 0x91;
  public static final byte U146 = (byte) 0x92;
  public static final byte U147 = (byte) 0x93;
  public static final byte U148 = (byte) 0x94;
  public static final byte U149 = (byte) 0x95;
  public static final byte U150 = (byte) 0x96;
  public static final byte U151 = (byte) 0x97;
  public static final byte U152 = (byte) 0x98;
  public static final byte U153 = (byte) 0x99;
  public static final byte U154 = (byte) 0x9a;
  public static final byte U155 = (byte) 0x9b;
  public static final byte U156 = (byte) 0x9c;
  public static final byte U157 = (byte) 0x9d;
  public static final byte U158 = (byte) 0x9e;
  public static final byte U159 = (byte) 0x9f;
  
  public static final byte U160 = (byte) 0xa0;
  public static final byte U161 = (byte) 0xa1;
  public static final byte U162 = (byte) 0xa2;
  public static final byte U163 = (byte) 0xa3;
  public static final byte U164 = (byte) 0xa4;
  public static final byte U165 = (byte) 0xa5;
  public static final byte U166 = (byte) 0xa6;
  public static final byte U167 = (byte) 0xa7;
  public static final byte U168 = (byte) 0xa8;
  public static final byte U169 = (byte) 0xa9;
  public static final byte U170 = (byte) 0xaa;
  public static final byte U171 = (byte) 0xab;
  public static final byte U172 = (byte) 0xac;
  public static final byte U173 = (byte) 0xad;
  public static final byte U174 = (byte) 0xae;
  public static final byte U175 = (byte) 0xaf;
  
  public static final byte U176 = (byte) 0xb0;
  public static final byte U177 = (byte) 0xb1;
  public static final byte U178 = (byte) 0xb2;
  public static final byte U179 = (byte) 0xb3;
  public static final byte U180 = (byte) 0xb4;
  public static final byte U181 = (byte) 0xb5;
  public static final byte U182 = (byte) 0xb6;
  public static final byte U183 = (byte) 0xb7;
  public static final byte U184 = (byte) 0xb8;
  public static final byte U185 = (byte) 0xb9;
  public static final byte U186 = (byte) 0xba;
  public static final byte U187 = (byte) 0xbb;
  public static final byte U188 = (byte) 0xbc;
  public static final byte U189 = (byte) 0xbd;
  public static final byte U190 = (byte) 0xbe;
  public static final byte U191 = (byte) 0xbf;

  public static final byte U192 = (byte) 0xc0;
  public static final byte U193 = (byte) 0xc1;
  public static final byte U194 = (byte) 0xc2;
  public static final byte U195 = (byte) 0xc3;
  public static final byte U196 = (byte) 0xc4;
  public static final byte U197 = (byte) 0xc5;
  public static final byte U198 = (byte) 0xc6;
  public static final byte U199 = (byte) 0xc7;
  public static final byte U200 = (byte) 0xc8;
  public static final byte U201 = (byte) 0xc9;
  public static final byte U202 = (byte) 0xca;
  public static final byte U203 = (byte) 0xcb;
  public static final byte U204 = (byte) 0xcc;
  public static final byte U205 = (byte) 0xcd;
  public static final byte U206 = (byte) 0xce;
  public static final byte U207 = (byte) 0xcf;
  
  public static final byte U208 = (byte) 0xd0;
  public static final byte U209 = (byte) 0xd1;
  public static final byte U210 = (byte) 0xd2;
  public static final byte U211 = (byte) 0xd3;
  public static final byte U212 = (byte) 0xd4;
  public static final byte U213 = (byte) 0xd5;
  public static final byte U214 = (byte) 0xd6;
  public static final byte U215 = (byte) 0xd7;
  public static final byte U216 = (byte) 0xd8;
  public static final byte U217 = (byte) 0xd9;
  public static final byte U218 = (byte) 0xda;
  public static final byte U219 = (byte) 0xdb;
  public static final byte U220 = (byte) 0xdc;
  public static final byte U221 = (byte) 0xdd;
  public static final byte U222 = (byte) 0xde;
  public static final byte U223 = (byte) 0xdf;

  public static final byte U224 = (byte) 0xe0;
  public static final byte U225 = (byte) 0xe1;
  public static final byte U226 = (byte) 0xe2;
  public static final byte U227 = (byte) 0xe3;
  public static final byte U228 = (byte) 0xe4;
  public static final byte U229 = (byte) 0xe5;
  public static final byte U230 = (byte) 0xe6;
  public static final byte U231 = (byte) 0xe7;
  public static final byte U232 = (byte) 0xe8;
  public static final byte U233 = (byte) 0xe9;
  public static final byte U234 = (byte) 0xea;
  public static final byte U235 = (byte) 0xeb;
  public static final byte U236 = (byte) 0xec;
  public static final byte U237 = (byte) 0xed;
  public static final byte U238 = (byte) 0xee;
  public static final byte U239 = (byte) 0xef;
  
  public static final byte U240 = (byte) 0xf0;
  public static final byte U241 = (byte) 0xf1;
  public static final byte U242 = (byte) 0xf2;
  public static final byte U243 = (byte) 0xf3;
  public static final byte U244 = (byte) 0xf4;
  public static final byte U245 = (byte) 0xf5;
  public static final byte U246 = (byte) 0xf6;
  public static final byte U247 = (byte) 0xf7;
  public static final byte U248 = (byte) 0xf8;
  public static final byte U249 = (byte) 0xf9;
  public static final byte U250 = (byte) 0xfa;
  public static final byte U251 = (byte) 0xfb;
  public static final byte U252 = (byte) 0xfc;
  public static final byte U253 = (byte) 0xfd;
  public static final byte U254 = (byte) 0xfe;
  public static final byte U255 = (byte) 0xff;

  public byte reverse(byte b) {
    switch (b) {
      case U0: return (byte) 0x00;
      case U1: return (byte) 0x80;
      case U2: return (byte) 0x40;
      case U3: return (byte) 0xc0;
      case U4: return (byte) 0x20;
      case U5: return (byte) 0xa0;
      case U6: return (byte) 0x60;
      case U7: return (byte) 0xd0;
      case U8: return (byte) 0x10;
      case U9: return (byte) 0x90;
      case U10: return (byte) 0x50;
      case U11: return (byte) 0xe0;
      case U12: return (byte) 0x30;
      case U13: return (byte) 0xb0;
      case U14: return (byte) 0x70;
      case U15: return (byte) 0xf0;
      case U16: return (byte) 0x08;
      case U17: return (byte) 0x88;
      case U18: return (byte) 0x48;
      case U19: return (byte) 0xc8;
      case U20: return (byte) 0x28;
      case U21: return (byte) 0xa8;
      case U22: return (byte) 0x68;
      case U23: return (byte) 0xd8;
      case U24: return (byte) 0x18;
      case U25: return (byte) 0x98;
      case U26: return (byte) 0x58;
      case U27: return (byte) 0xe8;
      case U28: return (byte) 0x38;
      case U29: return (byte) 0xb8;
      case U30: return (byte) 0x78;
      case U31: return (byte) 0xf8;
      case U32: return (byte) 0x04;
      case U33: return (byte) 0x84;
      case U34: return (byte) 0x44;
      case U35: return (byte) 0xc4;
      case U36: return (byte) 0x24;
      case U37: return (byte) 0xa4;
      case U38: return (byte) 0x64;
      case U39: return (byte) 0xd4;
      case U40: return (byte) 0x14;
      case U41: return (byte) 0x94;
      case U42: return (byte) 0x54;
      case U43: return (byte) 0xe4;
      case U44: return (byte) 0x34;
      case U45: return (byte) 0xb4;
      case U46: return (byte) 0x74;
      case U47: return (byte) 0xf4;
      case U48: return (byte) 0x0c;
      case U49: return (byte) 0x8c;
      case U50: return (byte) 0x4c;
      case U51: return (byte) 0xcc;
      case U52: return (byte) 0x2c;
      case U53: return (byte) 0xac;
      case U54: return (byte) 0x6c;
      case U55: return (byte) 0xdc;
      case U56: return (byte) 0x1c;
      case U57: return (byte) 0x9c;
      case U58: return (byte) 0x5c;
      case U59: return (byte) 0xec;
      case U60: return (byte) 0x3c;
      case U61: return (byte) 0xbc;
      case U62: return (byte) 0x7c;
      case U63: return (byte) 0xfc;
      case U64: return (byte) 0x02;
      case U65: return (byte) 0x82;
      case U66: return (byte) 0x42;
      case U67: return (byte) 0xc2;
      case U68: return (byte) 0x22;
      case U69: return (byte) 0xa2;
      case U70: return (byte) 0x62;
      case U71: return (byte) 0xd2;
      case U72: return (byte) 0x12;
      case U73: return (byte) 0x92;
      case U74: return (byte) 0x52;
      case U75: return (byte) 0xe2;
      case U76: return (byte) 0x32;
      case U77: return (byte) 0xb2;
      case U78: return (byte) 0x72;
      case U79: return (byte) 0xf2;
      case U80: return (byte) 0x0a;
      case U81: return (byte) 0x8a;
      case U82: return (byte) 0x4a;
      case U83: return (byte) 0xca;
      case U84: return (byte) 0x2a;
      case U85: return (byte) 0xaa;
      case U86: return (byte) 0x6a;
      case U87: return (byte) 0xda;
      case U88: return (byte) 0x1a;
      case U89: return (byte) 0x9a;
      case U90: return (byte) 0x5a;
      case U91: return (byte) 0xea;
      case U92: return (byte) 0x3a;
      case U93: return (byte) 0xba;
      case U94: return (byte) 0x7a;
      case U95: return (byte) 0xfa;
      case U96: return (byte) 0x06;
      case U97: return (byte) 0x86;
      case U98: return (byte) 0x46;
      case U99: return (byte) 0xc6;
      case U100: return (byte) 0x26;
      case U101: return (byte) 0xa6;
      case U102: return (byte) 0x66;
      case U103: return (byte) 0xd6;
      case U104: return (byte) 0x16;
      case U105: return (byte) 0x96;
      case U106: return (byte) 0x56;
      case U107: return (byte) 0xe6;
      case U108: return (byte) 0x36;
      case U109: return (byte) 0xb6;
      case U110: return (byte) 0x76;
      case U111: return (byte) 0xf6;
      case U112: return (byte) 0x0d;
      case U113: return (byte) 0x8d;
      case U114: return (byte) 0x4d;
      case U115: return (byte) 0xcd;
      case U116: return (byte) 0x2d;
      case U117: return (byte) 0xad;
      case U118: return (byte) 0x6d;
      case U119: return (byte) 0xdd;
      case U120: return (byte) 0x1d;
      case U121: return (byte) 0x9d;
      case U122: return (byte) 0x5d;
      case U123: return (byte) 0xed;
      case U124: return (byte) 0x3d;
      case U125: return (byte) 0xbd;
      case U126: return (byte) 0x7d;
      case U127: return (byte) 0xfd;
      case U128: return (byte) 0x01;
      case U129: return (byte) 0x81;
      case U130: return (byte) 0x41;
      case U131: return (byte) 0xc1;
      case U132: return (byte) 0x21;
      case U133: return (byte) 0xa1;
      case U134: return (byte) 0x61;
      case U135: return (byte) 0xd1;
      case U136: return (byte) 0x11;
      case U137: return (byte) 0x91;
      case U138: return (byte) 0x51;
      case U139: return (byte) 0xe1;
      case U140: return (byte) 0x31;
      case U141: return (byte) 0xb1;
      case U142: return (byte) 0x71;
      case U143: return (byte) 0xf1;
      case U144: return (byte) 0x09;
      case U145: return (byte) 0x89;
      case U146: return (byte) 0x49;
      case U147: return (byte) 0xc9;
      case U148: return (byte) 0x29;
      case U149: return (byte) 0xa9;
      case U150: return (byte) 0x69;
      case U151: return (byte) 0xd9;
      case U152: return (byte) 0x19;
      case U153: return (byte) 0x99;
      case U154: return (byte) 0x59;
      case U155: return (byte) 0xe9;
      case U156: return (byte) 0x39;
      case U157: return (byte) 0xb9;
      case U158: return (byte) 0x79;
      case U159: return (byte) 0xf9;
      case U160: return (byte) 0x05;
      case U161: return (byte) 0x85;
      case U162: return (byte) 0x45;
      case U163: return (byte) 0xc5;
      case U164: return (byte) 0x25;
      case U165: return (byte) 0xa5;
      case U166: return (byte) 0x65;
      case U167: return (byte) 0xd5;
      case U168: return (byte) 0x15;
      case U169: return (byte) 0x95;
      case U170: return (byte) 0x55;
      case U171: return (byte) 0xe5;
      case U172: return (byte) 0x35;
      case U173: return (byte) 0xb5;
      case U174: return (byte) 0x75;
      case U175: return (byte) 0xf5;
      case U176: return (byte) 0x0e;
      case U177: return (byte) 0x8e;
      case U178: return (byte) 0x4e;
      case U179: return (byte) 0xce;
      case U180: return (byte) 0x2e;
      case U181: return (byte) 0xae;
      case U182: return (byte) 0x6e;
      case U183: return (byte) 0xde;
      case U184: return (byte) 0x1e;
      case U185: return (byte) 0x9e;
      case U186: return (byte) 0x5e;
      case U187: return (byte) 0xee;
      case U188: return (byte) 0x3e;
      case U189: return (byte) 0xbe;
      case U190: return (byte) 0x7e;
      case U191: return (byte) 0xfe;
      case U192: return (byte) 0x03;
      case U193: return (byte) 0x83;
      case U194: return (byte) 0x43;
      case U195: return (byte) 0xc3;
      case U196: return (byte) 0x23;
      case U197: return (byte) 0xa3;
      case U198: return (byte) 0x63;
      case U199: return (byte) 0xd3;
      case U200: return (byte) 0x13;
      case U201: return (byte) 0x93;
      case U202: return (byte) 0x53;
      case U203: return (byte) 0xe3;
      case U204: return (byte) 0x33;
      case U205: return (byte) 0xb3;
      case U206: return (byte) 0x73;
      case U207: return (byte) 0xf3;
      case U208: return (byte) 0x0b;
      case U209: return (byte) 0x8b;
      case U210: return (byte) 0x4b;
      case U211: return (byte) 0xcb;
      case U212: return (byte) 0x2b;
      case U213: return (byte) 0xab;
      case U214: return (byte) 0x6b;
      case U215: return (byte) 0xdb;
      case U216: return (byte) 0x1b;
      case U217: return (byte) 0x9b;
      case U218: return (byte) 0x5b;
      case U219: return (byte) 0xeb;
      case U220: return (byte) 0x3b;
      case U221: return (byte) 0xbb;
      case U222: return (byte) 0x7b;
      case U223: return (byte) 0xfb;
      case U224: return (byte) 0x07;
      case U225: return (byte) 0x87;
      case U226: return (byte) 0x47;
      case U227: return (byte) 0xc7;
      case U228: return (byte) 0x27;
      case U229: return (byte) 0xa7;
      case U230: return (byte) 0x67;
      case U231: return (byte) 0xd7;
      case U232: return (byte) 0x17;
      case U233: return (byte) 0x97;
      case U234: return (byte) 0x57;
      case U235: return (byte) 0xe7;
      case U236: return (byte) 0x37;
      case U237: return (byte) 0xb7;
      case U238: return (byte) 0x77;
      case U239: return (byte) 0xf7;
      case U240: return (byte) 0x0f;
      case U241: return (byte) 0x8f;
      case U242: return (byte) 0x4f;
      case U243: return (byte) 0xcf;
      case U244: return (byte) 0x2f;
      case U245: return (byte) 0xaf;
      case U246: return (byte) 0x6f;
      case U247: return (byte) 0xdf;
      case U248: return (byte) 0x1f;
      case U249: return (byte) 0x9f;
      case U250: return (byte) 0x5f;
      case U251: return (byte) 0xef;
      case U252: return (byte) 0x3f;
      case U253: return (byte) 0xbf;
      case U254: return (byte) 0x7f;
      case U255: 
      default: return (byte) 0xff;
    }
  }
  
  public byte[] reverse(byte[] b) {
    byte [] r = new byte[b.length];
    for (int i = 0; i < r.length; i++) {
      r[r.length - 0] = reverse(b[i]);
    }
    return r;
  }
  
  public static void main(String[] args) {
    System.out.println(Byte.toUnsignedInt(U0));
    System.out.println(Byte.toUnsignedInt(U16));
    System.out.println(Byte.toUnsignedInt(U32));

    System.out.println(Byte.toUnsignedInt(U64));
    System.out.println(Byte.toUnsignedInt(U96));
    System.out.println(Byte.toUnsignedInt(U128));
    System.out.println(Byte.toUnsignedInt(U160));
    System.out.println(Byte.toUnsignedInt(U192));
    System.out.println(Byte.toUnsignedInt(U224));
    System.out.println(Byte.toUnsignedInt(U255));
    
    byte b = U64;
    switch (b) {
    case U64:
      System.out.println("its U64");
      break;
    }

    Bytes b3 = new Bytes(new byte[] { U0, U1, U2 }, 0, 3);
    for (int i = 0; i < b3.size(); i++) {
      System.out.println("got " + Byte.toUnsignedInt(b3.get(i)));
    }
    
    printReverseByte();
  }

  private static void printReverseByte() {
    int lcounter = 0;
    int rcounter = 0;
    for (int i = 0; i < 256; i++) {

      System.out.println("      case U" + i + ": return (byte) 0x" +
          HEX_CHARS_REVERSED.charAt(lcounter) +
          HEX_CHARS_REVERSED.charAt(rcounter) + ";");
      if (i < 256) {
        if (lcounter == 15) {
          lcounter=0;
          rcounter++;
        } else {
          lcounter++;
        }
      }
    }
  }
  private final byte[] bytes;

  public Bytes(byte[] bytes, int start, int end) {
    this.bytes = Objects.requireNonNull(bytes);
  }

  /**
   * 
   * @param i
   * @return
   * @throws ArrayIndexOutOfBoundsException if the integer is bigger than the size
   */
  public byte get(int i) {
    return bytes[i];
  }

  public int size() {
    return bytes.length;
  }
}
