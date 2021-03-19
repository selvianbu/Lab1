package exercise8;

import java.util.ArrayList;
import Lab1.HumanWeight;

public class Exe8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set weight for person 1 and display the weight on earth and mars
		HumanWeight weight1 = new HumanWeight(60);
		weight1.calculateWeightOnMars();
		
		System.out.println("Weight on earth: " + HumanWeight.getWeightOnEarth());
		System.out.println("Weight on mars: " + HumanWeight.getWeightOnMars());
		
		System.out.print("\n\n");
		
		//set weight for person 2 and display the weight on earth and mars
		HumanWeight weight2 = new HumanWeight(70);
		weight2.calculateWeightOnMars();
		
		System.out.println("Weight on earth: " + HumanWeight.getWeightOnEarth());
		System.out.println("Weight on mars: " + HumanWeight.getWeightOnMars());
	}

}
