package example;
/// fucntionla interface is a such kind of interface who just have only one method . 
/// if two methods found in the interface then  such interface is not functionla interface
/// one annotation is use to indicate and as well as prevent other developer to stop from adding the more method to the interface  
/// @FunctionalInterface over the interface is used to indicated the inteface is functional interface  . it will thow errro if more mthods are shown their 
/// this type of interface are usedd the lambda function  
@FunctionalInterface
interface demo2{
    public void  print();
    //public void shoe();
}

@FunctionalInterface   /// this type of implementation of functionla interface is also possible  
interface demo3 {
    public void  print();
    default public void show(){

    }
    public static void anymethod(){
        
    }
}

class  class_A  implements  demo3{

    @Override
    public void print() {
        System.out.println("This is the implementation of the method ");
    }
    
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        class_A a= new class_A();
        a.print();

        // we can also do  like this , it's also working   
        // for old legacy version it is used 

        demo3 d =  new class_A();
        d.print();
    }    
}
