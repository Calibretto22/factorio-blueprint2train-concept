//package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.util.zip.Deflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;


class Main {
    public static void main(String args[]){
    String microsample = "0eNpFzdEKQiEQBNB/mecNyuRG+ysRobAPgq6i3uhy8d+zCHoZGJjD7PBxlVKDdvAO0R56kAa+/cr20DV5qeATQV0SMFqOrh6KU4kglNymyfrxL/CRsM0c404IXdLc/y8I0fmpeC4JT6ntCxdrzXI9W3MxY7wBqAEwUQ==";

      try{
  System.out.println("microsample-----: " + microsample);
  System.out.println("--------------------------------------");

        microsample = microsample.substring(1); //remove leading 0

        // Base64.Decoder decoderVar = Base64.getDecoder();	
  		  byte[] bytearray_decoderVar = Base64.getDecoder().decode(microsample.getBytes(StandardCharsets.UTF_8));  

        // ByteArrayInputStream bais = new ByteArrayInputStream(bytearray_decoderVar);
  	    InflaterInputStream iis = new InflaterInputStream(new ByteArrayInputStream(bytearray_decoderVar));
  
  	    String uglyJSONreturn = "";   //es muss erstmal ein leerer string erzeugt werden
  	    byte[] buffer = new byte[1];   //a buffer for i dunno
  	    int returnStringLength = -1;
  	    while ((returnStringLength = iis.read(buffer)) != -1) {
  	  	  uglyJSONreturn += new String(Arrays.copyOf(buffer, returnStringLength));
    	     	}

  System.out.println("uglyJSONreturn-----: " + uglyJSONreturn);
  System.out.println("--------------------------------------");

        //übergabe von deCode zu enCode --------------------------------------
        String json2ZIP = uglyJSONreturn; 
        //übergabe von deCode zu enCode --------------------------------------
      
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater(9)); 
            //(the Deflater sets compressionlevel)
        dos.write(json2ZIP.getBytes(StandardCharsets.UTF_8));   //getBytes() returns a bytearray
        dos.flush();
        dos.close();

  System.out.println("baos.toString()-----: " + baos.toString());    	
  System.out.println("--------------------------------------");

        byte[] charset = baos.toByteArray(); //baos is a outputStream, der zum byteArray werden muss
        String toBeReturnedString = Base64.getEncoder().encodeToString(charset);

        toBeReturnedString = "0" + toBeReturnedString;//make BluePrint String again

  System.out.println("toBeReturnedString-----: "+toBeReturnedString);          
  System.out.println("--------------------------------------");

          microsample = "0" + microsample; //add leading 0 for final comparision

  System.out.println("is input = output -----: " + (toBeReturnedString == microsample));          
  System.out.println("--------------------------------------");//this check fails don't know why

        }
	            catch(Exception e){
            System.out.println("Invalid String Exception");
        }
    }
}
