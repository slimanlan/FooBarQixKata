package com.fooBarQixKata

class FooBarQix {
	
	val fooBarQixhashMap:HashMap<Int,String> = HashMap<Int,String>() 

	init {
		fooBarQixhashMap.put(3,"Foo")  
		fooBarQixhashMap.put(5,"Bar")  
		fooBarQixhashMap.put(7,"Qix")
	}
	
	fun generateFooBarQix(numberToFoobar:Int):String {
		
		  var result = ""
		  if (numberToFoobar % 3 == 0)
		  {
		    result += fooBarQixhashMap.get(3)
		  }
		  if (numberToFoobar % 5 == 0)
		  {
		    result += fooBarQixhashMap.get(5)
		  }
		  if (numberToFoobar % 7 == 0)
		  {
		    result += fooBarQixhashMap.get(7)
		  }
		
		  val toFooBar = (numberToFoobar).toString()
		
		  for (i in 0 until toFooBar.length)
		  {
		    val digit = toFooBar.get(i)
		    if (digit == '3')
		    result += fooBarQixhashMap.get(3)
		    if (digit == '5')
		    result += fooBarQixhashMap.get(5)
		    if (digit == '7')
		    result += fooBarQixhashMap.get(7)
		  }
		
		  return if (result.isEmpty()) toFooBar else result
	}
}