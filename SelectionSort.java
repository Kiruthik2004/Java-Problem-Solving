import java.util.*;
public class SelectionSort
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++){
		    int selection=i;
		    for(int j=i+1;j<n;j++){
		        if(a[selection]>a[j]){
		            selection=j;
		        }
		    }
		    int temp=a[i];
		    a[i]=a[selection];
		    a[selection]=temp;
		}
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
