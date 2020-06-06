package Persons;

import java.util.Scanner;

public class Personalinformation {
	public static int information_id;
	public static String employer_name;
	public static String occupation;
	public static String employment_duration;
	public static String gross_income;
	public static String net_income;
	public static String gross_monthly_expenses;
	public static String compny_street_name;
	public static String company_suburb;
	public static String company_city;
	public static int postal_code;
	public static String bank_name;
	public static String branch_name;
	public static int branch_code;
	public static String account_holder;
	public static String account_type;
	public static int account_no;
	public static int debit_date;
	public static int customer_id;
	public static int address_id;
	public static String info;

	public static int getInformation_id() {
		return information_id;
	}

	public static void setInformation_id(int information_id) {
		Personalinformation.information_id = information_id;
	}

	public static String getEmployer_name() {
		return employer_name;
	}

	public static void setEmployer_name(String employer_name) {
		Personalinformation.employer_name = employer_name;
	}

	public static String getOccupation() {
		return occupation;
	}

	public static void setOccupation(String occupation) {
		Personalinformation.occupation = occupation;
	}

	public static String getEmployment_duration() {
		return employment_duration;
	}

	public static void setEmployment_duration(String employment_duration) {
		Personalinformation.employment_duration = employment_duration;
	}

	public static String getGross_income() {
		return gross_income;
	}

	public static void setGross_income(String gross_income) {
		Personalinformation.gross_income = gross_income;
	}

	public static String getNet_income() {
		return net_income;
	}

	public static void setNet_income(String net_income) {
		Personalinformation.net_income = net_income;
	}

	public static String getGross_monthly_expenses() {
		return gross_monthly_expenses;
	}

	public static void setGross_monthly_expenses(String gross_monthly_expenses) {
		Personalinformation.gross_monthly_expenses = gross_monthly_expenses;
	}

	public static String getCompny_street_name() {
		return compny_street_name;
	}

	public static void setCompny_street_name(String compny_street_name) {
		Personalinformation.compny_street_name = compny_street_name;
	}

	public static String getCompany_suburb() {
		return company_suburb;
	}

	public static void setCompany_suburb(String company_suburb) {
		Personalinformation.company_suburb = company_suburb;
	}

	public static String getCompany_city() {
		return company_city;
	}

	public static void setCompany_city(String company_city) {
		Personalinformation.company_city = company_city;
	}

	public static int getPostal_code() {
		return postal_code;
	}

	public static void setPostal_code(int postal_code) {
		Personalinformation.postal_code = postal_code;
	}

	public static String getBank_name() {
		return bank_name;
	}

	public static void setBank_name(String bank_name) {
		Personalinformation.bank_name = bank_name;
	}

	public static String getBranch_name() {
		return branch_name;
	}

	public static void setBranch_name(String branch_name) {
		Personalinformation.branch_name = branch_name;
	}

	public static int getBranch_code() {
		return branch_code;
	}

	public static void setBranch_code(int branch_code) {
		Personalinformation.branch_code = branch_code;
	}

	public static String getAccount_holder() {
		return account_holder;
	}

	public static void setAccount_holder(String account_holder) {
		Personalinformation.account_holder = account_holder;
	}

	public static String getAccount_type() {
		return account_type;
	}

	public static void setAccount_type(String account_type) {
		Personalinformation.account_type = account_type;
	}

	public static int getAccount_no() {
		return account_no;
	}

	public static void setAccount_no(int account_no) {
		Personalinformation.account_no = account_no;
	}

	public static int getDebit_date() {
		return debit_date;
	}

	public static void setDebit_date(int debit_date) {
		Personalinformation.debit_date = debit_date;
	}

	public static int getCustomer_id() {
		return customer_id;
	}

	public static void setCustomer_id(int customer_id) {
		Personalinformation.customer_id = customer_id;
	}

	public static int getAddress_id() {
		return address_id;
	}

	public static void setAddress_id(int address_id) {
		Personalinformation.address_id = address_id;
	}
	

	public static void infoDetails(Scanner scan) {

		System.out.println("\t \tEMPLOYMENT DETAILS");
		scan.nextLine();
		System.out.println("ENTER EMPLOYER NAME");
		String employer_name = scan.nextLine();

		System.out.println("ENTER OCCUPATION");
		String occupation = scan.nextLine();

		System.out.println("ENTER EMPLOYMENT DURATION");
		String employment_duration = scan.nextLine();

		System.out.println("ENTER GROSS INCOME");
		String gross_income = scan.nextLine();

		System.out.println("ENTER NET INCOME");
		String net_income = scan.nextLine();

		System.out.println("ENTER GROSS MONTHLY EXPENSES");
		String gross_monthly_expenses = scan.nextLine();

		System.out.println("ENTER COMPANY STREET NAME");
		String company_street_name = scan.nextLine();

		System.out.println("ENTER COMPANY SUBURB");
		String company_suburb = scan.nextLine();

		System.out.println("ENTER COMPANY CITY");
		String company_city = scan.nextLine();

		System.out.println("ENTER POSTAL CODE");
		int postal_code = scan.nextInt();

		System.out.println("\t \tBANKING DETAILS");
		scan.nextLine();
		System.out.println("ENTER BANK NAME");
		String bank_name = scan.nextLine();

		System.out.println("ENTER BRANCH NAME");
		String branch_name = scan.nextLine();

		System.out.println("ENTER BRANCH CODE");
		int branch_code = scan.nextInt();
		scan.nextLine();
		System.out.println("ENTER ACCOUNT HOLDER");
		String account_holder = scan.nextLine();

		System.out.println("ENTER ACCOUNT TYPE");
		String account_type = scan.nextLine();

		System.out.println("ENTER ACCOUNT NUMBER");
		int account_no = scan.nextInt();

		System.out.println("ENTER DEBIT DATE");
		int debit_date = scan.nextInt();

		System.out.println("ENTER CUSTOMER ID");
		int customer_id = scan.nextInt();
		
		System.out.println("ENTER ADDRESS ID");
		int address_id = scan.nextInt();

		info = "INSERT INTO personalinformation(employer_name,occupation,employment_duration,gross_income,net_income,gross_monthly_expenses,company_street_name,company_suburb,company_city,postal_code,bank_name,branch_name,branch_code,account_holder,account_type,account_no,debit_date,customer_id,address_id) "
				+ "VALUES('" + employer_name + "','" + occupation + "','" + employment_duration + "','" + gross_income
				+ "','" + net_income + "','" + gross_monthly_expenses + "','" + company_street_name + "','"
				+ company_suburb + "','" + company_city + "'," + postal_code + "," + "'" + bank_name + "','"
				+ branch_name + "'," + branch_code + ",'" + account_holder + "','" + account_type + "'," + account_no
				+ "," + debit_date + "," + customer_id + ","+address_id+")";

	}
}
