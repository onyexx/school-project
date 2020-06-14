package Persons;

import java.util.Scanner;

public class Address {
	public int address_id;
	public String building_name;
	public String complex_name;
	public int apartment_number;
	public int street_number;
	public String street_name;
	public String city;
	public String province;
	public String country;
	public int postal_code;
	public int customer_id;
	public int employee_id;
	public int information_id;
	public static String ad;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public String getComplex_name() {
		return complex_name;
	}

	public void setComplex_name(String complex_name) {
		this.complex_name = complex_name;
	}

	public int getApartment_number() {
		return apartment_number;
	}

	public void setApartment_number(int apartment_number) {
		this.apartment_number = apartment_number;
	}

	public int getStreet_number() {
		return street_number;
	}

	public void setStreet_number(int street_number) {
		this.street_number = street_number;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getInformation_id() {
		return information_id;
	}

	public void setInformation_id(int information_id) {
		this.information_id = information_id;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", building_name=" + building_name + ", complex_name="
				+ complex_name + ", apartment_number=" + apartment_number + ", street_number=" + street_number
				+ ", street_name=" + street_name + ", city=" + city + ", province=" + province + ", country=" + country
				+ ", postal_code=" + postal_code + ", customer_id=" + customer_id + ", employee_id=" + employee_id
				+ ", information_id=" + information_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + address_id;
		result = prime * result + apartment_number;
		result = prime * result + ((building_name == null) ? 0 : building_name.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((complex_name == null) ? 0 : complex_name.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + customer_id;
		result = prime * result + employee_id;
		result = prime * result + information_id;
		result = prime * result + postal_code;
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((street_name == null) ? 0 : street_name.hashCode());
		result = prime * result + street_number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address_id != other.address_id)
			return false;
		if (apartment_number != other.apartment_number)
			return false;
		if (building_name == null) {
			if (other.building_name != null)
				return false;
		} else if (!building_name.equals(other.building_name))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (complex_name == null) {
			if (other.complex_name != null)
				return false;
		} else if (!complex_name.equals(other.complex_name))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (customer_id != other.customer_id)
			return false;
		if (employee_id != other.employee_id)
			return false;
		if (information_id != other.information_id)
			return false;
		if (postal_code != other.postal_code)
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (street_name == null) {
			if (other.street_name != null)
				return false;
		} else if (!street_name.equals(other.street_name))
			return false;
		if (street_number != other.street_number)
			return false;
		return true;
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

		ad = "INSERT INTO address(building_name,complex_name,apartment_number,street_number,street_name,city,province,country,postal_code,"
				+ "customer_id,employee_id,information_id) " + "VALUES('" + building_name + "','" + complex_name + "',"
				+ apartment_number + "," + street_number + ",'" + street_name + "','" + city + "','" + province + "',"
				+ "'" + country + "'," + postal_code + "," + customer_id + "," + employee_id + "," + information_id
				+ ")";

	}
}
