// Array of any type : use length property	: ex - Arr.length
// For string use length() method : Ex = Str.length()
import java.util.*;

class Demo
{
	public void EvenWord(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		// Logic
		for(String s : Arr)
		{
			if((s.length() % 2) == 0)
			{
				System.out.println(s);
			}
		}
	}
}
class Program233
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.EvenWord(str);
	}
}




