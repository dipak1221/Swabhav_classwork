import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.add("Element 1");
		l.add("Element 2");
		l.add("Element 3");
		l.add("Element 4");
		l.add("Element 5");
		
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));

	}

}
