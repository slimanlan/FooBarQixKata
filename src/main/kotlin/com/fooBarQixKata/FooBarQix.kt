package com.fooBarQixKata

class FooBarQix {

    private val words = mapOf(3 to "Foo", 5 to "Bar", 7 to "Qix")

    fun generateFooBarQix(number: Int): String {

       var result = words
               .map { if (number % it.key == 0) it.value else "" }
               .joinToString("")

        number.toString().forEach {
           result += words.getOrDefault( Character.getNumericValue(it), "")
        }

        return if(result.isEmpty()) number.toString() else result
    }
}