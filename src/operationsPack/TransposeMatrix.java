package operationsPack;

public class TransposeMatrix {
public static int[][] transpose(int arr[][])
{
	int[][] result=new int[arr[0].length][arr.length];
	for(int i=0;i<arr[0].length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			arr[i][j]=arr[j][i];
			
		}
	}

return result;}
}
