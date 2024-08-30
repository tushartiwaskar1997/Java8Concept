package example;
//Lambdafunction is function which is the 
// -- name  less
// -- without return type 
// -- without modifiers 

/*
 * consider the method  
 * 
 *  public void print(){
 *          sysout("tushar  is my name !!");
 * }
 * 
 * 
 * then hear 
 *  name        - print
 *  return type - void
 *  modifier    - public  
 * 
 * hence lambada function of this method will be  
 * 
 *  () -> {sysout("tushar  is my name !!");}
 * 
 *  scinedn method is only Single hence we can wirite it  as 
 *  
 *  () -> sysout("tushar  is my name !!");
 * 
 *  with parametes  
 *  (a,b) -> sysout("addition is "+(a+b));
 *  
 *  when we want to return 
 *   then we  use 
 * 
 *  (a,b) -> { return  a+b ;}
 * 
 *  *** Lambda Function and Functional interface are Dependent on each other  
 *  
 */

import java.util.function.Function;

public class lambdafunctionExample {
    
    public static void main(String[] args) {

        Function<Integer,Integer> a  = i->(i+1);
        Integer result =  a.apply(10);
        System.out.println(" the result  is "+ result);
        
        /*
         * Function<Integer, Integer> a = i -> i + 10; *  This lambda expression takes an integer i and returns i + 10.
         *  a.apply(5);  This line applies the function to the input 5, so it returns 15.
         * 
         *  the Function<Integer,Integer> is an interface  . which is functional interface 
         * and this is i->(i+1); lambda function   it should match with the signature of method written in functional interface 
         */
    }
}
