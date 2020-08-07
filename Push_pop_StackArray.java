	import java.util.List;
	import java.util.ArrayList;
public class Push_pop_StackArray {


	    private List<Integer> stack;

	    public Push_pop_StackArray(int SIZE) 
	    {
	        stack = new ArrayList<Integer>(SIZE);
	    }

	    public void push(int i) 
	    {

	       stack.add(0,i);
	     }

	     public int pop() 
	     { 
	        if(!stack.isEmpty()){
	           int i= stack.get(0);
	           stack.remove(0);
	           return i;
	        } else{
	           return -1;
	        }
	     }

	     public int peek()
	     {
	        if(!stack.isEmpty()){
	           return stack.get(0);
	        } else{
	           return -1;
	        }
	     }
}

