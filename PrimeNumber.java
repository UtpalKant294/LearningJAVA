import java.io.*;
class PrimeNumber{
	public static void main(String...args) throws Exception{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number: ");

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int count = 0;

		for(int i=1; i<=num; i++){
			if(num % i ==0){
				count++;
			}
		}
		
		if(num >= 2 && count == 2){
			System.out.println("It is Prime Number");

		}else{
			System.out.println("It is not Prime Number");
		}   
	}
}