package Sear;

public class MyBinarySearch {

	public static void main(String[] args) {
		int[] a={2,4,5,6,8,9,12};
		System.out.println(mySearch(a,7));
		System.out.println(mySearch(a,5));
	}
	public static int mySearch(int[] a, int n)
	{
		int l=0;
		int h=a.length-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(n==a[m])
			{
				return n;
			}
			else if(n<a[m])
			{
				h=m-1;
			}
			else
			{
				l=m+1;
			}
		}
		return -1;
	}
	
}
