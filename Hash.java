package p1;
import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashMap<Integer,Character> p=new HashMap<>();
          p.put(1, 's');
          p.put(2,'b');
          System.out.println(p);
          System.out.println("Size of HasMap "+p.size());
          System.out.println(p.get(1));
	}

}
