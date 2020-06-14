package Persons;

import java.util.Scanner;

public class Personalinformation {
	public int information_id;
	public String employer_name;
	public String occupation;
	public String employment_duration;
	public String gross_income;
	public String net_income;
	public String gross_monthly_expenses;
	public String compny_street_name;
	public String company_suburb;
	public String company_city;
	public int postal_code;
	public String bank_name;
	public String branch_name;
	public int branch_code;
	public String account_holder;
	public String account_type;
	public int account_no;
	public int debit_date;
	public int customer_id;
	public int address_id;
	public static String info;


	

	public int getInformation_id() {
		return information_id;
	}




	public void setInformation_id(int information_id) {
		this.information_id = information_id;
	}




	public String getEmployer_name() {
		return employer_name;
	}




	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}




	public String getOccupation() {
		return occupation;
	}




	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}




	public String getEmployment_duration() {
		return employment_duration;
	}




	public void setEmployment_duration(String employment_duration) {
		this.employment_duration = employment_duration;
	}




	public String getGross_income() {
		return gross_income;
	}




	public void setGross_income(String gross_income) {
		this.gross_income = gross_income;
	}




	public String getNet_income() {
		return net_income;
	}




	public void setNet_income(String net_income) {
		this.net_income = net_income;
	}




	public String getGross_monthly_expenses() {
		return gross_monthly_expenses;
	}




	public void setGross_monthly_expenses(String gross_monthly_expenses) {
		this.gross_monthly_expenses = gross_monthly_expenses;
	}




	public String getCompny_street_name() {
		return compny_street_name;
	}




	public void setCompny_street_name(String compny_street_name) {
		this.compny_street_name = compny_street_name;
	}




	public String getCompany_suburb() {
		return company_suburb;
	}




	public void setCompany_suburb(String company_suburb) {
		this.company_suburb = company_suburb;
	}




	public String getCompany_city() {
		return company_city;
	}




	public void setCompany_city(String company_city) {
		this.company_city = company_city;
	}




	public int getPostal_code() {
		return postal_code;
	}




	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}




	public String getBank_name() {
		return bank_name;
	}




	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}




	public String getBranch_name() {
		return branch_name;
	}




	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}




	public int getBranch_code() {
		return branch_code;
	}




	public void setBranch_code(int branch_code) {
		this.branch_code = branch_code;
	}




	public String getAccount_holder() {
		return account_holder;
	}




	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}




	public String getAccount_type() {
		return account_type;
	}




	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}




	public int getAccount_no() {
		return account_no;
	}




	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}




	public int getDebit_date() {
		return debit_date;
	}




	public void setDebit_date(int debit_date) {
		this.debit_date = debit_date;
	}




	public int getCustomer_id() {
		return customer_id;
	}




	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}




	public int getAddress_id() {
		return address_id;
	}




	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}




	@Override
	public String toString() {
		return "Personalinformation [information_id=" + information_id + ", employer_name=" + employer_name
				+ ", occupation=" + occupation + ", employment_duration=" + employment_duration + ", gross_income="
				+ gross_income + ", net_income=" + net_income + ", gross_monthly_expenses=" + gross_monthly_expenses
				+ ", compny_street_name=" + compny_street_name + ", company_suburb=" + company_suburb
				+ ", company_city=" + company_city + ", postal_code=" + postal_code + ", bank_name=" + bank_name
				+ ", branch_name=" + branch_name + ", branch_code=" + branch_code + ", account_holder=" + account_holder
				+ ", account_type=" + account_type + ", account_no=" + account_no + ", debit_date=" + debit_date
				+ ", customer_id=" + customer_id + ", address_id=" + address_id + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account_holder == null) ? 0 : account_holder.hashCode());
		result = prime * result + account_no;
		result = prime * result + ((account_type == null) ? 0 : account_type.hashCode());
		result = prime * result + address_id;
		result = prime * result + ((bank_name == null) ? 0 : bank_name.hashCode());
		result = prime * result + branch_code;
		result = prime * result + ((branch_name == null) ? 0 : branch_name.hashCode());
		result = prime * result + ((company_city == null) ? 0 : company_city.hashCode());
		result = prime * result + ((company_suburb == null) ? 0 : company_suburb.hashCode());
		result = prime * result + ((compny_street_name == null) ? 0 : compny_street_name.hashCode());
		result = prime * result + customer_id;
		result = prime * result + debit_date;
		result = prime * result + ((employer_name == null) ? 0 : employer_name.hashCode());
		result = prime * result + ((employment_duration == null) ? 0 : employment_duration.hashCode());
		result = prime * result + ((gross_income == null) ? 0 : gross_income.hashCode());
		result = prime * result + ((gross_monthly_expenses == null) ? 0 : gross_monthly_expenses.hashCode());
		result = prime * result + information_id;
		result = prime * result + ((net_income == null) ? 0 : net_income.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + postal_code;
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
		Personalinformation other = (Personalinformation) obj;
		if (account_holder == null) {
			if (other.account_holder != null)
				return false;
		} else if (!account_holder.equals(other.account_holder))
			return false;
		if (account_no != other.account_no)
			return false;
		if (account_type == null) {
			if (other.account_type != null)
				return false;
		} else if (!account_type.equals(other.account_type))
			return false;
		if (address_id != other.address_id)
			return false;
		if (bank_name == null) {
			if (other.bank_name != null)
				return false;
		} else if (!bank_name.equals(other.bank_name))
			return false;
		if (branch_code != other.branch_code)
			return false;
		if (branch_name == null) {
			if (other.branch_name != null)
				return false;
		} else if (!branch_name.equals(other.branch_name))
			return false;
		if (company_city == null) {
			if (other.company_city != null)
				return false;
		} else if (!company_city.equals(other.company_city))
			return false;
		if (company_suburb == null) {
			if (other.company_suburb != null)
				return false;
		} else if (!company_suburb.equals(other.company_suburb))
			return false;
		if (compny_street_name == null) {
			if (other.compny_street_name != null)
				return false;
		} else if (!compny_street_name.equals(other.compny_street_name))
			return false;
		if (customer_id != other.customer_id)
			return false;
		if (debit_date != other.debit_date)
			return false;
		if (employer_name == null) {
			if (other.employer_name != null)
				return false;
		} else if (!employer_name.equals(other.employer_name))
			return false;
		if (employment_duration == null) {
			if (other.employment_duration != null)
				return false;
		} else if (!employment_duration.equals(other.employment_duration))
			return false;
		if (gross_income == null) {
			if (other.gross_income != null)
				return false;
		} else if (!gross_income.equals(other.gross_income))
			return false;
		if (gross_monthly_expenses == null) {
			if (other.gross_monthly_expenses != null)
				return false;
		} else if (!gross_monthly_expenses.equals(other.gross_monthly_expenses))
			return false;
		if (information_id != other.information_id)
			return false;
		if (net_income == null) {
			if (other.net_income != null)
				return false;
		} else if (!net_income.equals(other.net_income))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (postal_code != other.postal_code)
			return false;
		return true;
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
