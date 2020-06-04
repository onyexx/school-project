package Persons;

public class Customer_package {
	public static int package_id;
	public static String package_name;
	public static String amount;
	public static int customer_id;
	
	
	public static int getPackage_id() {
		return package_id;
	}
	public static void setPackage_id(int package_id) {
		Customer_package.package_id = package_id;
	}
	public static String getPackage_name() {
		return package_name;
	}
	public static void setPackage_name(String package_name) {
		Customer_package.package_name = package_name;
	}
	public static String getAmount() {
		return amount;
	}
	public static void setAmount(String amount) {
		Customer_package.amount = amount;
	}
	public static int getCustomer_id() {
		return customer_id;
	}
	public static void setCustomer_id(int customer_id) {
		Customer_package.customer_id = customer_id;
	}

}
