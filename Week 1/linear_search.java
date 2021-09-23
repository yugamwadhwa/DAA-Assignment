import java.io.*;
import java.util.*;
public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scn= new Scanner(System.in);
			int key;
			
			int n= scn.nextInt();
			for(int i=0;i<n;i++)
			{
				int size= scn.nextInt();
				int[] arr= new int[size];
				for(int j=0;j<size;j++)
				{
					arr[j]=scn.nextInt();
				}
				key= scn.nextInt();
				for(int k=0;k<size;k++)
				{
					if(arr[k]==key)
					{
						System.out.println("present "+key);
						return;
					}
				}
				System.out.println("not present"+key);
			}
				
				
			
	}

}
