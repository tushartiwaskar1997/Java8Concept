package example;
class threadclass implements Runnable{

    @Override
    public void run() {
        for(int i = 0;  i<5 ;i++){
            System.out.println(" comgin from  the  threadclass!!");
        }
        
    }
}

public class MultithreadingWithLambda {
    
    public static void main(String[] args) {
        for(int i = 0;  i<5 ;i++){
            System.out.println(" comgin from  the  main ******** ");
        }
        threadclass a =  new threadclass();
        Thread  t1 =  new Thread(a);
        t1.start(); 

        // in the above implementaion we have to build one class and then 
        // implements the runable interface and then  start the thread 
        // which is taking time  
        // we can solve this using the lambda function also  
        // as the Runnable interface is Functional interface we can directly implement the method run without creating  the class 

        Runnable  b = ()->System.out.println("This is from functional interface  &&&&&&&&&&&");
        Thread t2 = new Thread(b);
        t2.start();
        /// this method reduced the boilerplate code no  need to write the class threadclass 
        
        Runnable c = ()-> {
            for(int i = 0;  i<5 ;i++){
                System.out.println("Runnable loop !!!");
            }
        };
        Thread t3 =  new Thread(c);
        t3.start();
    }
}
