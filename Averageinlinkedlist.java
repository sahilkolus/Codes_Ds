


	import java.util.Scanner;
	 class Node<P> {

		
	    P data;
	    Node<P> next;
	    
	    Node(P data)
	    {
	 	   this.data=data;
	 	   next=null;
	    }
		

	}
	public class Averageinlinkedlist {

		
		public static Node<Integer> takeInput()
		{
			Node<Integer> head = null,tail=null;
			Scanner s = new Scanner(System.in);
			int data = s.nextInt();
			while(data!=-1)
			{
				Node<Integer> newNode = new Node<Integer>(data);
				
				if(head==null)
				{
					head= newNode;
					tail = newNode;
				}
				else
				{	
					tail.next= newNode; 
					tail= newNode;
				} 
				
				data = s.nextInt();
			}
			return head;
		}
		
		public static void CalculatingAvg(Node<Integer> head)
		{
			
			int sum=0,c=0;
			
			while(head!=null)
			{
				sum=sum+head.data;
				head=head.next;
				c++;
			}
			
			int avg=(int)sum/c;
			
			System.out.println(avg);
			
		}
		
		public static void main(String[] args) {
			

			Node<Integer> head = takeInput();
			
			CalculatingAvg(head);
		}

	}
