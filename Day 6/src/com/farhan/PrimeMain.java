package com.farhan;
import java.lang.Math;

public class PrimeMain {
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
			int res[] = new int[7];
			int index = -1;
			for(int i=0;i<inputArray.length;i++)
			{
				boolean flag = false;
				for(int j = 2;j<Math.sqrt(inputArray[i]);j++)
				{
					if(inputArray[i]%j==0)
					{
						flag = false;
						break;
						
					}
					flag = true;
				}
				if(flag)
					res[++index] = inputArray[i];
			}
			return res;
		}
		public static void main(String[] args)
		{
			PrimeMain obj = new PrimeMain();
			int arr[] = {10,12,5,50,11,14,15};
			int res[] = obj.findAndReturnPrimeNumbers(arr);
			if(res[0]==0)
			{
				System.out.println("Prime number not found in the supplied Array");
			}
			else
			{
				int i = 0;
				while(res[i]!=0)
					System.out.println(res[i++]);
			}	
		}
}
