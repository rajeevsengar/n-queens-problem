import java.util.Scanner;
public class Main{
	public static void main(String []args){
		System.out.print("Enter 'n' for nXn board ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Board board=new Board(n);
		Queen obj=new Queen();
		obj.queen(0,board);
		System.out.println("Total Possible Cases "+obj.count);
	}
}