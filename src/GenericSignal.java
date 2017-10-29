//class for all kinds of signals 
public class GenericSignal {
	String name;//name of the item i.e. "signal-L", "logistic-chest-storage" 
	String type;//type of signal i.e. "virtual", "item"
	
	GenericSignal (String name_, String type_){
		name = name_;
		type = type_;
		}
	
	public void setName(String name_) {
		this.name = name_;}
		
	public void setType(String type_) {
		this.type = type_;}
}

