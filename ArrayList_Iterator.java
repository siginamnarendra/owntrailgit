package collections;
import java.util.*;
public class ArrayList_Iterator {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<100;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			if((int)(l.get(i))%2==1)
				System.out.println(l.get(i));
		}
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			if(Integer.valueOf(l.get(i))%2==1)
				System.out.println(l.get(i));
		}
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" _");
		}
	}
}
