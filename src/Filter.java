public class Filter{
	int filterIndex;//on which position of the filtermatrix
	int filterCount;//how many (what about filter-inserters?)
    String name;//name of the item to filter
	
Filter(String filterName_, int filterCount_, int filterIndex_){
		name = filterName_;
		filterCount = filterCount_;
       	if (filterIndex_ <= 17 && filterIndex_>= 0) {filterIndex = filterIndex_;}//0-17
       	else {System.out.println("filterIndex must be between [0 and 17]");}
		}

void inhaltAnzeigen (){
	System.out.println("Filtername: " + name + " (Filteranzahl: " + filterCount + ", Filterposition: " + filterIndex + ")");
	}//end updated anzeigen


}