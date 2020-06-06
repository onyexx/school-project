package Persons;

import java.util.Scanner;

public class Address {
	public static int address_id;
	public static String building_name;
	public static String complex_name;
	public static int apartment_number;
	public static int street_number;
	public static String street_name;
	public static String city;
	public static String province;
	public static String country;
	public static int postal_code;
	public static int customer_id;
	public static int employee_id;
	public static int information_id;
	public static String ad;
	
	public static int getAddress_id() {
		return address_id;
	}
	public static void setAddress_id(int address_id) {
		Address.address_id = address_id;
	}
	public static String getBuilding_name() {
		return building_name;
	}
	public static void setBuilding_name(String building_name) {
		Address.building_name = building_name;
	}
	public static String getComplex_name() {
		return complex_name;
	}
	public static void setComplex_name(String complex_name) {
		Address.complex_name = complex_name;
	}
	public static int getApartment_number() {
		return apartment_number;
	}
	public static void setApartment_number(int apartment_number) {
		Address.apartment_number = apartment_number;
	}
	public static int getStreet_number() {
		return street_number;
	}
	public static void setStreet_number(int street_number) {
		Address.street_number = street_number;
	}
	public static String getStreet_name() {
		return street_name;
	}
	public static void setStreet_name(String street_name) {
		Address.street_name = street_name;
	}
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Address.city = city;
	}
	public static String getProvince() {
		return province;
	}
	public static void setProvince(String province) {
		Address.province = province;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Address.country = country;
	}
	public static int getPostal_code() {
		return postal_code;
	}
	public static void setPostal_code(int postal_code) {
		Address.postal_code = postal_code;
	}
	public static int getCustomer_id() {
		return customer_id;
	}
	public static void setCustomer_id(int customer_id) {
		Address.customer_id = customer_id;
	}
	public static int getEmployee_id() {
		return employee_id;
	}
	public static void setEmployee_id(int employee_id) {
		Address.employee_id = employee_id;
	}
	public static int getInformation_id() {
		return information_id;
	}
	public static void setInformation_id(int information_id) {
		Address.information_id = information_id;
	}
	
	public static void addDetails(Scanner scan) {
		scan.nextLine();
		
	System.out.println("ENTER BUILDING NAME");
	String building_name = scan.nextLine();
	
	System.out.println("ENTER COMPLEX NAME");
	String complex_name = scan.nextLine();
	
	System.out.println("ENTER APARTMENT NUMBER");
     int apartment_number = scan.nextInt();
     
     System.out.println("ENTER STREET NUMBER");
     int street_number = scan.nextInt();
     scan.nextLine();
     System.out.println("ENTER STREET NAME");
     String street_name = scan.nextLine();
     
     System.out.println("ENTER CITY");
     String city = scan.nextLine();
     
     System.out.println("ENTER PROVINCE");
     String province = scan.nextLine();
     
     System.out.println("ENTER COUNTRY");
     String country = scan.nextLine();
     
     System.out.println("ENTER POSTAL CODE");
     int postal_code = scan.nextInt();
     
     System.out.println("ENTER CUSTOMER ID");
     int customer_id = scan.nextInt();
     
     System.out.println("ENTER EMPLOYEE ID");
     int employee_id = scan.nextInt();
     
     System.out.println("ENTER INFORMATION ID");
     int information_id = scan.nextInt();
     
     ad = "INSERT INTO address(building_name,complex_name,apartment_number,street_number,street_name,city,province,country,postal_code,customer_id,employee_id,information_id) "
     		+ "VALUES('"+building_name+"','"+complex_name+"',"+apartment_number+","+street_number+",'"+street_name+"','"+city+"','"+province+"','"+country+"',"+postal_code+","+customer_id+","+employee_id+","+information_id+")";
	
	}
}
