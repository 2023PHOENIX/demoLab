import javax.lang.model.util.ElementScanner6;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class sum
{

	public static void main(String args[])
	{
	
		int a = 10;
		int b = 20;
		
		int c  = 5;

		if(a>b)
		{
			if(a>c)
				System.out.println(a);
		
		}
		else if(b>c)
		{
			if(b>a)
				System.out.println(b);
		}
		else 
			System.out.println(c);
		
	}


}
