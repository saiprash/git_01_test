import java.util.Scanner;

public class Main {
      public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in); 
    	 String numb = sc.nextLine();
    	 try {
    	    int num = Integer.parseInt(numb);
    	    printPrime(num);
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }  
    	 
      }
      
      public static void printPrime(int n) {
    	  if(n<=1) {
        	  System.out.println("No primes less than 2");
    	  }
    	  else {
    		
    		boolean flag = true;
    		int i = 2;
    		System.out.println(i);
    		i++;
    		while(i<=n) {
    			flag = true;
    			for(int j=2;j<Math.pow(i,1/2);j++) {
    				if(i%j==0) {
    					flag = false;
    					break;
    				}
    			}
    			if(flag == true) {
    				System.out.println(i);
    			}
    			i=i+2;
    		}
    		  
    	  }
    	  
      }
}
