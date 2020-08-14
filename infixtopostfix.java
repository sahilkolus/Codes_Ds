package infix2postfix;
import java.util.Stack;
public class infixtopostfix {
	
	 static int precedence(char a)
	 {
	        switch (a)
	        {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	                return 3;
	        }
	        return -1;
	    }

	    static String infixtopostfix(String ex){

	        String result = "";
	        Stack<Character> stack = new Stack<>();
	        for (int i = 0; i <ex.length() ; i++) {
	            char c = ex.charAt(i);

	      
	            if(precedence(c)>0){
	                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
	                    result += stack.pop();
	                }
	                stack.push(c);
	            }else if(c==')'){
	                char x = stack.pop();
	                while(x!='('){
	                    result += x;
	                    x = stack.pop();
	                }
	            }else if(c=='('){
	                stack.push(c);
	            }else{
	               
	                result += c;
	            }
	        }
	        for (int i = 0; i <=stack.size() ; i++) {
	            result += stack.pop();
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        String exp = "A+B*(C^D-E)";
	        System.out.println("Infix Expression: " + exp);
	        System.out.println("Postfix Expression: " +infixtopostfix(exp));
	    }
	}

