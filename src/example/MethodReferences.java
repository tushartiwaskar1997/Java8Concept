package example;

import java.util.function.Function;

public class MethodReferences {

	public static void test() {
		System.out.println("This is from test method !");
	}
	
	public static void main(String[] args) {
		System.out.println("tushar");
		MethodReferences.test();  ///  this is the one of the way to call  the method test as it is static  direct call
		
		Runnable runable = MethodReferences :: test;
		runable.run();    /// this is a Method refrence (::) it requires functional interface  
		
		Function<String, String>  fun = String :: toLowerCase ;
		System.out.println(fun.apply("TUSHAR"));
		
		Function<String , String >  fun2 = String :: toUpperCase;
		System.out.println(fun2.apply("tushar"));
		
		Function<String, String >  fun3 =name -> name.toLowerCase();
		System.out.println(fun3.apply("KARTIK"));  // this is the previous method using lambda function 
		
		Function<String, Integer >  fun4  =  numerinstring ->Integer.parseInt(numerinstring);
		System.out.println(fun4.apply("1234"));
		
		Function<String, Integer>  fun5  = Integer :: parseInt;
		System.out.println(fun5.apply("4567"));
		
	}
}
