package p1;

public class Recur {
	public int Printno(int n) {
		if(n==1 || n==0) {
		return 1;
		}
		 
		return n* Printno(n-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Recur r=new Recur();
        System.out.println(r.Printno(5));
	}

}
