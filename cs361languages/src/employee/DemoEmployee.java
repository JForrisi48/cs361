/**
 * 
 */
package employee;

/**
 * @author Jason Forrisi
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete -- Complete --
		// emp3.whoAmI() // prints "PART TIME EMPLOYEE" because Employee emp3 points to pEmp1 which is a Part time employee
		// emp3.getHourlyRate(); 
		// returns syntax error because emp3 is declared in the Employee class and there is no getHourlyRate method in employee class
								

		// TODO To complete -- Complete -- 
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		 if (emp3 instanceof PartTimeEmployee) {
		 System.out.println("emp3 instance of part time employee"); // printed
		 } else {
		System.out.println("emp3 not instance of part time employee");
		 }

		// Downcasting 1
		// TODO Uncomment and run the code -- Complete --
		// PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete --Complete--
		// This instruction compiles
		// This instruction returns a ClassCastException at run time
		/* because emp1 is an instance of the Employee class and since PartTimeEmployee is a child of the 
		 * Employee class, an instance of the employee class cannot be casted to PartTimeEmployee
		 */
		 

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below --Complete?--
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
