
public class Selection_Sort {

	
		void sort(int a[]) 
	    { 
	        int n = a.length; 
	  
	        for (int i = 0; i < n-1; i++) 
	        { 
	            int mini = i; 
	            for (int j = i+1; j < n; j++) 
	                if (a[j] < a[mini]) 
	                    mini = j; 
	  
	            
	            int temp = a[mini]; 
	            a[mini] = a[i]; 
	            a[i] = temp; 
	        } 
	    } 
	  

	    void print(int a[]) 
	    { 
	        int n = a.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(a[i]+" "); 
	        System.out.println(); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        Selection_Sort s = new Selection_Sort(); 
	        int a[] = {93,23,65,100,34,69};
	        s.sort(a); 
	        s.print(a); 
	    } 
	}