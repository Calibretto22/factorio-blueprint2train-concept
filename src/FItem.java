
public class FItem {//quantity of a item in a blueprint
    String name;
    int quantity;
    
    FItem (){}
    FItem (String name_, int quantity_){
	name = name_;
	quantity = quantity_;
    	}
    
    int numberofStacks (String name, int quantity) {
	//wie groﬂ ist die stacksize des items? 
	//wie viele stacks davon sind im blueprint? 
	//die anzahl der stacks wird sp‰ter auf den trainwagon verteilt 
	int stack = 5;
	return stack;	
    	}
}
