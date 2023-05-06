package agencia_de_autos;

class Cars {
	//private int id;
	
	private String brand;
	private String model;
	private String colour;
	private int year;
	private double price;
	private int max_speed;
	
	
	public Cars(String brand, String model,String colour,  int year, double price, int max_speed) {
		super();
		//this.id = id;
		
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.year = year;
		this.price = price;
		this.max_speed = max_speed;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getMax_speed() {
		return max_speed;
	}


	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}


	
	

}
