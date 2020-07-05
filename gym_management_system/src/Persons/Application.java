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
				 Employee.empRegistration(scan);
				Address.addDetails(scan);
				break;
			case 2:
		        Customer.cusRegistration(scan);
				Address.addDetails(scan);
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
		
		}
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GymSystem_db", "root", "pvi@2020");

			Statement stmt = con.createStatement();
			

			stmt.executeUpdate(Employee.em);

			 stmt.executeUpdate(Customer.cus);

			 stmt.executeUpdate(Address.ad);

			 stmt.executeUpdate(Personalinformation.info);
			 

			ResultSet rs = stmt.executeQuery("SELECT * FROM  employee,address,customer,personalinformation");

			while (rs.next()) {
				Employee em = new Employee();

				em.setEmployee_id(rs.getInt("employee_id"));
				em.setFirstname(rs.getString("firstname"));
				em.setLastname(rs.getString("lastname"));
				em.setEmail(rs.getString("email"));
				em.setPhone_no(rs.getInt("phone_no"));
				em.setId(rs.getString("id"));
				em.setDateOfBirth(rs.getString("dateOfBirth"));
				em.setUsername(rs.getString("username"));
				em.setPassword(rs.getString("password"));
				em.setAddress_id(rs.getInt("address_id"));

				employee.add(em);
				System.out.println(em);

				Address add = new Address();

				add.setAddress_id(rs.getInt("address_id"));
				add.setBuilding_name(rs.getString("building_name"));
				add.setComplex_name(rs.getString("complex_name"));
				add.setApartment_number(rs.getInt("apartment_number"));
				add.setStreet_number(rs.getInt("street_number"));
				add.setStreet_name(rs.getString("street_name"));
				add.setCity(rs.getString("city"));
				add.setProvince(rs.getString("province"));
				add.setCountry(rs.getString("country"));
				add.setPostal_code(rs.getInt("postal_code"));
				add.setCustomer_id(rs.getInt("customer_id"));
				add.setEmployee_id(rs.getInt("employee_id"));
				add.setInformation_id(rs.getInt("information_id"));

				address.add(add);
				System.out.println(add);

				Customer cu = new Customer();

				cu.setCusomer_id(rs.getInt("customer_id"));
				cu.setFirstname(rs.getString("firstname"));
				cu.setLastname(rs.getString("lastname"));
				cu.setEmail(rs.getString("email"));
				cu.setDateOfBirth(rs.getString("dateOfBirth"));
				cu.setId(rs.getString("id"));
				cu.setPhone_no(rs.getInt("phone_no"));
				cu.setUsername(rs.getString("username"));
				cu.setPassword(rs.getString("password"));
				cu.setPackage_id(rs.getInt("package_id"));
				cu.setAddress_id(rs.getInt("address_id"));

				customer.add(cu);
				System.out.println(cu);

				Personalinformation per = new Personalinformation();

				per.setInformation_id(rs.getInt("information_id"));
				per.setEmployer_name(rs.getString("employer_name"));
				per.setOccupation(rs.getString("occupation"));
				per.setEmployment_duration(rs.getString("employment_duration"));
				per.setGross_income(rs.getString("gross_income"));
				per.setNet_income(rs.getString("net_income"));
				per.setGross_monthly_expenses(rs.getString("gross_monthly_expenses"));
				per.setCompny_street_name(rs.getString("company_street_name"));
				per.setCompany_suburb(rs.getString("company_suburb"));
				per.setCompany_city(rs.getString("company_city"));
				per.setPostal_code(rs.getInt("postal_code"));
				per.setBank_name(rs.getString("bank_name"));
				per.setBranch_name(rs.getString("branch_name"));
				per.setBranch_code(rs.getInt("branch_code"));
				per.setAccount_holder(rs.getString("account_holder"));
				per.setAccount_type(rs.getString("account_type"));
				per.setAccount_no(rs.getInt("account_no"));
				per.setDebit_date(rs.getInt("debit_date"));
				per.setCustomer_id(rs.getInt("customer_id"));

				personalinformation.add(per);
				System.out.println(per);

			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
