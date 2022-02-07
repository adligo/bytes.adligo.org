package org.adligo.bytes.shared;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

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
public class Bytes {
  public static final String END_EXCEPTION_1 = "The End ";
  public static final String END_EXCEPTION_2 = " MUST be in the bytes bounds ";
  public static final String START_END_EXCEPTION_1 = "The Start ";
  public static final String START_END_EXCEPTION_2 = " MUST be after the End ";

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
    for (int i = 0; i < b3.size; i++) {
      System.out.println("got " + Byte.toUnsignedInt(b3.get(i)));
    }
  }

  private final byte[] bytes;
  private final int size;
  private final int start;

  public Bytes(byte[] bytes, int start, int end) {
    this.bytes = Objects.requireNonNull(bytes);
    if (start > end) {
      throw new IllegalArgumentException(START_END_EXCEPTION_1 + start + START_END_EXCEPTION_2 + end);
    }
    if (end > bytes.length) {
      throw new IllegalArgumentException(END_EXCEPTION_1 + end + END_EXCEPTION_1 + bytes.length);
    }
    this.size = end - start;
    this.start = start;

  }

  /**
   * 
   * @param i
   * @return
   * @throws ArrayIndexOutOfBoundsException if the integer is bigger than the size
   */
  public byte get(int i) {
    return bytes[start + i];
  }

  public int size() {
    return size;
  }
}
