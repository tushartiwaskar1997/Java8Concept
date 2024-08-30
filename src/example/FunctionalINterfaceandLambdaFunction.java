package example;
@FunctionalInterface
interface  demo4{
    public void print();
    ///static and default method can be their 
}


class class_b implements  demo4{

    @Override
    public void print() {
        System.out.println("This is the lambda function  ");
    }
}

public class FunctionalINterfaceandLambdaFunction {
    public static void main(String[] args) {
        class_b   b=  new class_b();
        b.print();
        
        //if i implement this second type then their is not need of  class_b  which is help full 
        demo4   d = ()->System.out.println("tushar");
        d.print();
    }
}
