
public class bubblesort {

	public static void main(int a[]) {
	int n = a.length;
		
		
		for(int i=0;i<n-1;i++)
		{   
			
			for(int j=0 ;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}

		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	

	public static void main(String[] args) {
		
		int a[] = {87,1,100,22,16,70};
		
		main(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}

}
