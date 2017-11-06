//class for the icons in a Blueprint
public class IconsInBP {
		GenericSignal[] itemToShow = new GenericSignal[4];
		
		IconsInBP (){}//end empty contructor
		
	public void setItemToShow(GenericSignal itemToShow_, int iconIndex_) {
		itemToShow[iconIndex_] = itemToShow_;
	}

	public GenericSignal getItemToShow(int iconIndex_) {
		return itemToShow[iconIndex_];}
	
	public GenericSignal[] getIconsToShow() {
		return itemToShow;}	
}//end IconsInBP

