package API_GetReq;

import java.util.Scanner;

public class TestData {
	static Scanner s = new Scanner(System.in);
	static String fname;
	static String lname;
	static int empID;
	static String Dept;
	static String Addr;
	static String city;
	static String PostCode;
	static String Designation;
	static int Exp;
	static float sal;
	
	public void dec()
	{
		System.out.println("Enter the Designation for the employee");
		Designation = s.next();
		System.out.println("Enter the Experience in years for the employee");
		Exp = s.nextInt();
		System.out.println("Enter the Salary of the employee");
		sal = s.nextFloat();	
		System.out.println("Enter the Address of the employee");
		Addr = s.next();		
		 System.out.println("Enter the City of the employee"); 
		city = s.next();
		 System.out.println("Enter the Postal code of the employee");
		 PostCode =	 s.next();
		System.out.println("Enter the firstname of the employee");
		fname = s.next();
		System.out.println("Enter the lastname of the employee");
		lname = s.next();
		System.out.println("Enter the Employee ID of the employee");
		empID = s.nextInt();
		System.out.println("Enter the Dept of the employee");
		Dept = s.next();
	}
}
