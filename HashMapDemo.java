
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

	HashMap<Integer,String> hm = new HashMap<>();
	
	hm.put(5,"alok");
	hm.put(1,"shobhit");
	hm.put(2,"adi");
	hm.put(3,"akarsh");
		
	System.out.println("Printing HashMap using object \n");	
	System.out.println(hm);	
	
	
	System.out.println("Printing HashMap using KeySet - Only Keys will be printed \n");	

	Set<Integer> s= hm.keySet();
		Iterator<Integer> it =s.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println("Key = " + key);
			System.out.println("Value = " + hm.get(key));
		} 
	
	
	System.out.println("Printing HashMap using EntrySet - Both Keys and value will be printed");		
		
	Set<Entry<Integer,String>> s2 = hm.entrySet();
		Iterator<Entry<Integer,String>> it2 = s2.iterator();
		while(it2.hasNext())
			{
				Map.Entry me = it2.next();
				System.out.println(me.getKey());
				System.out.println(me.getValue());
			}
		
		
		}


}
