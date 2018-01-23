//class for the icons in a Blueprint
public class IconsInBP {
		GenericSignal[] itemToShow;
		
		IconsInBP (){
			for (int i=0; i<4; i++) {
				itemToShow[i] = new GenericSignal();
/*				.setName(itemname.valueOf(Tools.stringEingabe()));
				itemToShow[i].setType(type.valueOf(Tools.stringEingabe()));*/
			}
		}//end of manual input Constructor
		
	public void setItemToShow(GenericSignal itemToShow_, int iconIndex_) {
		itemToShow[iconIndex_] = itemToShow_;
	}

	public GenericSignal getItemToShow(int iconIndex_) {
		return itemToShow[iconIndex_];}
	
	public GenericSignal[] getIconsToShow() {
		return itemToShow;}	
}//end IconsInBP

