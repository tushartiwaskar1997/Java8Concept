package example;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionClassExample {
 //premalu
	
	public static void main(String[] args) {
		
		Function<Integer, Integer>  function1 =num1 -> num1 /2 ;
		System.out.println("The value of function is -> "+function1.apply(10));
		Function<Integer,Integer>  multiply  = num1 -> num1 * 5 ;		
		Function<Integer,Integer>  addition  = num1 -> num1+3 ;		
		Function<Integer,Integer>  result =  addition.compose(multiply);		
		System.out.println( "This compose will perform  the firest multiply and then  addition :- "+result.apply(10));
		//50+3=53
				
		Function<Integer, Integer>  result2 =addition.andThen(multiply);
		System.out.println("this AndThen will first permform  the addion and  then  multiplication  "+result2.apply(10));
		//13*5=65
		
		Function<String	,String>  identiyOperation= Function.identity();
		System.out.println(identiyOperation.apply("tushar"));  //identity is a static function 
	}
	
	
}
