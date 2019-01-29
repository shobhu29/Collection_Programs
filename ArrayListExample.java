import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  ar= new ArrayList<>();

		ar.add(4);
		ar.add(1,5);
		ar.add(5);
		ar.add(8);
		ar.add(null);
			System.out.println(ar);
			
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(3);
		l.add(3);
		l.add(null);
		l.add(null);
		l.add(10);
		l.addFirst(8);
		l.addLast(9);
		l.addAll(3,ar);
		l.set(1,6);
		l.removeFirstOccurrence(null);
		
		System.out.println(l);
		
	}

}
