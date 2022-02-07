package org.adligo.bytes.shared;

import org.adligo.i_bytes.shared.I_Bytes;

/**
 * This class will provide a base for a infinitely large collection of bytes,
 * which of course is dangerous, in that it could run your JVM or actual computer
 * out of memory!  Care MUST be taken to wrap this with appropriate buffering limiters
 * in order to stay safe.<br/>
 *   The basic structure is a Either&lt;BytesMutant, AbstractBigBytes&gt;[] 
 * which is recursive, so that when more  elements are needed the number of 
 * dimensions is increased and the pointers in the array are assigned to a 
 * new AbstractBigBytes which is assigned to slot 0 of the tops 
 * Either&lt;BytesMutant, AbstractBigBytes&gt;[].  
 * This is MUCH faster insert time O(1) than 
 * Java's Array List which is actually exponential (size x 2 and Array.copy).  
 * However random access time and other retrieval times are reduced to roughly 
 * O(logN).  Finally there is a stream api which can provide O(1) access for 
 * each of N (where chunks C (i.e. I_Bytes)) are streamed through the 
 * streams pipe and the access of each of  N should have roughly O(1) 
 * access time in the chunks (i.e. the same as array integer access). <br/>
 * 
 * TODO can this be pulled out into a collection with generics where
 * I_Bytes is the array element?  Or is it to coupled with bytes? <br/>
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
public class AbstractBigBytes {
  /**
   * The number of dimension objects in the tops sub classes
   */
  private int dimensions = 1;

}
