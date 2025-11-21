package immutableclassforastring;

public class Address {
	private String state;

	public String getState() {
		return state;
	}

	public Address(String state) {
		super();
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + "]";
	}

	public void setState(String state) {
		this.state = state;
	}
	

}
