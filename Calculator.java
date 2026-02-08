public class Calculator{
    public static void main(String[] args){
        //Question 01
        System.out.println(square(add(multiply(3,4) , multiply(5,7))));

        //Question 02
        System.out.println(add(square(add(4,7)), square(add(8,3))));
    }

    //add method
    public static int add(int a , int b){
        return a+b;
    }

    //multiply method
    public static int multiply(int a , int b){
        return a*b;
    }

    //square method
    public static int square(int a ){
        return a*a;
    }

}
