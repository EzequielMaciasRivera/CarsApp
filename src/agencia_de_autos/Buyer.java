/**
 * 
 */
package agencia_de_autos;

import java.util.Scanner;

/**
 * @author ezmacias
 *
 */
public class Buyer extends User{

private String address;
private int phoneNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	
	public Buyer(int id, String name, String email,String address, int phoneNumber) {
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




}
