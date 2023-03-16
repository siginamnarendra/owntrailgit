package collections;
import java.util.*;
public class ListCreations {

	public static void main(String[] args) {
		List l=new ArrayList();
		
		ArrayList lc=new ArrayList();
		
		lc.add(11);lc.add(22);
		System.out.println("list "+l);
		System.out.println("arraylist "+lc);
		
		for(int i=0;i<3;i++)
			l.add("adf"+i);
		System.out.println("list "+l);
		
		l.add(11);l.add(22);
		System.out.println("list "+l);
		System.out.println("list loop");
		
		for(int i=0;i<l.size();i++)
			System.out.print(l.get(i)+" ");
		System.out.println();
		
		System.out.println(l+" list");
		l.addAll(lc);
		System.out.println("list with col\n "+l);
		
		System.out.println("size ="+l.size());
		System.out.println(l.remove(0));
		System.out.println("list with col\n after remove of 0="+l);
		
		System.out.println(lc+"arraylist");
		System.out.println("before remove of collec ="+l);
		System.out.println("lc collec ="+lc);
		System.out.println(l.removeAll(lc));
		System.out.println("after remove of collec ="+l);
		
		
		System.out.println(l);
		lc.add(22);lc.add(44);lc.add(11);
		List t=new ArrayList();t.add(11);t.add(22);
		System.out.println(lc);
		System.out.println(t);
		System.out.println(l.removeAll(t));
		System.out.println(lc);
		//System.out.println(l.contains("adf1"));
		//System.out.println(l.containsAll(lc));*/
	}

}
