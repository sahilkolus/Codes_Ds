import java.util.*;
public class duplicate {

	public static void main(String[] args) {
		  Scanner scan = new Scanner (System.in);

	         System.out.println("Enter the number of elemments");
	         int n = scan.nextInt();
	         System.out.println("Enter the array elemments");
	         int a[]= new int[n];
	         for(int i=0;i<n;i++)
	         {
	             a[i]= scan.nextInt();      
	         }

	         for(int i=0;i<n;i++)
	         {
	             if(a[Math.abs(a[i])]>=0){
	                a[Math.abs(a[i])]= - a[Math.abs(a[i])];
	             }
	             else{
	                 System.out.println(Math.abs(a[i]) + " ");
	             }
	         }
	}



	}


