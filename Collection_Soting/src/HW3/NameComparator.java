package HW3;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSname().compareTo(o2.getSname());
	}

}
