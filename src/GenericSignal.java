
//class for all kinds of signals 

public class GenericSignal {
	private itemname name;//name of the item i.e. "signal-L", "logistic-chest-storage" 
	private type typeOfSignal;//type of signal i.e. "virtual", "item"
	//enum type: item, fluid,  recipe, virtual (enums sind listen von möglichen werten, die eine variable annehmen kann)
	
	GenericSignal (){
		name = itemname.valueOf(Tools.stringEingabe());
		typeOfSignal = type.valueOf(Tools.stringEingabe());
	};
	
	GenericSignal (itemname name_, type type_){ //constructor with enums
		name = name_;
		typeOfSignal = type_;
		}

	GenericSignal (String name_, String type_){ //constructor with string from json parser
		this.name = itemname.valueOf(name_);
		this.typeOfSignal = type.valueOf(type_);
		}
	
	public void setName(itemname name_) {//set name via enum
		this.name = name_;}
		
	public void setName(String name_) {//set name by string
		this.name = itemname.valueOf(name_);}
		
	public void setType(String type_) {//set type via enum
		this.typeOfSignal = type.valueOf(type_);}

	public void setType(type type_) {//set name by string
		this.typeOfSignal = type_;}

	public String getNameString() {
		return this.name.toString();}
		
	public String getTypeString() {
		return this.typeOfSignal.toString();}
}

//wird vielleicht noch extended, falls es speziellere signale gibt