package Inheritance;

 // ......one class derived from anther class thats called inheritances..... ;

class one
{
	int  dis_one(int money) {
		System.out.println(" This is old propertice: from one class:) "+ money);
		return money;
	}
}


public class Single_Inherintance extends one  {
	
	void add() {
		System.out.println(" This is new  propertice: from 2nd class :) "+super.dis_one(50000));
		System.out.println(" This is new  propertice: from 2nd class");
		
	}

	public static void main(String[] args) {
		
		Single_Inherintance obj = new Single_Inherintance();
		obj.add();
		
	}

}
