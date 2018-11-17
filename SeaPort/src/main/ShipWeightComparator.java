package main;

import java.util.Comparator;

public class ShipWeightComparator implements Comparator<Ship> {

	@Override
	public int compare(Ship arg0, Ship arg1) {
		double dif = arg0.getWeight() - arg1.getWeight();
		
		if (dif > 0)
			return 1;
		else if (dif == 0) 
			return 0;
		else
			return -1;
	}
	
}
