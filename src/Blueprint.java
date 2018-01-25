import java.util.List;

public class Blueprint {
//alle dinge im BP sind JSON-Objekte 
	String labelofBP;
	String item; // im BP steht ein "item", reason unknown
	//error
	Entities stuffToBuild; //create class of Entitys
	//error end
	
	IconsInBP icons; //array oder list - das ist hier die frage
	String versionNumber; //könnte vllt. auch ein sehr sehr langer int werden. 
	
	Blueprint(){
	}
	
	public void setLabelOfBP(String labelofBP_) {
		this.labelofBP = labelofBP_;}
	
	public void setItemOfBP() {//im BP steht in der obersten ebene immer eine itembezeichnung drin
		this.item = "blueprint";}
		
	public void setVersionOfBP(String versionNumber_) {
		this.versionNumber = versionNumber_;}
	
	public IconsInBP getIcons() {
		return icons;}

}

