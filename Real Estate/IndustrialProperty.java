package Real_Estate;
public class IndustrialProperty extends Properties{
	
	private boolean hazardousAllowed;
	public IndustrialProperty(String id, double area,  String address, double baseprice, boolean hazardous) {
		super(id, area, address, baseprice);
		this.hazardousAllowed = hazardous;
	}
	
	public double computeBaseValue() {
		double v = super.computerBasePrice();
		if(hazardousAllowed) {
			v*=1.08;
		}
		else {
			v*=0.90;
		}
		return v;
	}
	
	public String describe() {
		return "Industrial property (hazardous activities = "+this.hazardousAllowed+ ") "+super.describe();
	}

}
