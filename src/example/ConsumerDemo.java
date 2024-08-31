package example;

import java.util.function.Consumer;

/*
 *
 * Consumer is also a functional Interface , which takes only one argument performs an action and do not return any thing .
 * it gust consume . 
 * It is having two methods in the interface
 *  
 * *** one abstract method accept  and one default thenafter  
 * 
 * 
 * 
 * 
 */

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
			Consumer<String> upercase   =  nam1 ->{System.out.println(nam1.toUpperCase());};
			upercase.accept("tusHar");
			//print the TUSHAR
			
			Consumer<String> lowercase =   nam2 -> System.out.println(nam2.toLowerCase());
			lowercase.accept("sHRUTika");
			//print  the shrutika
			
			Consumer<String> result =  upercase.andThen(lowercase);
			result.accept("AksHay");
			//print the AKSHAY first
			//print the akshay second 
			
			
			Consumer<ConsuExampole> con3 =  n -> System.out.println(n.getStudentname().toLowerCase());
			ConsuExampole exap =  new ConsuExampole("Lets Work Together!!!");
			con3.accept(exap);
			// print the ---lets work together!!! 
	}
	
}

class ConsuExampole{
	
	private String  studentname ;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public ConsuExampole(String studentname) {
		super();
		this.studentname = studentname;
	}
}

