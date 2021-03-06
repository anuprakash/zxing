/*
 * Copyright 2018 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.web;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests {@link LRUMap}.
 */
public final class LRUMapTestCase extends Assert {

  @Test
  public void testLRU() {
    LRUMap<String,String> map = new LRUMap<>(2);
    map.put("foo", "bar");
    map.put("bar", "baz");
    assertEquals("bar", map.get("foo"));
    assertEquals("baz", map.get("bar"));
    map.put("baz", "bing");
    assertEquals("bing", map.get("baz"));
    assertNull(map.get("foo"));
  }

}
