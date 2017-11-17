/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trellisldp.api;

/**
 * A generalized caching service for Trellis
 *
 * @author acoburn
 */
public interface CacheService<K, V> {

    /**
     * Get a value from the cache
     * @param key the key
     * @return a value for that key or null
     */
    V get(K key);

    /**
     * Put a new value into the cache
     * @param key the key
     * @param value the value
     */
    void put(K key, V value);
}