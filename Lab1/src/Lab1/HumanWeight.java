package Lab1;

public class HumanWeight {
	
	//attributes declaration
		protected double weightOnEarth;
		protected double weightOnMars;

		//constructor of class
		public HumanWeight (double weightOnEarth) 
		{
			this.weightOnEarth=weightOnEarth;
		}

		//setter and getter for weightOnEarth
		public void setWeightOnEarth (double weightOnEarth)
		{
			this.weightOnEarth=weightOnEarth;
		}
		
		public double getWeightOnEarth ()
		{
			return weightOnEarth;
		}
		
		//setter and getter for weightOnMars
		public void setWeightOnMars (double weightOnMars)
		{
			this.weightOnMars=weightOnMars;
		}
		
		public double getWeightOnMars ()
		{
			return weightOnMars;
		}

		//method to calculate weight on mars based on weight on earth
		public void calculateWeightOnMars()
		{
			weightOnMars = (getWeightOnEarth() * 9.81) / 3.711;
		}

		
	}