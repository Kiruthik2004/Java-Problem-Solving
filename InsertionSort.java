import java.util.*;
public class InsertionSort
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
		}
		for(int i=1;i<n;i++){//32564
		    int key=a[i];//2
		    int j=i-1;//0
		    while(j>=0 && a[j]>key){//0>=0&&3>2||condition fails
		        a[j+1]=a[j];//33564
		        j--;//j=-1
		    }
		    a[j+1]=key;//a[0+1]=2--->23564
		}
		for(int i=0;i<n;i++){
		   System.out.print(a[i]+" ");
		}
	}
}
