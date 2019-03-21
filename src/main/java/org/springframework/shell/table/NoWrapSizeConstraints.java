/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.shell.table;

/**
 * A sizing strategy that will impose the longest line width on cells.
 *
 * @author Eric Bottard
 */
public class NoWrapSizeConstraints implements SizeConstraints {

	@Override
	public Extent width(String[] raw, int tableWidth, int nbColumns) {
		int max = 0;
		for (String line : raw) {
			max = Math.max(max, line.length());
		}
		return new Extent(max, max);
	}
}
