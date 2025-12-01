package Chapter4;

import static java.lang.Math.*;


public class task9 {

    public static int multiply(int a, int b){

        
        return multiplyExact(a, b);


    }
    
     public static int div(int a, int b){

        return floorDiv(a, b);

     }
        
    

     public static int add(int a, int b){

        return addExact(a, b);


        
    }
     public static int sub(int a, int b){

        return subtractExact(a, b);



    }

    public static void main(String[] args) {  

        int m = multiply(10, 100);
        float d = div(100, 6);
        int a = add(10, 100);
        int s = sub(100, 10);
    
        System.out.println("Multiplication: "+ m);
        System.out.println("Division: "+ d);
        System.out.println("Addition: "+ a);
        System.out.println("Subtraction: "+ s);


        
        
    }
}
    

