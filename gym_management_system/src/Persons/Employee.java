package Persons;

import java.util.Scanner;

public class Employee {
	public int employee_id;
	public String firstname;
	public String lastname;
	public String email;
	public int phone_no;
	public String id;
	public String dateOfBirth;
	public String username;
	public String password;
	public int address_id;
	public static String em;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", phone_no=" + phone_no + ", id=" + id + ", dateOfBirth=" + dateOfBirth
				+ ", username=" + username + ", password=" + password + ", address_id=" + address_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + address_id;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + employee_id;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + phone_no;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Employee other = (Employee) obj;
		if (address_id != other.address_id)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employee_id != other.employee_id)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone_no != other.phone_no)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
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
				+ " VALUES('" + firstname + "','" + lastname + "','" + email + "'," + phone_no + ",'" + id + "'" + ",'"
				+ dateOfBirth + "','" + username + "','" + password + "'," + address_id + ")";

	}

	public static void empLogin(Scanner scan) {

	}

}
