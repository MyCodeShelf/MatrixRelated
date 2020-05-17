package operationsPack;

public class MatrixMultiplication {
public static int[][] multiply(int[][]arr1 ,int[][]arr2)
{
	int[][] result=new int[arr1.length][arr2[0].length];
	
	for( int i=0;i<arr1.length;i++)
	{
		for(int  j=0;j<arr2[0].length;j++)
		{
			int  sum=0;
			for(int k=0;k<arr1[0].length;k++) //or for(int k=0;k<arr2.length;k++)
				sum=sum+arr1[i][k]*arr2[k][j];
			result[i][j]=sum;
			
		}
		
	}

return result;
}
}
