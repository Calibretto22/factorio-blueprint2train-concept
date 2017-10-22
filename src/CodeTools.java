//Toolklasse zum codieren und decodieren

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CodeTools {
    String microsample = "0eNpFzdEKQiEQBNB/mecNyuRG+ysRobAPgq6i3uhy8d+zCHoZGJjD7PBxlVKDdvAO0R56kAa+/cr20DV5qeATQV0SMFqOrh6KU4kglNymyfrxL/CRsM0c404IXdLc/y8I0fmpeC4JT6ntCxdrzXI9W3MxY7wBqAEwUQ==";

    String addFirstZero (String input) { //für später, wenn der BP-String wieder ausgegeben werden soll
	return "0"+input;
	}
    String decodeBPstringtoJSON(String fbpString) throws IOException {	//konvertiert den BPstring zu einem JSON-String
    	fbpString.trim();//entfernt leerzeichen vom string, vorne und hinten 
    	if (fbpString.subSequence(0, 1) == "0") {//prüft ob erstes Zeichen 0 ist
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
    	}//end leading 0-check
    	return "Error - no Factorio Bluprint / first Character of String is not zero"; 
    	}

    String encodeJSONtoBlueprintString (String jsonString) {//hier fummel ich das JSON-Objekt wieder zu einem FBP zusammen (ZIP, BASE64, +0)
	//möglicherweise übergebe ich keinen String sondern ein JSONobjekt - das wird sich mit der Zeit zeigen
	//ohne excapes: {"blueprint":{"entities":[{"entity_number":1,"name":"solar-panel","position":{"x":0,"y":0}}],"item":"blueprint","label":"x","version":64426934272}}
	if (jsonString == "") {jsonString="{\"blueprint\":{\"entities\":[{\"entity_number\":1,\"name\":\"solar-panel\",\"position\":{\"x\":0,\"y\":0}}],\"item\":\"blueprint\",\"label\":\"x\",\"version\":64426934272}}";}



	    return "FBPstring";
	}    
    
    

/*
package zlib.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;


public class Main {
    private final static String inputStr = "Hello World!";

    public static void main(String[] args) throws Exception {
        System.out.println("Will zlib compress following string: " + inputStr);

        // will compress "Hello World!"
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos);
        dos.write(inputStr.getBytes());
        dos.flush();
        dos.close();

        // at this moment baos.toByteArray() holds the compressed data of "Hello World!"
        System.out.println("Compressed result: " + baos);

        // will decompress compressed "Hello World!"
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        InflaterInputStream iis = new InflaterInputStream(bais);

        String result = "";
        byte[] buf = new byte[5];
        int rlen = -1;
        while ((rlen = iis.read(buf)) != -1) {
            result += new String(Arrays.copyOf(buf, rlen));
        }

        // now result will contain "Hello World!"

        System.out.println("Decompress result: " + result);
    }
}
*/
}

