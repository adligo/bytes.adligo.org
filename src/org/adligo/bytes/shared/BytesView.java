package org.adligo.bytes.shared;

import java.util.ArrayList;
import java.util.List;
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
 * Unsigned bytes (i.e. {@link BytesView#U0} ).
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
public class BytesView implements I_Bytes {
  public static final String END_EXCEPTION_1 = "The End ";
  public static final String END_EXCEPTION_2 = " MUST be in the bytes bounds ";
  public static final String START_END_EXCEPTION_1 = "The Start ";
  public static final String START_END_EXCEPTION_2 = " MUST be after the End ";

  private final byte[] bytes;
  private final int size;
  private final int start;

  public BytesView(byte[] bytes, int start, int end) {
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
