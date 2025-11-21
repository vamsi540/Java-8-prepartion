package immutableclassforastring;

public final class Bank {
	private final int rateOfInterest = 6;
	private final String name;
	private final Address address;

	public Bank(String name, Address addr) {
		super();
		this.name = name;
		Address addr1= new Address(addr.getState());
		this.address = addr1;
	}

	public int getRateOfInterest() {
		return rateOfInterest;
	}

	@Override
	public String toString() {
		return "Bank [rateOfInterest=" + rateOfInterest + ", name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	};

}
