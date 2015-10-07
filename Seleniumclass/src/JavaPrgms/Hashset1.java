package JavaPrgms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset1 {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<> ();
		s.add("Selenium");
		s.add("SoapUi");
		s.add("QTP");
		s.add("Hadoop");
		s.add("Codedui");
		s.add("LR");
		//s.add("10"); //Declaring only 5 string values and This make deletes the any1 among all other strings & occupies it's space. 
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
