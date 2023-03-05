import java.util.ArrayList;
public class Solution {
	public static int first(ArrayList<Integer> arr, int n, int x)
	{
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;
		int q=-1;
		while(start<=end)
		{
			if(arr.get(mid)==x)
			{
			 q=mid;
			end=mid-1;
			}
			else if(x>arr.get(mid))
			start=mid+1;
			else
			end=mid-1;
			mid=start+(end-start)/2;
		}
return q;
	}
	public static int last(ArrayList<Integer> arr, int n, int x)
	{
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;;
		int q=-1;
		while(start<=end)
		{
			if(arr.get(mid)==x)
			{
			q=mid;
			start=mid+1;
			}
			else if(x>arr.get(mid))
			{
				start=mid+1;
			}
			else
			end=mid-1;
			mid=start+(end-start)/2;

		}
		return q;
	}
	public static Pair findFirstLastPosition(ArrayList<Integer> arr, int n, int x) {
		int f=first(arr, n, x);
		int l=last(arr, n, x);
		Pair p1=new Pair();
		p1.first=f;
		p1.second=l;
	
		return p1;

	}
}
