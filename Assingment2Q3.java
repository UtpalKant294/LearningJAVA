import java.io.*;
class Assingment2Q3{
	public static void main(String...args)throws Exception{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Age : ");
		String str1 = br.readLine();
		int age = Integer.parseInt(str1);
		
		System.out.print("Enter Salary: ");
		String str2 = br.readLine();
		double sal = Double.parseDouble(str2);

		if(age < 30 && sal > 100000){
			System.out.println("Eligible for Marriage");
		}else{
			System.out.println("Not Eligible for Marriage");

		}
	}
}