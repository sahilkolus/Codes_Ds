package queusingarray;
import java.util.Queue;
public class Que_using_array {

	

		private int data[];
		private int front;
		private int rear; 
		private int size;
	    
		
		public Que_using_array() {
			data = new int[10];
			front=-1;
			rear=-1;
			size=0;
		}
		
		public Que_using_array (int capacity) {
			data = new int[capacity];
			front=-1;
			rear=-1;
			size=0;
		}

	    int size()
	    {
	    	return size;
	    }

	    boolean isEmpty()
	    {
	    	return size()==0;
	    }

	    int front() throws QueueEmptyException
	    {   
	    	if(size()==0)
	    	{
	    		throw new QueueEmptyException();
	    	}
	    	
	    	return data[front];
	    }
	    
	    void enqueue(int element) 
	    {     
	    	if(size==data.length)
	    	{
	    		doubleCapacity();
	    	}
	    	
	    	
	    	if(size==0)
	    	{
	    		front=0;
	    	}
	    	
	    	
	    	rear++;
	    	size++;
	    	
	    	if(rear==data.length)
	    	{
	    		rear=0;
	    	}
	    	data[rear]=element;
	    }

	    private void doubleCapacity() {
				
	    	int temp[]= data;
	    	data= new int[2*temp.length];
	    	int index=0;
	    	for(int i=front; i<temp.length;i++)
	    	{
	    		data[index]=temp[i];
	    		index++;
	    	}
	    	
	    	for(int i=0;i<=front-1;i++)
	    	{
	    		data[index]=temp[i];
	    		index++;
	    	}
	    	front=0;
	    	rear=temp.length-1;
	    	
			
		}

		int  dequeue() throws QueueEmptyException {	
	    	if(size()==0)
	    	{
	    		throw new QueueEmptyException();
	    	}
	    	int temp = data[front];
	    	
	    	front = (front+1)%data.length;
    	front++;
    	if(front==data.length)
    	{
    		front=0;
	    	}
	    	size--;
	    	if(size==0)
	    	{
	    		front=-1;
	    		rear=-1;
	    	}
	    	return temp;
		}
		}
