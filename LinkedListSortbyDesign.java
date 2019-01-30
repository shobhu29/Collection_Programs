import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class SortDesign1 implements Comparator<SortDesign1>{

	@Override
	public int compare(SortDesign1 o1, SortDesign1 o2) {

		return 0;
	}			
}

class Employee1 implements Comparable<Employee1> {
	
	private String name;
	private String design;
	
	public Employee1(String name, String design) {
		super();
		this.name = name;
		this.design = design;
	}
	
	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", design=" + design + "]";
	}


	@Override
	public int compareTo(Employee1 e) {
		return name.compareTo(e.getName());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


/*	@Override
	public int hashCode() {
		System.out.println("Hash Code is " + name.hashCode());
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Has Equal");
		Employee1 emp = (Employee1)obj;
		if(name.equals(emp.getName()))
			return true;
		else
			return false;
	} */
	
}

public class LinkedListSortbyDesign {

	public static void main(String[] args) {
		
		LinkedList<Employee1> hs = new LinkedList<>();
		hs.add(new Employee1("shobhit","analyst"));
		hs.add(new Employee1("adi","cofounder"));
		Collections.sort(hs);
		System.out.println(hs);
	}

}
