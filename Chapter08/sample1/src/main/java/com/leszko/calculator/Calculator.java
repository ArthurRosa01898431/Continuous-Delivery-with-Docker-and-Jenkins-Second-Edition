package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
/**
 * The {@code Calculator} class provides basic arithmetic operations.
 * This class includes a method for summing two integers and utilizes caching 
 * to improve performance.
 */
@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
	 /**
     * Computes the sum of two integers. This method is cached to enhance performance
     * when computing the same inputs multiple times.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of {@code a} and {@code b}
     */
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
