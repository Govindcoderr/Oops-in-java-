package Recursion;

public class Test1 {
	
   
    static int facto(int n) {
        if (n == 0) {
           return 1 ;
        } else {
            return  n * facto(n - 1); 
        }
    }

    public static void main(String[] args) {
        
        System.out.println("this is facto "+ facto(5));
}
} 