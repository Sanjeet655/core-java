import java.util.Scanner;

public class ReverseStr{
	public static void main (String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.print("Enter your String Here :");
	String s=sc.nextLine();

	int i=s.length();
	System.out.print("Reverse String is:");
	for(int z=i;z>0;--z){
	System.out.print(s.charAt(z-1));
	}
}
}	
