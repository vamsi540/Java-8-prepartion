package nestedinterface;

import nestedinterface.OuterClass.NestedInterface;

class InnerClass implements OuterClass.NestedInterface {
	public void showMessage() {
		System.out.println("Hello from the nested interface!");
	}
}
