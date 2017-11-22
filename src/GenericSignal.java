
//class for all kinds of signals 

public class GenericSignal {
	private itemname name;//name of the item i.e. "signal-L", "logistic-chest-storage" 
	private type typeOfSigngal;//type of signal i.e. "virtual", "item"
	//enum type: item, fluid,  recipe, virtual (enums sind listen von möglichen werten, die eine variable annehmen kann)
	
	GenericSignal (){};
	GenericSignal (itemname name_, type type_){
		name = name_;
		typeOfSigngal = type_;
		}
	
	public void setName(itemname name_) {
		this.name = name_;}
		
	public void setType(type type_) {
		this.typeOfSigngal = type_;}

	public String getNameString() {
		return this.name.toString();}
		
	public String getTypeString() {
		return this.typeOfSigngal.toString();}
}

//wird vielleicht noch extended, falls es speziellere signale gibt