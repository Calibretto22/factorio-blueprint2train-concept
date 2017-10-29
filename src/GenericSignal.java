//class for all kinds of signals 

public class GenericSignal {
	String name;//name of the item i.e. "signal-L", "logistic-chest-storage" 
	type typeOfSigngal;//type of signal i.e. "virtual", "item"
	//enum type: item, fluid,  recipe, virtual (enums sind listen von möglichen werten, die eine variable annehmen kann)
	
	GenericSignal (){};
	GenericSignal (String name_, type type_){
		name = name_;
		typeOfSigngal = type_;
		}
	
	public void setName(String name_) {
		this.name = name_;}
		
	public void setType(type type_) {
		this.typeOfSigngal = type_;}

	public String getName() {
		return this.name;}
		
	public type getType() {
		return this.typeOfSigngal;}
}

/*

public enum type {
	item, fluid, recipe, virtual;
	public String toString() {
		switch (this) {
		case item: return "item";
		case recipe: return "recipe";
		case virtual: return "virtual";
		case fluid: return "fluid";
		default: return "item";
		}}}

*/