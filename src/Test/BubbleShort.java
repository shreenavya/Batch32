package Test;

import java.util.Arrays;

public class BubbleShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {10,20,50,30};
System.out.println(Arrays.toString(arr));
int temp=0;
boolean flag=true;
for(int i=0;i<arr.length;i++)
{
	while(flag)
	{
		if(arr[i]>arr[i+1])
		{
		temp=	arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
				}
	}
	System.out.println(Arrays.toString(arr3));
}
System.out.println(Arrays.toString(arr));
	}

}