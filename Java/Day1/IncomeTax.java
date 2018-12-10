import java.util.Scanner;
public class IncomeTax {
			public static void main(String[] args)
			{
		     double incometax =0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Income =");
			int ctc= sc.nextInt();
			if(ctc>0 && ctc<=180000)
			{
			System.out.println("Tax payabal = Nil");
			}else if(ctc> 180001 && ctc <=300000)
				{
				incometax = ctc*0.1 ;
				System.out.println("income tax =" +incometax);
				}else if(ctc >300001 && ctc <= 500000)
					{
					incometax = ctc*0.2;
					System.out.println("income tax =" +incometax);
					}else if(ctc >500001 && ctc <= 1000000)
					{
					incometax = ctc*0.3;
					System.out.println("income tax =" +incometax);
					}
	}
}