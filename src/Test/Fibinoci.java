package Test;

public class Fibinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int first=0;
	int second=1;
	int third=0;
	System.out.println(first+" "+second);
	while(first+second<=100)
	{
		third=first+second;
		System.out.println(third);
		first=second;
		second=third;
	}
	}

}
