package com.example.demo

import com.fooBarQixKata.FooBarQix;
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class FooBarQixKataTests {
	
	val fooBarQix = FooBarQix();
	
	@Test
	fun number_not_divisble_by_3_5_7_and_doesnt_have_3_5_7_must_return_number_test() {
		val input: Int = 82
		val result: String = fooBarQix.generateFooBarQix(input)
		Assertions.assertEquals(input.toString(), result)
	}
	
	@Test
	fun number_divisble_by_3_and_doesnt_have_3_5_7_must_return_Foo_test() {
		val input = 18
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "Foo"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_contains_3_and_not_divisble_by_3_5_7_must_return_Foo_test() {
		val input = 31
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "Foo"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_divisble_by_5_and_doesnt_have_3_5_7_must_return_Bar_test() {
		val input = 80
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "Bar"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_contains_5_and_not_divisble_by_3_5_7_must_return_Bar_test() {
		val input = 52
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "Bar"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_divisble_by_7_and_doesnt_have_3_5_7_must_return_Qix_test() {
		val input = 14
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "Qix"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_contains_7_and_not_divisble_by_3_5_7_must_return_Qix_test() {
		val input = 17 
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "Qix"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_divisble_by_3_and_contains_5_must_return_FooBarBar_test() {
		val input = 15
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "FooBarBar"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_divisble_by_3_and_contains_3_must_return_FooFooFoo_test() {
		val input = 33
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "FooFooFoo"
		Assertions.assertEquals(expected, result)
	}
	
	@Test
	fun number_divisble_by_7_and_contains_7_must_return_QixQixQix_test() {
		val input = 77
		val result = fooBarQix.generateFooBarQix(input)
		val expected = "QixQixQix"
		Assertions.assertEquals(expected, result)
	}
	
}
