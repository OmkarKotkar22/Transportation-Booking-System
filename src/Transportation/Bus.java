package Transportation;

public class Bus extends Transport {

	boolean AC;
	Bus(double distance, double baseFare, boolean AC)
	{
		super(distance, baseFare);
		this.AC = AC;
	}
	
	 double getFinalFare() 
	 {
		 double fare = baseFare + (distance * 5);
		 if(AC)
		 {
			 fare = fare + fare * 0.20;
		 }
		 return fare;
	 }
}
