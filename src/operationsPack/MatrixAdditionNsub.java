package operationsPack;

public class MatrixAdditionNsub {
public static int[][] add(int[][]arr1,int[][]arr2)
{
	int result[][]=new int[arr1.length][arr1[0].length];
	if(arr1.length==arr2.length  && arr1[0].length==arr2[0].length)
	{	
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr1[0].length;j++)
		{
			result[i][j]=arr1[i][j]+arr2[i][j];//for substraction result[i][j]=arr1[i][j]-arr2[i][j];
			
		}
	}
}
	return result;}
}
