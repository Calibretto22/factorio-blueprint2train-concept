package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;

class Main {
    
public static String decodeBPstringtoJSON(String fbpString) throws IOException {	//konvertiert den BPstring zu einem JSON-String
	fbpString.trim();//entfernt leerzeichen vom string, vorne und hinten 
//	if (fbpString.subSequence(0, 1) == "0") {//prüft ob erstes Zeichen 0 ist
	    fbpString = fbpString.substring(1);

	    Base64.Decoder decoderVar = Base64.getDecoder();	//ich mache ein objekt in der Form des Outputs der getDecoder-Methode.
	    byte[] bytearray_decoderVar = decoderVar.decode(fbpString.getBytes());//ich verwende eine methode des ausgangsobjektes und schütte den damit erzeugten input input in das objekt und verwende dazu eine methode  
	    ByteArrayInputStream bais = new ByteArrayInputStream(bytearray_decoderVar);
	    InflaterInputStream iis = new InflaterInputStream(bais);
	    
	    String uglyJSONreturn = "";//es muss erstmal ein leerer string erzeugt werden
	    byte[] buffer = new byte[5];//ein buffer für i dunno
	    int returnStringLength = -1;
	    while ((returnStringLength = iis.read(buffer)) != -1) {
		uglyJSONreturn += new String(Arrays.copyOf(buffer, returnStringLength));
	    	}
	    //System.out.println(uglyjsonreturn);
	    return uglyJSONreturn;
//	}//end leading 0-check
//	return "Error - this is no Factorio Bluprint: " + fbpString; 
	}

public static String encodeJSONtoBlueprintString (String jsonString) throws IOException {//hier fummel ich das JSON-Objekt wieder zu einem FBP zusammen (ZIP, BASE64, +0)
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
    
public static void main(String args[]) throws IOException{
    String microsample = "0eNpFzdEKQiEQBNB/mecNyuRG+ysRobAPgq6i3uhy8d+zCHoZGJjD7PBxlVKDdvAO0R56kAa+/cr20DV5qeATQV0SMFqOrh6KU4kglNymyfrxL/CRsM0c404IXdLc/y8I0fmpeC4JT6ntCxdrzXI9W3MxY7wBqAEwUQ==";

	System.out.println("all in one");
	System.out.println("Microsample inp: " + microsample);
	String uglyJSON = decodeBPstringtoJSON(microsample);
	System.out.println("Microsample JSON: " + uglyJSON);
	String returnBP = encodeJSONtoBlueprintString(uglyJSON);
	System.out.println("Microsample 2BP: " + returnBP); 

}
}
