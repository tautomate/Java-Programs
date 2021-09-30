package occurences;

public class Swap {
public static void main(String args[]) {
	int a=5,b=2; 
	//swapping elements without third variable like temp
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("b=" +b+" " +"a=" +a);
}
}
