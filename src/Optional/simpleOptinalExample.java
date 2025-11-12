package Optional;

import java.util.Optional;

public class simpleOptinalExample {

	public static void main(String[] args) {
		Optional<String> opt = Optional.ofNullable("vamsi");
		System.out.println(opt.orElse("Default"));

	}

}
