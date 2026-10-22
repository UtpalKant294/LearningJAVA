import java.io.*;

class LeapYear{
	
	public static void main(String...args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Year: ");

		String str = br.readLine();
	
		int yr = Integer.parseInt(str);

		if(yr % 4 == 0){
			System.out.println("Leap Year");
	
		}else{
			System.out.println("Not Leap Year");

		}
	}

}