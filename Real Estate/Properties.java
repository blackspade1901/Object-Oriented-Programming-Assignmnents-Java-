package Real_Estate;
public class Properties {
	public String id;
	public String address;
	public double area;
	public double basePrice;
	
	public Properties(String id, double area, String address, double price ) {
		this.id = id;
		this.address = address;
		this.area  =area;
		this.basePrice = price;
	}
	
	public double computerBasePrice() {
		return basePrice;
	}
	
	public String describe() {
		return "The Id is "+this.id+". it is located at "+this.address+" with base ammount "+this.basePrice;
	}
	
}
