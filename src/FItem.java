
public class FItem {//quantity of a item in a blueprint
    String name;
    int quantity;
    
    FItem (){}
    FItem (String name_, int quantity_){
	name = name_;
	quantity = quantity_;
    	}
    
    int numberofStacks (String name, int quantity) {
	int stack = 5;
	return stack;	
    	}
}
