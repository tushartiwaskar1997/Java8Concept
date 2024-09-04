package example;

import java.util.Date;
import java.util.function.Supplier;


/*
 * Supplier is also a Functional interface  which consist of only one method 
 * only one abstract method get();
 * 
 * Supplier does not take any argument just only return the action result 
 * 
 * 
 */

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Date> sup1 = () -> new Date();
		System.out.println(sup1.get());

		Supplier<String> otpgenerator = () -> {
			String s = "";
			for (int i = 0; i <= 6; i++) {
				s = s + (int) (Math.random() * 10);
			}
			return s;
		};

		System.out.println(otpgenerator.get());

	}
}
