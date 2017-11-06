//Toolklasse zum codieren und decodieren

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class CodeTools {

    static String decodeBPstringtoJSON(String fbpString) throws IOException {	//konvertiert den BPstring zu einem JSON-String
    	fbpString.trim();//entfernt leerzeichen vom string, vorne und hinten 
//    	if (fbpString.subSequence(0, 1) == "0") {//prüft ob erstes Zeichen 0 ist
    	    fbpString = fbpString.substring(1);

    	    Base64.Decoder decoderVar = Base64.getDecoder();	//ich mache ein objekt in der Form des Outputs der getDecoder-Methode.
    	    byte[] bytearray_decoderVar = decoderVar.decode(fbpString.getBytes());//ich verwende eine methode des ausgangsobjektes und schütte den damit erzeugten input input in das objekt und verwende dazu eine methode  
    	    ByteArrayInputStream bais = new ByteArrayInputStream(bytearray_decoderVar);
    	    InflaterInputStream iis = new InflaterInputStream(bais);
	    
    	    String uglyJSONreturn = "";//es muss erstmal ein leerer string erzeugt werden vx
	    byte[] buffer = new byte[5];//ein buffer für i dunno
	    int returnStringLength = -1;
	    while ((returnStringLength = iis.read(buffer)) != -1) {
		uglyJSONreturn += new String(Arrays.copyOf(buffer, returnStringLength));
	    	}
	    return uglyJSONreturn;
//    	}//end leading 0-check
//    	return "Error - this is no Factorio Bluprint: " + fbpString; 
    	}

    static String encodeJSONtoBlueprintString (String jsonString) throws IOException {//hier fummel ich das JSON-Objekt wieder zu einem FBP zusammen (ZIP, BASE64, +0)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater(9)); 
            //(the Deflater sets compressionlevel)
        dos.write(jsonString.getBytes(StandardCharsets.UTF_8));   //getBytes() returns a bytearray
        dos.flush();
        dos.close();
        byte[] charset = baos.toByteArray(); //baos is a outputStream, der zum byteArray werden muss
        String toBeReturnedString = Base64.getEncoder().encodeToString(charset);
        toBeReturnedString = "0" + toBeReturnedString;//make BluePrint String again
	return toBeReturnedString;
	}
    
	static void parseJSON(JsonParser jsonParser, Blueprint importBP, IconsInBP icons, GenericSignal signal, boolean insidePropertiesObj) throws JsonParseException, IOException {
		
		//loop through the JsonTokens
		while(jsonParser.nextToken() != JsonToken.END_OBJECT){
			String name = jsonParser.getCurrentName();
			if("label".equals(name)){
				jsonParser.nextToken();
				importBP.setLabelOfBP(jsonParser.getText());
			}else if("item".equals(name)){
				jsonParser.nextToken();
				importBP.setItemOfBP(jsonParser.getText());
			}else if("version".equals(name)){
				jsonParser.nextToken();
				importBP.setVersionOfBP(jsonParser.getText());
			}else if("icons".equals(name)){
				jsonParser.nextToken();
				//nested object, recursive call
				icons.add(jsonParser, importBP, icons, signal, insidePropertiesObj);
			}else if("index".equals(name)){
				jsonParser.nextToken();
				importBP.getIcons().setIconIndex(jsonParser.getIntValue());
			}else if("city".equals(name)){
				jsonParser.nextToken();
				importBP.getAddress().setCity(jsonParser.getText());
			}else if("zipcode".equals(name)){
				jsonParser.nextToken();
				importBP.getAddress().setZipcode(jsonParser.getIntValue());
			}else if("phoneNumbers".equals(name)){
				jsonParser.nextToken();
				while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
					phoneNums.add(jsonParser.getLongValue());
				}
			}else if("role".equals(name)){
				jsonParser.nextToken();
				importBP.setRole(jsonParser.getText());
			}else if("cities".equals(name)){
				jsonParser.nextToken();
				while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
					importBP.getCities().add(jsonParser.getText());
				}
			}else if("properties".equals(name)){
				jsonParser.nextToken();
				while(jsonParser.nextToken() != JsonToken.END_OBJECT){
					String key = jsonParser.getCurrentName();
					jsonParser.nextToken();
					String value = jsonParser.getText();
					importBP.getProperties().put(key, value);
				}
			}
		}
	}    
}
