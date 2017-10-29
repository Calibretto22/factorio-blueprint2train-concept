//class for the icons in a Blueprint
public class IconsInBP {
		int iconIndex;
		GenericSignal itemToShow[];
		
		IconsInBP (){
			for (int i = 0; i<=3;i++) {itemToShow[i] = new GenericSignal();}
		}//end empty contructor
		
	public void setIconIndex(int iconIndex_) {
			this.iconIndex = iconIndex_;}

	
	//blargh das ist unsinn
	public void setItemToShow(GenericSignal itemToShow_) {
			//String n1, type t1, String n2, type t2, String n3, type t3, String n4, type t4) {
		for (int i = 0; i<=3;i++) {itemToShow[i] = new GenericSignal();};}
	//der unsinn hört hier auf
	
	public int getIconIndex() {
		return iconIndex;}
	
	public GenericSignal[] getItemToShow() {
		return itemToShow;}
	
	
}//end IconsInBP

