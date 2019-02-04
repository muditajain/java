import java.util.*;
class ArrayListDemo1
{
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		System.out.println("Initial size of al:"+al.size());
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("D");
		al.add("F");
		System.out.println(al);
		al.add(1,"A2");
		System.out.println("Initial size addition al:"+al.size());
		System.out.println("Initial size addition al:"+al);
		Iterator<String> itr=al.Next();
		while(itr.hasNext())
		{
			String element= itr.Next();
			System.out.print("elemnt+");
		}
		System.out.println("modified content");
		ListIterator<String> litr=al.ListIterator();
		while(litr.hasNext())
		{
		String element= litr.Next();
			System.out.print("elemnt+");	
		}
		System.out.println("previous element");
		while(litr.hasPrevious())
		{
		String element= litr.Previous();
			System.out.print("elemnt+");	
		}	
	}
}