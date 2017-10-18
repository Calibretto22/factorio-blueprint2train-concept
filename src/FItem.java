
public class FItem {//quantity of a item in a blueprint
    String name;
    int quantity;
    
    FItem (){}
    FItem (String name_, int quantity_){
	name = name_;
	quantity = quantity_;
    	}
    
    int numberofStacks (String name, int quantity) {
	//wie groß ist die stacksize des items? 
	// https://www.reddit.com/r/factorio/comments/4huy05/where_are_item_stack_sizes_documented/	
	//wie viele stacks davon sind im blueprint? 
	//die anzahl der stacks wird später auf den trainwagon verteilt 

	int stack = 5;
	return stack;	
    	}
}
