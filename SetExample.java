import java.util.HashSet;;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet  s = new HashSet();                     // Heterogenous
		s.add(4);
		s.add(5);		
		s.add(4);
		s.add(8);
		s.add(2);
		s.add("shobhit");
			System.out.println(s);
			System.out.println(s.size());
			System.out.println(s.contains(7));
		s.remove(8);
			System.out.println(s);
			System.out.println(s.remove(7));	
		s.clear();
			System.out.println(s);
			System.out.println(s.isEmpty());
	}

}
