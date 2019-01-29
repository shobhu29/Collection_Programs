import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(5);
		l.add(5);
		l.add(null);
		l.add(null);
		l.add(10);
		l.addFirst(8);
		l.addLast(9);
		
		System.out.println(l);
		
		for(int i=0;i<l.size();i++)
			{
				System.out.println(l.get(i));
			}
	 		
		
		for(Integer i:l)
			{	
				System.out.println(i);
			}
			
		Iterator<Integer> it =l.iterator();
		
		while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		Iterator<Integer> listit=l.listIterator();
		
		while(listit.hasNext())
			{	
			System.out.println(listit.next());
			}
		
	}

}
