package lnear;
import java.util.Scanner;
public class lnear {

	public static void main(String[] args) {
	

		 int c, n, search, a[];  
		   
		    Scanner in = new Scanner(System.in);  
		    System.out.println("Enter");  
		    n = in.nextInt();   
		    a= new int[n];  
		   
		    System.out.println("Enter total elements");  
		   
		    for (c = 0; c < n; c++)  
		      a[c] = in.nextInt();  
		   
		    System.out.println("Enter value to find");  
		    search = in.nextInt();  
		   
		    for (c = 0; c < n; c++)  
		    {  
		      if (a[c] == search) 
		      {  
		         System.out.println(search + " is present at location " + (c + 1) + ".");  
		          break;  
		      }  
		   }  
		   if (c == n)  
		      System.out.println(search + " is not present in array.");  
		  }  
		}
