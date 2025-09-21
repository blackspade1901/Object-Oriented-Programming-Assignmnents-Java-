package Real_Estate;
public class LuxuryResidency extends ResidentialProperty implements LuxuryAmenities{
	private boolean concierge;
	private boolean smarthome;

	public LuxuryResidency(String id, String address, double area, int bathrooms, int bedrooms, boolean concierge, boolean smarthome) {
		super(id, area, address, area, bathrooms, bedrooms);
		this.concierge = concierge;
		this.smarthome = smarthome;
	}

	@Override
	public String amenities() {
		return "Luxury Amenities --> concierge="+concierge+ ", smarthome="+smarthome;
	}
	
	public String describe() {
		return "Luxury Residency --> "+super.describe() + " , "+amenities(); 
	}

}
