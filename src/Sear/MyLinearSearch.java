package Sear;

public class MyLinearSearch {

	public static void main(String[] args) {
		int[] a= {4,7,1,2,9};
		System.out.println(mySearch(a,7));
		System.out.println(mySearch(a,5));
	}
	public static int mySearch(int[] arr,int n)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return i;
			}
		}
		return -1;
	}

}
