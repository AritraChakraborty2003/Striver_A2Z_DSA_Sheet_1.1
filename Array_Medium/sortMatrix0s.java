package Array_Medium;
import java.util.*;
public class sortMatrix0s {

	public static void main(String[] args) {
		    int[][] a= {{1,0,1},{1,1,1},{1,1,0}};
		    setMatrixZeros(a,a.length,3);
		    for(int i=0;i<a.length;i++) {
		    	for(int j=0;j<a.length;j++) {
		    		System.out.print(a[i][j]+" ");
		    	}
		    	System.out.println();
		    }
		}
	
	static void setMatrixZeros(int a[][],int n,int m) {
		int[] col=new int[m];
		int[] row=new int[n];
		Arrays.fill(col,0);
		Arrays.fill(row,0);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
					if(a[i][j]==0) {
						col[j]=1;
						row[i]=1;
			}
			}
		}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(row[i] == 1 || col[j]==1)
					{	
						 a[i][j]=0;
					}
						
			}
		}
		
		
	}
}

