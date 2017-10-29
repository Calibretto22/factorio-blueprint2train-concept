
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