package org.adligo.bytes.shared;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * This class provides a mutable counterpart to the Bytes class in this 
 * package.  This class is NOT threadsafe.  
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
public class BytesMutant {
  public static final int DEFAULT_SIZE = 64;
  /**
   * The initial number of byte arrays, and the number of additional 
   * arraySlots that will be added if the byte arrays are needs to grow.
   */
  private int arraysSize;
  private int chunkSize;
  private Object[] byteArrays;
  
  public BytesMutant() {
    this(DEFAULT_SIZE, DEFAULT_SIZE);
  }
  
  public BytesMutant(int arraysSize, int chunkSize) {
    byteArrays = new Object[arraysSize];
  }
}
