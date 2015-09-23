import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Main2 {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		List a = new LinkedList();
		int num = 0;
		int count = 1;
		int val = 0;
		String number = sc.nextLine();
		try {
			 num = Integer.parseInt(number);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		while(count <=num ){
			 number = sc.nextLine();
			 val = Integer.parseInt(number);
             sum = sum + val*val;
             count++;
		}
		System.out.println(sum);
		sc.close();
	}
   
}
