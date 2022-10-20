package aa;

public class DiamondPattern {

	public static void main(String[] args) {

		int i,j,r=6;
		 for(i=0;i<=r;i++)
		   {
		     for(j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 
		   for(i=r-1;i>=1;i--)
		   {
		     for(j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
	}

}
