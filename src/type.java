//legt mögliche werte von GenericSignal fest 
//übergeben werden enums NICHT wie ein string: setType("item");
//sondern als objekt ihres jeweiligen types:   setType(type.item);

//kann ich eine ganze Enum-Klasse erzeugen, wo verschiedene enums drin sind? 

//zB auch die Anzahl der der möglichen Filter und signale für 

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