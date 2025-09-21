package Real_Estate;
public class ResidentialProperty extends Properties{
	public int bedrooms;
	public int bathrooms;

	public ResidentialProperty(String id, double area, String address, double basePrice, int bedrooms, int bathrooms) {
		super(id, area, address, basePrice);
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
	}
	
	public String describe() {
		return super.describe()+" with "+this.bedrooms+" bedrooms and "+this.bathrooms+" bathrooms.";
	}
	
}
