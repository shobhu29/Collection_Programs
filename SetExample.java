import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;;

public class SetExample {

	public static void main(String[] args) {

		HashSet  s = new HashSet();          
		System.out.println("HashSet Example");			// UnOrdered but Sorted

		s.add(4);
		s.add(5);		
		s.add(4);										// No duplication
		s.add(8);
		s.add(2);
		s.add("Shobhit");								// Heterogeneous
			System.out.println(s);
			System.out.println(s.size());
			System.out.println(s.contains(7));
		s.remove(8);
			System.out.println(s);
			System.out.println(s.remove(7));	
		s.clear();
			System.out.println(s);
			System.out.println(s.isEmpty());
			
			
		TreeSet ts = new TreeSet();	
		
		System.out.println("TreeSet Example");			// Ordered by Sorting
		ts.add(7);
		ts.add(2);
		ts.add(9);
		ts.add(1);
	//	ts.add("Mishra");								// Homogeneous
		System.out.println(ts);
		
		Set ls = new LinkedHashSet();
		
		System.out.println("Linked HashSet Example");			// Ordered by Insertion

		ls.add(7);
		ls.add(2);
		ls.add(9);
		ls.add(1);
		ls.add("Mishra");								// Heterogeneous
		System.out.println(ls);
		
		

	}

}
