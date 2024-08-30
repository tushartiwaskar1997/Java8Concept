package example;
 interface Demo1 {

    public void print();
    public void add();
    //now i have created the class and implements the un -implemented methos also
    // but if some one addes new function then in all the class the new function method need to be addeed
    // which is time comsuming  
    // In order to solve this we  usie the Default Method Implementation . But this method will  have the body also; 
    // you can addd any fucntion in inteface and need not need to all in all the class fource fully  
    default  public void show(){
        System.out.println("this is the from default method Show");
    }
    default  public void sub(){
        System.out.println("this is subtract method from the interface  ");
    }

}

class AA implements Demo1{

    @Override
    public void print() { 
        System.out.println("this is fom class A print");
    }

    @Override
    public void add() {
        System.out.println("this is fom class A add ");
    }
}

class BB implements Demo1{

    @Override
    public void print() {
        System.out.println("this is fom class A print");
    }

    @Override
    public void add() {
        System.out.println("this is fom class A print");
        Demo1.super.sub();
    }
    
}
class cc implements Demo1{
    @Override
    public void print() {
        System.out.println("this is fom class cc print");
    }

    @Override
    public void add() {
        System.out.println("this is fom class cc print");
        Demo1.super.show();  /// hear is the implementsion of default method
    }
}

public class DefaultinterfaceExample {
      public static void main(String[] args) {
        cc c =  new cc();
        c.print();
        c.add();

        BB b =  new BB();
        b.add();
        b.print();
    }
}
