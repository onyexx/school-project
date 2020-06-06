package Persons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();
		List<Customer> customer = new ArrayList<>();
		List<Address> address = new ArrayList<>();
		List<Personalinformation> personalinformation = new ArrayList<>();

		for (int o = 0; o <=3; o++) {

			System.out.println(
					"\t \tWELCOME TO ONYEXX GYM WHERE YOU GET FIT AND IMPROVE YOUR MUSCLE STRENGTH AND BOOST YOUR ENDURANCE");
           
				
			System.out.println(
					"\tPRESS 1 FOR EMPLOYEE REGISTRATION,2 FOR CUSTOMER REGISTRATION,3 FOR EMPLOYEE LOGIN,4 FOR CUSTOMER LOGIN");
			int input = scan.nextInt();
			
			switch (input) {

			case 1:
				// Employee.empRegistration(scan);
				Address.addDetails(scan);
				break;
			case 2:
		        //Customer.cusRegistration(scan);
				//Address.addDetails(scan);
				Personalinformation.infoDetails(scan);
				break;
			case 3:
				Employee.empLogin(scan);
				break;
			case 4:
				Customer.customerLogin(scan);
				break;

			}
			
			/*
			 * if (input == 1) { Employee.empRegistration(scan); Address.addDetails(scan); }
			 * else if (input == 2) { Customer.cusRegistration(scan);
			 * Address.addDetails(scan); Personalinformation.infoDetails(scan); } else if
			 * (input == 3) { Employee.empLogin(scan); } break;
			 */
			break;
		}
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GymSystem_db", "root", "pvi@2020");

			Statement stmt = con.createStatement();

			// stmt.executeUpdate(Employee.em);

			 //stmt.executeUpdate(Customer.cus);

			 //stmt.executeUpdate(Address.ad);

			 stmt.executeUpdate(Personalinformation.info);

			ResultSet rs = stmt.executeQuery("SELECT * FROM  employee");

			while (rs.next()) {
				Employee em = new Employee();

				Employee.setEmployee_id(rs.getInt("employee_id"));
				Employee.setFirstname(rs.getString("firstname"));
				Employee.setLastname(rs.getString("lastname"));
				Employee.setEmail(rs.getString("email"));
				Employee.setPhone_no(rs.getInt("phone_no"));
				Employee.setId(rs.getString("id"));
				Employee.setDateOfBirth(rs.getString("dateOfBirth"));
				Employee.setUsername(rs.getString("username"));
				Employee.setPassword(rs.getString("password"));
				Employee.setAddress_id(rs.getInt("address_id"));

				employee.add(em);
				System.out.println(em);

				Address add = new Address();

				Address.setAddress_id(rs.getInt("address_id"));
				Address.setBuilding_name(rs.getString("building_name"));
				Address.setComplex_name(rs.getString("complex_name"));
				Address.setApartment_number(rs.getInt("apartment_number"));
				Address.setStreet_number(rs.getInt("street_number"));
				Address.setStreet_name(rs.getString("street_name"));
				Address.setCity(rs.getString("city"));
				Address.setProvince(rs.getString("province"));
				Address.setCountry(rs.getString("country"));
				Address.setPostal_code(rs.getInt("postal_code"));
				Address.setCustomer_id(rs.getInt("customer_id"));
				Address.setEmployee_id(rs.getInt("employee_id"));
				Address.setInformation_id(rs.getInt("information_id"));

				address.add(add);
				System.out.println(add);

				Customer cu = new Customer();

				Customer.setCusomer_id(rs.getInt("customer_id"));
				Customer.setFirstname(rs.getString("firstname"));
				Customer.setLastname(rs.getString("lastname"));
				Customer.setEmail(rs.getString("email"));
				Customer.setDateOfBirth(rs.getString("dateOfBirth"));
				Customer.setId(rs.getString("id"));
				Customer.setPhone_no(rs.getInt("phone_no"));
				Customer.setUsername(rs.getString("username"));
				Customer.setPassword(rs.getString("password"));
				Customer.setPackage_id(rs.getInt("package_id"));
				Customer.setAddress_id(rs.getInt("address_id"));

				customer.add(cu);
				System.out.println(cu);

				Personalinformation per = new Personalinformation();

				Personalinformation.setInformation_id(rs.getInt("information_id"));
				Personalinformation.setEmployer_name(rs.getString("employer_name"));
				Personalinformation.setOccupation(rs.getString("occupation"));
				Personalinformation.setEmployment_duration(rs.getString("employment_duration"));
				Personalinformation.setGross_income(rs.getString("gross_income"));
				Personalinformation.setNet_income(rs.getString("net_income"));
				Personalinformation.setGross_monthly_expenses(rs.getString("gross_monthly_expenses"));
				Personalinformation.setCompny_street_name(rs.getString("company_street_name"));
				Personalinformation.setCompany_suburb(rs.getString("company_suburb"));
				Personalinformation.setCompany_city(rs.getString("company_city"));
				Personalinformation.setPostal_code(rs.getInt("postal_code"));
				Personalinformation.setBank_name(rs.getString("bank_name"));
				Personalinformation.setBranch_name(rs.getString("branch_name"));
				Personalinformation.setBranch_code(rs.getInt("branch_code"));
				Personalinformation.setAccount_holder(rs.getString("account_holder"));
				Personalinformation.setAccount_type(rs.getString("account_type"));
				Personalinformation.setAccount_no(rs.getInt("account_no"));
				Personalinformation.setDebit_date(rs.getInt("debit_date"));
				Personalinformation.setCustomer_id(rs.getInt("customer_id"));

				personalinformation.add(per);
				System.out.println(per);

			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
