package nestedinterface;

public class NestedInterfaceDemo {

	public static void main(String[] args) {

		OuterClass.NestedInterface obj = new InnerClass();
		obj.showMessage();
	}

}
