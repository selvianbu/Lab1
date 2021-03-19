package Lab1;

public class HumanWeight {
	
	//attributes declaration
		protected static double weightOnEarth;
		protected static double weightOnMars;

		//constructor of class
		public HumanWeight (double weightOnEarth) 
		{
			HumanWeight.weightOnEarth=weightOnEarth;
		}

		//setter and getter for weightOnEarth
		public void setWeightOnEarth (double weightOnEarth)
		{
			HumanWeight.weightOnEarth=weightOnEarth;
		}
		
		public static double getWeightOnEarth ()
		{
			return weightOnEarth;
		}
		
		//setter and getter for weightOnMars
		public void setWeightOnMars (double weightOnMars)
		{
			HumanWeight.weightOnMars=weightOnMars;
		}
		
		public static double getWeightOnMars ()
		{
			return weightOnMars;
		}

		//method to calculate weight on mars based on weight on earth
		public void calculateWeightOnMars()
		{
			weightOnMars = (getWeightOnEarth() * 9.81) / 3.711;
		}

		
	}