package p1;

public class Som {
	public int mySqrt(int x) {
        int l = 1;
        int h = x;
        int r=0;
        

        while(l <= h){
            int mid=(l+h)/2;
            int sqr=mid*mid;
            if(sqr==x) {
            	return  mid;
            }
            else if(sqr<x) {
            	r=mid;
               l=mid+1;
            }
            else {
            	h=mid-1;
            }

            
          }
 return  r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Som s=new Som();
           System.out.println(s.mySqrt(16));
          
	}

}
