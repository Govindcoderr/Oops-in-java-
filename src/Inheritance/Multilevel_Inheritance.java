package Inheritance;

// Level 1
class Broker {
    int dis_one(int money) {
        System.out.println("This is old property: from Broker (GreatGrandFather) class :) " + money);
        return money;
    }
}

// Level 2
class Sonu extends Broker {
    int dis_two(int money) {
    	int total = super.dis_one(money)+ money;
        System.out.println("This is inherited property: from Sonu (GrandFather) class :) "+ total );
        return money;
    }
}

// Level 3
class Monu extends Sonu {
	
    int dis_three(int money) {
    	int total = super.dis_one(money)+ money;
        System.out.println("This is inherited property: from Monu (Father) class :) " + total);
        return money;
    }
}

// Level 4 
public class Multilevel_Inheritance extends Monu {

    public static void main(String[] args) {
        Multilevel_Inheritance obj = new Multilevel_Inheritance();

        obj.dis_three(3000); 
    }
}
