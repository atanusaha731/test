package testtt.java;

public class Binary {
	public static  void binarySearch(int arr[],int  key)
	{
		int l= 0;
		int high=arr.length;
		while(l<=high)
		{ 
		int	mid=(l+high)/2;
			if(arr[mid]==key)
			{
				System.out.println("yo bro" );
				break;
			}
			else if(arr[mid]<key)
			{
				l=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,3,5,7,9};

		 int k=7;
		 binarySearch(ar,k);

	}

}
