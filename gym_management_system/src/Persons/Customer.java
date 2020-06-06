package Persons;

import java.util.Scanner;

public class Customer {
	public static int cusomer_id;
	public static String firstname;
	public static String lastname;
	public static String email;
	public static String dateOfBirth;
	public static String id;
	public static int phone_no;
	public static String username;
	public static String password;
	public static int package_id;
	public static int address_id;
	public static String cus;
	
	
	public static int getCusomer_id() {
		return cusomer_id;
	}
	public static void setCusomer_id(int cusomer_id) {
		Customer.cusomer_id = cusomer_id;
	}
	public static String getFirstname() {
		return firstname;
	}
	public static void setFirstname(String firstname) {
		Customer.firstname = firstname;
	}
	public static String getLastname() {
		return lastname;
	}
	public static void setLastname(String lastname) {
		Customer.lastname = lastname;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Customer.email = email;
	}
	public static String getDateOfBirth() {
		return dateOfBirth;
	}
	public static void setDateOfBirth(String dateOfBirth) {
		Customer.dateOfBirth = dateOfBirth;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Customer.id = id;
	}
	public static int getPhone_no() {
		return phone_no;
	}
	public static void setPhone_no(int phone_no) {
		Customer.phone_no = phone_no;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		Customer.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Customer.password = password;
	}
	public static int getPackage_id() {
		return package_id;
	}
	public static void setPackage_id(int package_id) {
		Customer.package_id = package_id;
	}
	public static int getAddress_id() {
		return address_id;
	}
	public static void setAddress_id(int address_id) {
		Customer.address_id = address_id;
	}
	
	public static void cusRegistration(Scanner scan) {
		scan.nextLine();
		System.out.println("ENTER FIRSTNAME!");
		String firstname = scan.nextLine();
		
		System.out.println("ENTER LASTNAME!");
		String lastname = scan.nextLine();
		
		System.out.println("ENTER EMAIL!");
		String email = scan.nextLine();
		
		System.out.println("ENTER DATE OF BIRTH!");
		String dateOfBirth = scan.nextLine();
		
		System.out.println("ENTER ID NUMBER OR PASSPORT NUMBER!");
		String id = scan.nextLine();
		
		System.out.println("ENTER PHONE NUMBER!");
		int phone_no = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("ENTER USERNAME!");
		String username = scan.nextLine();
		
		System.out.println("ENTER PASSWORD!");
		String password = scan.nextLine();
		
		System.out.println("CHOOSE YOUR PACKAGE");
		System.out.println("VIP PACKAGE (R700),REGULAR (R500),OFF PAEK (R350)");
		int package_id = scan.nextInt();
		
		System.out.println("ENTER ADDRESS ID!");
		int address_id = scan.nextInt();
		
		cus = "INSERT INTO customer(firstname,lastname,email,dateOfBirth,id,phone_no,username,password,package_id,address_id)"
				+ " VALUES('"+firstname+"','"+lastname+"','"+email+"','"+dateOfBirth+"','"+id+"',"+phone_no+",'"+username+"','"+password+"',"+package_id+","+address_id+")";
		
	}

	public static void customerLogin(Scanner scan) {
		
	}
}
