import java.io.*;
class Assingment2Q1{
	public static void  main(String...args)throws Exception{
 		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Shoe Brand (Nike, Adidas, Puma or Reebok): ");
		
		String brand = br.readLine();
		
		switch(brand){
			case"Nike": System.out.println("Just Do It");
				break;

			case"Adidas": System.out.println("Impossible is Nothing");
				break;

			case"Puma": System.out.println("Forever Faster");
				break;

			case"Reebok": System.out.println("I am What I am");
				break;

			default: System.out.println("Brand Not Found");
		}
	}
}