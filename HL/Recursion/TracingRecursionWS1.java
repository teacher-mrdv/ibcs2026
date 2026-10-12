/*
 * TracingRecursionWS1.java
 * 
 * Copyright 2026 OFS <ofsguest@OFS-MQW3G6FMP2.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class TracingRecursionWS1 {

	public static int f(int k, int n) {
		System.out.println( "k = " + k + "    n = " + n );
		if (n == k) {
			return k;
		} else {
			if (n > k) {
				return f(k, n - k);
			} else {
				return f(k - n, n);
			}
		}
	}

	public static void main (String[] args) {
			System.out.println( "f(6, 8): " + f(6, 8) );
		}
	}

