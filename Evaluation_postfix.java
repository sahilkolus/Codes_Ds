

	import java.util.Stack;

	public class Evaluation_postfix {
		
		
		
		public static int evaluatePostFix(String a)
		{
			
			 Stack<Integer> stack=new Stack<>(); 
	         
		        
		        for(int i=0;i<a.length();i++) 
		        { 
		            char c=a.charAt(i); 
		   
		            if(Character.isDigit(c)) 
		            stack.push(c - '0'); 
		             
		            else
		            { 
		                int value1 = stack.pop(); 
		                int value2 = stack.pop(); 
		                  
		                switch(c) 
		                { 
		                    case '-': 
		                    stack.push(value2-value1); 
		                    break; 
		                      
		                    case '+': 
		                    stack.push(value2+ value1); 
		                    break; 
		                      
		                    case '/': 
		                    stack.push(value2/value1); 
		                    break; 
		                      
		                    case '*': 
		                    stack.push(value2*value1); 
		                    break; 
		              } 
		            } 
		        } 
		        return stack.pop();
		}

		public static void main(String[] args) {
			
			String a="576*+5-"; 
	        System.out.println("postfix evaluation: "+evaluatePostFix(a));
	   
		}

	}

