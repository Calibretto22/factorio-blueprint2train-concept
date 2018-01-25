import java.util.ArrayList;
import java.util.List;

//class for the icons in a Blueprint
public class IconsInBP {
		List<Signal> itemToShow = new ArrayList<Signal>();
		
		IconsInBP (){}//icons are created by game, if empty
		
	public void setItemToShow(Signal itemToShow_, int iconIndex_) {
		itemToShow[iconIndex_] = itemToShow_;
	}

	public Signal getItemToShow(int iconIndex_) {
		return itemToShow[iconIndex_];}
	
	public Signal[] getIconsToShow() {
		return itemToShow;}	
}//end IconsInBP

