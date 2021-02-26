
public class Calculator {

	public static void main(String args[]) {
		
		if(args.length!=0)
		{
			int sum = 0;
			
			
			for(int i=0;i<args.length;i++)
			{
			int z = Integer.parseInt(args[i]);
			sum += z;
			} 
			System.out.println(sum);
		}
		else
			System.out.println("NO CLA");
			
			
	}
}
