import java.util.Scanner;
class Main{
	public static void main (String[] args){
	       Scanner in = new Scanner(System.in);
      int n = in .nextInt();
      int count;
      int sum = 0;
      for(count =1; count<=n; count= count+1)
      {
        sum = count + sum;
        
      }
      System.out.println(sum);
	}
}