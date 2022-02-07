package org.adligo.bytes.shared;

import org.adligo.i_bytes.shared.I_BytesMutant;

/**
 * This class provides a mutable infinite sized bytes.O 
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
public class BigBytesMutant extends AbstractBigBytes {
  /**
   * Either this is a dimension of 1 in which case everything is
   * either empty in the tops array or is set to a I_Bytes.  If
   * the dimension is 2 or greater then this class recurses so that
   * the slots are either empty or AbstractBigBytes (which should have
   * a dimension of this dimension-1).
   */
  private Either<I_BytesMutant, AbstractBigBytes>[] tops;
}
