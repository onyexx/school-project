package Persons;

public class Customer_package {
	public int package_id;
	public String package_name;
	public String amount;
	public int customer_id;

	public int getPackage_id() {
		return package_id;
	}

	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + customer_id;
		result = prime * result + package_id;
		result = prime * result + ((package_name == null) ? 0 : package_name.hashCode());
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
		Customer_package other = (Customer_package) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (customer_id != other.customer_id)
			return false;
		if (package_id != other.package_id)
			return false;
		if (package_name == null) {
			if (other.package_name != null)
				return false;
		} else if (!package_name.equals(other.package_name))
			return false;
		return true;
	}

}
