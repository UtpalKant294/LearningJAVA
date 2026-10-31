import java.io.*;
class Assingment2Q2{
	public static void main(String...args)throws Exception{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Salary: ");

		String str = br.readLine();
		double salary = Double.parseDouble(str);
		
		double pf = salary*12/100;
		System.out.println(pf);
	}
}