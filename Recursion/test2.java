package Recursion;

public class test2 {
	
	public static void main(String args []) {
		test2 obj = new test2();
		obj.repeat(1);
		
	}
	
	void repeat(int count) {
	    if(count<=0)return ;
	    System.out.println("welcome");
	    repeat(count - 1);
	}
}


