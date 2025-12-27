package Transportation;

public class Train extends Transport {

	boolean sleeper;
	Train(double distance, double baseFare, boolean sleeper)
	{
		super(distance, baseFare);
		this.sleeper = sleeper;
	}
	
	double getFinalFare()
	{
		double fare = baseFare + (distance * 4);
		if(sleeper)
		{
			fare = fare + fare * 0.15;
		}
		return fare;
	}
}
