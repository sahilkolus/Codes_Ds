
public class Insertion_sort {

	
		 void sort(int a[]) 
		    { 
		        int n= a.length; 
		        for (int i=1; i<n;++i) { 
	
		            int j=i-1; 
		            int key=a[i];
		            
		            while (j>= 0 && a[j]>key) { 
		                a[j+1] = a[j]; 
		                j=j-1; 
		            } 
		            a[j+1]=key; 
		        } 
		    } 
		  
		   
		    static void print(int a[]) 
		    { 
		        int n= a.length; 
		        for (int i=0; i<n;++i) 
		            System.out.print(a[i] + " "); 
		  
		        System.out.println(); 
		    } 
		  
		   
		    public static void main(String args[]) 
		    { 
		        int a[] = {134,67,89,43,93}; 
		  
		        Insertion_sort s = new Insertion_sort(); 
		        s.sort(a); 
		  
		        print(a); 

	}
	}
