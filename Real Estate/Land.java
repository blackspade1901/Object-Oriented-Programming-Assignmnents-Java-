package Real_Estate;
public class Land extends Properties{
	public String landUsed;
	public Land(String id, double area, String address, double basePrice, String landUse) {
		super(id, area, address, basePrice);
		this.landUsed = landUse;
	}
	
	public String describe() {
		return super.describe()+" . Land used for "+this.landUsed;
	}
}
