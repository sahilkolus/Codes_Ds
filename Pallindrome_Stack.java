import java.util.Stack;
public class Pallindrome_Stack {

	public static boolean isPallindrome(String a)
	{
		Stack<Character> stack = new Stack<>();
		
		int ln = a.length();
		
		int i=0;
		int mid=ln/2;
		
		for(i=0;i<mid;i++)
		{
			stack.push(a.charAt(i));
		}
		
		if(ln%2!=0)
		{
			i++;
		}
		
		while(i<ln)
		{
			char u = stack.pop();
			
			if(u!=a.charAt(i))
			{
				return false;
			}
			i++;
		}
		
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		String a="eyes";
		
		if(isPallindrome(a))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}
	}

