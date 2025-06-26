package Recursion;

public class test3 {
	
	void method(String n , int time ) {
		if(time<=0) {
			return ;
		}else {
			System.out.println(n);
			method(n,time-1);
		}
		
		
	}

	public static void main(String args []) {
		test3 obj = new test3();
		obj.method("welcome", 10);
		
		
	}
}
