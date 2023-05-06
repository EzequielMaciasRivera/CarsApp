package agencia_de_autos;

public class Seller extends User{
	private int edad;
	private double sueldo;
	private String address;
	private int phoneNumber;
	//private static int siguienteId=1;

	Buyer userBuyer =  new Buyer ( 1,"Kelly Fer","kelly678@gmail.com" ,"Las Palomas 89 Villa Sunción Ags",982222222);

Seller(int id, String name, int edad, double sueldo,String email,String address, int phoneNumber) {
		super();
		this.id = id;
		this.name= name;
		this.edad = edad;
		this.sueldo = sueldo;
		this.email=email;
		this.address=address;
		this.phoneNumber = phoneNumber;
	}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public int getEdad() {
	return edad;
}



public void setEdad(int edad) {
	this.edad = edad;
}



public double getSueldo() {
	return sueldo;
}



public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
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
