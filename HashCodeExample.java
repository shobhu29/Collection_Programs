import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

	class SortDesign implements Comparator<SortDesign>{

		@Override
		public int compare(SortDesign o1, SortDesign o2) {

			return 0;
		}		
		
	}
	class Employee implements Comparable<Employee> {
		
		private String name;
		

		public Employee(String name) {
			super();
			this.name = name;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + name + "]";
		}


		@Override
		public int compareTo(Employee e) {
			return name.compareTo(e.getName());
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			System.out.println("Hash code : " + name.hashCode());
			return name.hashCode();
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
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
			Employee emp = (Employee)obj;
			if(name.equals(emp.getName()))
				return true;
			else
				return false;
		} */
		
}	
	public class HashCodeExample {

	public static void main(String[] args) {
	
		HashSet<Employee> hs = new HashSet<>();
		hs.add(new Employee("shobhit"));
		hs.add(new Employee("adi"));
	//	Collections.sort(hs);
		System.out.println(hs);
		
		
	//	System.out.println("ab".compareTo("BA"));
		
	}

}
