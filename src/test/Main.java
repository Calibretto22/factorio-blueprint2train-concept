package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
//import java.util.Base64.Encoder;
//import java.util.Base64.Decoder;
import java.util.zip.InflaterInputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.Arrays;


class Main {
    public static void main(String args[]){
    String microsample = "0eNpFzdEKQiEQBNB/mecNyuRG+ysRobAPgq6i3uhy8d+zCHoZGJjD7PBxlVKDdvAO0R56kAa+/cr20DV5qeATQV0SMFqOrh6KU4kglNymyfrxL/CRsM0c404IXdLc/y8I0fmpeC4JT6ntCxdrzXI9W3MxY7wBqAEwUQ==";
//    String jsonString="{\"blueprint\":{\"entities\":[{\"entity_number\":1,\"name\":\"solar-panel\",\"position\":{\"x\":0,\"y\":0}}],\"item\":\"blueprint\",\"label\":\"x\",\"version\":64426934272}}";

        try{
  System.out.println("microsample-----: "+microsample);
    System.out.println("--------------------------------------");
      microsample = microsample.substring(1); //remove leading 0
      Base64.Decoder decoderVar = Base64.getDecoder();	//ich mache ein objekt in der Form des Outputs der getDecoder-Methode. 
	
	    byte[] bytearray_decoderVar = decoderVar.decode(microsample.getBytes());//ich verwende eine methode des ausgangsobjektes und schütte den damit erzeugten input input in das objekt und verwende dazu eine methode  
	    ByteArrayInputStream bais = new ByteArrayInputStream(bytearray_decoderVar);
	    InflaterInputStream iis = new InflaterInputStream(bais);
	    String uglyjsonreturn = "";//es muss erstmal ein leerer string erzeugt werden
	    byte[] buffer = new byte[5];//ein buffer für i dunno
	    int returnStringLength = -1;
	    while ((returnStringLength = iis.read(buffer)) != -1) {
		uglyjsonreturn += new String(Arrays.copyOf(buffer, returnStringLength));
	    	}
  System.out.println("uglyjsonreturn-----: "+uglyjsonreturn);
    System.out.println("--------------------------------------");
        //--------------------------------------

      String jsonString = uglyjsonreturn;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos);
        dos.write(jsonString.getBytes());//getbytes returned ein bytearray
        dos.flush();
        dos.close();
  System.out.println("baos-----: "+baos);
    System.out.println("--------------------------------------");
    	String outputToSting = baos.toString();
  System.out.println("b64BA-----: "+outputToSting);    	
     System.out.println("--------------------------------------");
    	byte[] b64BA = outputToSting.getBytes();
//    	baos.toByteArray(b64BA);
        Base64.Encoder enc= Base64.getEncoder();
        String toBereturnedString = "0" + enc.encodeToString(b64BA);
  System.out.println("toBeReturnedString-----: "+toBereturnedString);          
    System.out.println("--------------------------------------");
          }
	            catch(Exception e){
            System.out.println("Invalid String Exception");
        }
    }
}

// wrong output replit: 0eO+/vUXvv73vv70KQiEQBO+/vX/vv73vv70N77+977+9Ru+/vSsR77+977+9D++/ve+/ve+/ve+/ve+/vXLvv73fswh6GRjvv73vv73vv73vv71x77+9Uu+/vXbvv70O77+9Hnrvv70G77+977+977+977+977+9NXnvv73vv70TQV0SMFrvv73vv70e77+9U++/vSDvv73cpu+/ve+/ve+/vS/vv73vv70c77+9Tghd77+977+977+9Lwjvv73vv73vv714LglP77+977+9Cxdr77+9cj1bczFj77+9Ae+/vQEwUQ==
// wrong output eclpis: 0eJxFzdEKQiEQBNB/mecNyuRG+ysRobAPgq6i3uhy8d+zCHoZGJjD7PBxlVKDdvAO0R56Pwa+/cr20DV5qeATQV0SMFqOrh6KU4kglNymyfrxL/CRsM0c404IXdLc/y8I0fmpeC4JT6ntCxdrzXI9W3MxY7wBqAEwUQ== 