package example;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args ) {
		
		
		Supplier<Date> sup1 = ()-> new Date();
		System.out.println(sup1.get());
		
		
		Supplier<String> otpgenerator =  ()-> {
			String s = "";
			for(int  i =0 ; i <=6 ; i++)
			{
				 s =s+(int)(Math.random()*10);
			}
			return s ;
		};
		
		System.out.println(otpgenerator.get());
		
	}
}
