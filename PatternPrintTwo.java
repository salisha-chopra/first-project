import java.util.*;
public class PatternPrintTwo{
	public static void main(String[] args){
		int row;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i==j){
					System.out.print(i);
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
}