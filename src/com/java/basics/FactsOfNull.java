package com.java.basics;

public class FactsOfNull {

	private static Object obj;

	private static void staticMethod() {
		// Can be called by null reference
		System.out.println("static method, can be called by null reference");

	}

	private void nonStaticMethod() {
		// Can not be called by null reference
		System.out.print(" Non-static method- ");
		System.out.println("cannot be called by null reference");

	}

	public static void main(String[] args) {

		// 1. null is case sensitive
		// compile-time error : can't find symbol 'NULL'
		// Object obj = NULL;

		// runs successfully
		Object obj1 = null;

		// 2. Any reference variable in Java has default value null it will print null;
		System.out.println("Value of object obj is : " + obj);

		// 3. An integer can be null, so this is fine
		Integer i = null;

		// Unboxing null to integer throws NullpointerException
		//int a = i;

		// 4. instanceof operator
		Integer i1 = null;
		Integer j = 10;

		// prints false
		System.out.println(i1 instanceof Integer);

		// Compiles successfully
		System.out.println(j instanceof Integer);

		// 5. Static Not Static Method Call with null reference.
		FactsOfNull obj = null;
		obj.staticMethod();
		//obj.nonStaticMethod(); //Here it will give exception

		// 6. Comparison And Not Equal to Operator.

		// return true;
		System.out.println(null == null);

		// return false;
		System.out.println(null != null);

	}

}
