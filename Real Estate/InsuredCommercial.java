package Real_Estate;
public class InsuredCommercial extends CommercialProperty implements Insurable, Taxable{
	private double insuredValue;
	private String cityType;
	
	public InsuredCommercial(String id, double area, String address, double basePrice, String type, double insuredvalue, String cityType) {
		super(id, area, address, basePrice, type);
		this.insuredValue = insuredvalue;
		this.cityType = cityType;
	}

	@Override
	public double calculateTax() {
		double unitRate;
        switch(cityType) {
            case "A":
                unitRate = 4.0;
                break;
            case "B":
                unitRate = 3.0;
                break;
            case "C":
                unitRate = 2.0;
                break;
            default:    
                unitRate = 1.5;
        }
		    return area*unitRate;
	    }

	@Override
	public String taxCategory() {
		return "Commercial -> "+cityType;
	}

	@Override
	public double premium() {
		double baseRate = 0.0025;
		double riskMultiplier = "retail".equalsIgnoreCase(cityType) ? 1.1 : 1.0;
		return insuredValue*baseRate*riskMultiplier;
	}

	@Override
	public String coverageInfo() {
		return "Covers all natural calamities cost and property disfunctions";
	}
	
	
}
