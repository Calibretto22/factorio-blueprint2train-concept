
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

public class Main {
    public static void main(String[] args) throws IOException {
	    //beispielblueprints
	String oneConstantCombinator = "0eNqNldFSgzAQRf8lzzDTAKWVVz/DcZwAa7tjSHAJHTsd/t0NVYhaNS8whOzJ3ctNuIhaj9ATGieqi8DGmkFUDxcx4MEo7cfcuQdRCXTQiUQY1fknP88p49LGdjUa5SyJKRFoWngTlZySG4QTkht5ZIFcZ6QyqMymx0SAcegQrkLmh/OTGbsaiNF/SkhEbweutcavy7xNIs585QVaJGiub4rEFzuy+qmGozohV/L0Z9QOKKp9srXtLTmvvLGjN0/m/7T/laAI3bEDh803Cz9w2yzw5H/cMNZsxtxeIGlB5BGIGg8paPaIWFNvNQSkvFhQRQSqhQZboF86KxfWNoKl7QGH2aYjDC4leB35DiExW60vI4gdtDh2v/aa3S20XQRtjiGNc7RSn4swFNvNwtrHsn7uqs/PuV9gdxGwZ8V2OVJm8ElNa9ChsmxVJjextJEL6EBMaL/zdmteZUz+WRiadHC2DyBrgzIq9J3SOtWqCxlZICSPbQzNAPQ1VGviZUzkSbWKbu49uY0qR51+zLn9kcpYSnOcnf3BCs6nmFxzEJuXW8YE+0Pup8fJn9hzaRX8SxKhFSeEx+T9vQ8zj5z4cJ3P37IosnKX78qymKZ3mXknzw==";
	String twoConstantCombinatorsOnOn = "0eNqtk8tuwjAQRf9l1o4EIQ1VtvxCdwghJ0xhJMeO7EnUCPnfOyYSDRX0pS7tzD2+PnLOUJseO0+WoToDNc4GqLZnCHS02qQ9HjuECoixBQVWt2mV5lhbzhrX1mQ1Ow9RAdkDvkG1jOoOYSDPvexcIdNEls+SedwpQMvEhFORy2Lc276t0Qv6ywoKOhck62w6V3iZzI9QLeSEA3lspk+FSmn2zuxrPOmBJCrzr2QY/YP7P2r/kto3rk8Cyz8aaEZtZ5jlB+Y57mJCfbKQ/87C4r8k3D6CwIhS/oSBZ+1X30i4ZRh3pMDUTJis0yHQgFnn3UAH9He5+Q+4XpOZK12sn675VZIq7+ySqGZ/gAKjaxQo5JtN8ik7g8i4+CqLIi/Xq3VZFjG+A7EZFFM=";
	String twoConstantCombinatorsOnOff = "0eNqtk9tqwzAMht9F1w7ktLbLc+xulOIkaitw7GArYaH43Wcn0KWj3Yld2tb/WfqwL1CrAXtLmqG6ADVGO6heL+DopKWKezz1CBUQYwcCtOziKtax1Jw0pqtJSzYWvADSLb5BlXlxhzCS5SHsXCFLRZKvkrnfC0DNxIRLI/NiOuihq9EG9JctCOiNC1mj472Bl4T6Cao03NCSxWY5KkVMszXqUONZjhSiof5IitE+mP9R9y+x+8YMUeDmjwaaSeoVJvvA7KIPcofY9VEqhz6CPznJf+ck/S8lt0/CMWIY5YyOV7MU3yi5ZShzIsfULJikl87RiElvzUgt2rvc/AdcK0mtBafbp2u+8Hs/W46JavUfBIxh9NnOZrfN0+K5zMvM+3eQ3RPK";	
	String countexapmple = "0eNqlVE2PmzAQ/S9zhookhJVQ20vV2956rFbIMUMyWn+wtok2ivjvHZNsyAfsYXsBBs88v3nz7CNsVIetIxOgPAJJazyUf4/gaWuEiv/CoUUogQJqSMAIHaMaJdXoUmn1howI1kGfAJka36Fc9C8JoAkUCE9oQ3CoTKc36DjhgqPslnwgmcod+pB6BhJb5H1a67ncmsiAIdNlAgcos75PHtCWFzQfhHxNG1KBqZHx6PhjFixdMGVuODirqg3uxJ64DU6R5GRHoeK1+lLXkPOhepBlTy50/GfkMGSkz3ACZ0pR2kUMdCvcIFUJP+LyR/O3G41F2V3R9wHzTE7bGivbVLZFXh9qz/0YlDH2EWwRHw7r6ykQR8UIFMNl/8LKwkm508g+ZnlpjJw1qXUInPs4hNXdEObVz0bxa3InrlDmE5j5nE0cvnX8nkfPGPycVE01NXblrHzFkDYdxhlK20XhV9lkj+tLlcaaOp2iYvqOabVWTZl2ceOzr85lgknx2UF84HGmkX1bzxj+DDL60H/B8bhHdwg7Mttb69+7+CdX2i603X9gt4dqGFXVOKsrMgwGZSOUx/5R6+WM1usrYUex+eoarrry6mbkoyo2bJAS/mih1O93oVuF+a/BLQkwOT+oXeT5snhaPRVF3vf/ABY+19w=";
	String microsample = "0eNpFzdEKQiEQBNB/mecNyuRG+ysRobAPgq6i3uhy8d+zCHoZGJjD7PBxlVKDdvAO0R56kAa+/cr20DV5qeATQV0SMFqOrh6KU4kglNymyfrxL/CRsM0c404IXdLc/y8I0fmpeC4JT6ntCxdrzXI9W3MxY7wBqAEwUQ==";
	
	System.out.println("distributed clusterF*ck");
	System.out.println("Microsample inp: " + twoConstantCombinatorsOnOff);
	String uglyJSON = CodeTools.decodeBPstringtoJSON(twoConstantCombinatorsOnOff);
	System.out.println("Microsample JSON: " + uglyJSON);
	String returnBP = CodeTools.encodeJSONtoBlueprintString(uglyJSON);
	System.out.println("Microsample 2BP: " + returnBP); 

	//create JsonParser object
	JsonParser jsonParser = new JsonFactory().createParser(uglyJSON);
	
	Signal testSignal = new Signal(itemname.production_science_pack, type.item);
	System.out.println("testSignal.getName: " + testSignal.getNameString());
	System.out.println("testSignal.getType: " + testSignal.getTypeString());
	
	IconsInBP testIcons = new IconsInBP();
	testIcons.setItemToShow(testSignal, 0);
	System.out.println("testIcons.getItemToShow(0).name: " + testIcons.getItemToShow(0).getNameString()); 
	System.out.println("testIcons.getItemToShow(0).type: " + testIcons.getItemToShow(0).getTypeString()); 
    
	}
}
    /* ToDoList
     * done: remove first char (it marks versionnumber ob BP)
     * done: decode BP zip 
     * done: decode BP base64
     *   note: you has json
     *   (store json in array of item-objects? (store all attributes))    
     * count item.name, store in blueprintItemAmmount-array
     * create Stacklibary
     * calculate Stacknumber per item store
     * count complete number of stacks
     * determine number of wagons
     * distribute to wagons
     * create CCombinators per wagon 
     * create multi CCombinators per wagon if needed
     * 
     * create JSON
     * read JSON
     * create zip
     * create base64
     * add preliminary 0
     *  
    */


/*
Objekthierarchieskizze: 
blueprint
	String bpname 
	Object IconsInBP icons 
		Object GenericSignal[] itemToShow
			enum name
			enum type
	String versionnumber
	Object entity
		int entity_number
		String name 
		int positionX
		int positionY
		boolean constOnOff
		Object Filter[] filtersignals
			String name
			int index
			int count
 */