/**
 * 
 */
package reflection;

/**
 * @author Jason Forrisi 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete --Complete--
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Class<?>c = o.getClass();
		System.out.print("\nInheritance chain:\n");
		
		while(c.getSuperclass() != null) {
			System.out.print(c.getName() + " inherits from ");
			c = c.getSuperclass();
		}
		System.out.println(c.getName());
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete --Complete--
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\nMethods: ");
		for (int i = 0; i < m.length -1; i++) {
			System.out.print(m[i]);
			System.out.print("\n");
		}
		
		
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an object of type String
		// TODO To complete --Complete--
		String s = "This is a String";
		r.correspondingClass(s);
		r.inheritanceChain(s);
		r.listMethods(s);
		
		System.out.println("\n");
		// Demonstration of the methods on an object of type ColoredCircle
		// TODO To complete	--Complete--
		ColoredCircle circle = new ColoredCircle();
		r.correspondingClass(circle);
		r.inheritanceChain(circle);
		r.listMethods(circle);
	}

}
