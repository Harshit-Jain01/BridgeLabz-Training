package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestingStringUtils {

	@Test
	void testReverse() {
		assertEquals("cba", StringUtils.reverse("abc"));
		assertEquals("", StringUtils.reverse(""));
		assertNull(StringUtils.reverse(null));
	}

	@Test
	void testIsPalindrome() {
		assertTrue(StringUtils.isPalindrome("naman"));
		assertTrue(StringUtils.isPalindrome(""));
		assertFalse(StringUtils.isPalindrome("world"));
		assertFalse(StringUtils.isPalindrome(null));
	}

	@Test
	void testToUpperCase() {
		assertEquals("HISTORY", StringUtils.toUpperCase("hisTory"));
		assertEquals("", StringUtils.toUpperCase(""));
		assertNull(StringUtils.toUpperCase(null));
	}
}