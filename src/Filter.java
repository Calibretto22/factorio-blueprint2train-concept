public class Filter{
	int filterIndex;
	int filterCount;
    	String name;
	
Filter(String filterName_, int filterCount_, int filterIndex_){
    		filterCount = filterCount_;
        	name = filterName_;
        	filterIndex = filterIndex_;
	}

void inhaltAnzeigen (){
	System.out.println("Filtername: " + name + " (Filteranzahl: " + filterCount + ", Filterposition: " + filterIndex + ")");
	}//end updated anzeigen


}