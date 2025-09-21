package Real_Estate;
public class CommercialProperty extends Properties{
	protected String type;
	public CommercialProperty(String id, double area, String address, double baseprice, String type) {
		super(id, area,  address, baseprice);
		this.type = type;
	}
	
	public double computeBaseValue() {
		return super.computerBasePrice()*1.10;
	}
	
	public String describe() {
		return super.describe()+" type is "+this.type;
	}
}
