/**
 * Jonathan Brugh
 * CS-305 Software Security
 * Professor Morris
 * Project 2
 */

package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController{
	private static String bytesToHex(byte[] bytes) {
        StringBuilder out = new StringBuilder();
        for (byte b : bytes) {
            out.append(String.format("%02X", b));
        }
        return out.toString();
    }
	
	@RequestMapping("/hash")
    public String myHash() throws Exception{
    	// create message
    	String data = "Jonathan Brugh's Check Sum!";
    	
    	// create MessageDigest object
    	MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    	
    	// converting data to bytes
    	byte[] dataBytes = data.getBytes("UTF-8");
    	
    	// give message to MessageDigest object
    	messageDigest.update(dataBytes);
    	
    	// run hashing function
    	byte[] digest = messageDigest.digest();
    	
    	// convert byte array to hex string
    	String hexString = bytesToHex(digest);
    	
        return "<p>data: "+ data + "\nSHA-256: CheckSum Value: " + hexString;
    }
}

