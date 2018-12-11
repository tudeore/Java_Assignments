import java.util.Scanner;

public class Student
{	
	public static void main(String [] args)
	{
	Scanner input=new Scanner(System.in);

	System.out.println("Enter marks for studentFirst");
	int studentOneSubjectOne=input.nextInt();
	int studentOneSubjectTwo=input.nextInt();
	int studentOneSubjectThree=input.nextInt();
	
	System.out.println("Enter marks for studentSecond");
	int studentSecondSubjectOne=input.nextInt();
	int studentSecondSubjectTwo=input.nextInt();
	int studentSecondSubjectThree=input.nextInt();
	
	System.out.println("Enter marks for studentThird");
	int studentThirdSubjectOne=input.nextInt();
	int studentThirdSubjectTwo=input.nextInt();
	int studentThirdSubjectThree=input.nextInt();
	
	int totalOfStudentOne = total(studentOneSubjectOne,studentOneSubjectTwo,studentOneSubjectThree);
	System.out.println("Total Marks of Student First =" +totalOfStudentOne);
	
	int totalOfStudentTwo = total(studentSecondSubjectOne,studentSecondSubjectTwo,studentSecondSubjectThree);
	System.out.println("Total Marks of Student Second =" +totalOfStudentTwo);
	
	int totalOfStudentThree=total(studentThirdSubjectOne,studentThirdSubjectTwo,studentThirdSubjectThree);
	System.out.println("Total Marks of Student Third =" +totalOfStudentThree);

	System.out.println();
	int totalOfSubject1=total(studentOneSubjectOne,studentSecondSubjectOne,studentThirdSubjectOne);
	
	System.out.println("Total Marks of subject First =" +totalOfSubject1);
	int totalOfSubject2=total(studentOneSubjectTwo,studentSecondSubjectTwo,studentThirdSubjectTwo);
	
	System.out.println("Total Marks of subject Second =" +totalOfSubject2);
	int totalOfSubject3=total(studentOneSubjectThree,studentSecondSubjectThree,studentThirdSubjectThree);
	
	System.out.println("Total Marks of subject Third =" +totalOfSubject3);
	System.out.println();

	int averageOfStudentOne=totalOfStudentOne/3;
	System.out.println("Average Marks of Student First =" +averageOfStudentOne);
	
	int averageOfStudent2= totalOfStudentTwo/3;
	System.out.println("Average Marks of Student Second =" +averageOfStudent2);
	
	int averageOfStudentThree= totalOfSubject1/3;
	System.out.println("Average Marks of Student Third =" +averageOfStudentThree);
	System.out.println();

	int averageSubjectOne=totalOfSubject2/3;
	System.out.println("Average Marks of subject First =" +averageSubjectOne);
	
	int averageOfSubjectTwo=totalOfSubject3/3;
	System.out.println("Average Marks of subject Second =" +averageOfSubjectTwo);
	
	int averageOfSubjectThree=totalOfStudentThree/3;
	System.out.println("Average Marks of subject third =" +averageOfSubjectThree);

	}

	public static int total(int numberOne,int numberTwo,int numberThree)
	{
	int addition= numberOne + numberTwo + numberThree;
	return addition;
	}

}
