package Persons;

import java.util.Scanner;

public class Employee {
	public static int employee_id;
	public static String firstname;
	public static String lastname;
	public static String email;
	public static int phone_no;
	public static String id;
	public static String dateOfBirth;
	public static String username;
	public static String password;
	public static int address_id;
	public static String em;
	
	
	public static int getEmployee_id() {
		return employee_id;
	}
	public static void setEmployee_id(int employee_id) {
		Employee.employee_id = employee_id;
	}
	public static String getFirstname() {
		return firstname;
	}
	public static void setFirstname(String firstname) {
		Employee.firstname = firstname;
	}
	public static String getLastname() {
		return lastname;
	}
	public static void setLastname(String lastname) {
		Employee.lastname = lastname;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Employee.email = email;
	}
	public static int getPhone_no() {
		return phone_no;
	}
	public static void setPhone_no(int phone_no) {
		Employee.phone_no = phone_no;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Employee.id = id;
	}
	public static String getDateOfBirth() {
		return dateOfBirth;
	}
	public static void setDateOfBirth(String dateOfBirth) {
		Employee.dateOfBirth = dateOfBirth;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		Employee.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Employee.password = password;
	}
	public static int getAddress_id() {
		return address_id;
	}
	public static void setAddress_id(int address_id) {
		Employee.address_id = address_id;
	}
	
	public static void empRegistration(Scanner scan) {
		scan.nextLine();
		
		System.out.println("ENTER FIRSTNAME!");
		String firstname = scan.nextLine();
		
		System.out.println("ENTER LASTNAME!");
		String lastname = scan.nextLine();
		
		System.out.println("ENTER EMAIL!");
		String email = scan.nextLine();
		
		System.out.println("ENTER PHONE NUMBER!");
		int phone_no = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("ENTER ID NUMBER OR PASSPORT NUMBER!");
		String id = scan.nextLine();
		
		System.out.println("ENTER DATE OF BIRTH!");
		String dateOfBirth = scan.nextLine();
		
		System.out.println("ENTER USERNAME!");
		String username = scan.nextLine();
		
		System.out.println("ENTER PASSWORD!");
		String password = scan.nextLine();
		
		System.out.println("ENTER ADDRESS ID!");
		int address_id = scan.nextInt();
		
		em = "INSERT INTO employee(firstname,lastname,email,phone_no,id,dateOfBirth,username,password,address_id)"
				+ " VALUES('"+firstname+"','"+lastname+"','"+email+"',"+phone_no+",'"+id+"'"
						+ ",'"+dateOfBirth+"','"+username+"','"+password+"',"+address_id+")";
		
		
	}
	public static void empLogin(Scanner scan) {
		
	}

}
