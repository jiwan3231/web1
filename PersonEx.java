package Test_A;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("serclet/jsp");
		set.add("java");
		set.add("iBATIS");
		
		int  size  = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö :" + size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("jdbc");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼¼ö :" + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
			
			
		}
		
	}
}
