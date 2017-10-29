import java.util.List;

public class Blueprint {
//alle dinge im BP sind JSON-Objekte 
	String labelofBP;
	String item; // im BP steht ein "item", reason unknown
	Entity[] stuffToBuild; //create class of Entitys
	/*List*/ IconsInBP[] icons; //array oder list - das ist hier die frage
	String versionNumber;
	
	Blueprint(){
		for (int i = 0; i<=3;i++) {icons = new IconsInBP[i];}
	}
	
	public void setLabelOfBP(String labelofBP_) {
		this.labelofBP = labelofBP_;}
	
	public void setItemOfBP(String setItemOfBP_) {
		this.item = setItemOfBP_;}
		
	public void setVersionOfBP(String versionNumber_) {
		this.versionNumber = versionNumber_;}
	
	public IconsInBP[] getIcons() {
		return icons;}

}

