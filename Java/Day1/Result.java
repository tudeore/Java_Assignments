public class Result {
	public static void main(String[] args)
	{
	int marathi = 70;
	int hindi=70;
	int english=70;
	if(marathi > 60 && hindi > 60 && english > 60)
		{
		System.out.println("Congratulation you are pass");
		} else  if(marathi > 60 && hindi > 60 ||marathi>60 && english>60 ||hindi>60 &&marathi>60)
			{
			System.out.println("Result = Promoted");
			}
			else{
				System.out.println("fail");
				}
			}
		}