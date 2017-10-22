//Toolklasse zum codieren und decodieren

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;


public class CodeTools {
    String microsample = "0eNptjsEKwjAQRP9lzhG0hor5FRFp66IL7bY0WzGE/LtJvHjwMjDD7JuN6MeNlpVF4SJ4mMXDXSI8P6QbS6ZhITiw0gQD6abivBKNu+FJXpEMWO70hjukqwGJsjJ9MdWEm2xTT2su/AUYLLPPN7OUvczZG4SsqeDqrvt50+BFq6/l1tqmPR9tc2pS+gCTTUNu";
//    String nameBP;
//    Entity[] stuffToBuild; //create class placeableObjects
//    iconsInBP[] icons = new iconsInBP[4]; //create Class iconsInBP  

    CodeTools(){} //leerer Konstruktor

    CodeTools(String input){ //überschreibt den microsample, falls ich doch mal was echtes übergeben sollte
	microsample = input;
    }
    String cutFirstZero (String input) {
	if (input.subSequence(0, 1) == "0") {//prüft ob erstes Zeichen 0 ist
	    return input.substring(1);
	}
	else {
	    return "Error - no Bluprint or not starting with Zero";
	}
    }

    byte[] decodeBPstring(String cuttedBPstring) {//konvertiert den BPstring zu einem Byte-Array zur weiteren Verarbeitung -> zip.deflate
	return cuttedBPstring.getBytes();
    }
    
    
    /*    String addFirstZero (String input) { //für später, wenn der BP-String wieder ausgegeben werden soll
	return "0"+input;
	}*/

    //decode BP to JSON String

    
    
   
    //encode JSON to BP String 
    
    
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

