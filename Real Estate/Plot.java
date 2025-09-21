package Real_Estate;
public class Plot extends Land{
	private boolean cornerPlot;
	
	public Plot(String id, double area, String address, double basePrice, String landUsed, boolean cornerPlot) {
		super(id, area, address, basePrice, landUsed);
		this.cornerPlot = cornerPlot;
	}
	
	public double computeBaseValue() {
		double v = super.computerBasePrice();
		if (cornerPlot) {
			v*= 1.05;
		}
		return v;
	}
	
	public String describe() {
		return "Plot (corner="+this.cornerPlot+"-->"+super.describe();
	}
}
