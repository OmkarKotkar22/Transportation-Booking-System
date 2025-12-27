package Transportation;

public class Flight extends Transport {

	boolean businessClass;
	Flight(double distance, double baseFare, boolean businessClass)
	{
		super(distance, baseFare);
		this.businessClass = businessClass;
	}
	
	double getFinalFare()
	{
		double fare = baseFare + (distance * 10);
		fare = fare + 750;
		
		if(businessClass)
		{
			fare = fare + fare * 0.40;
		}
		return fare;
	}
}
