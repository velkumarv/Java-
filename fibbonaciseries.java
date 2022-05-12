package week1.day3.assingnment3;

public class fibbonaciseries {
	
	
public static void main(String[] args) {
		
		int first = 5;
		System.out.println(first);
		int second= 10;
		System.out.println(second);
	
		for (int i = 5; i <=10; i++) {
			int sum= first+ second;
			System.out.println(sum);
			first= second;
			second =sum;
			
		}
	}

}
