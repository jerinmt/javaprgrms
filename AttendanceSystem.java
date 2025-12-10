import java.util.Scanner;

public class AttendanceSystem {
	//function to return average
	public static float getAvg(int[] list, int num) {
		int total = 0;
		for(int i = 0; i < num; i++) {
			total += list[i];
		}
		return total/num;
	}
	
	public static void main(String[] args) {
		//Take number of students
		int numberOfStudents;
		System.out.println("Enter the number of students:");
		Scanner input = new Scanner(System.in);
		numberOfStudents = input.nextInt();
		//create name and marks arrays
		String[] names = new String[numberOfStudents];
		int[] marks = new int[numberOfStudents];
		//input the names and marks
		for(int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter the name of student no. "+(i+1));
			names[i] = input.next();
			System.out.println("Enter the mark of student no. "+(i+1));
			marks[i] = input.nextInt();
		}
		input.close();
		//Displaying the mark-list
		String message;
		for(int i = 0; i < numberOfStudents; i++) {
			if(marks[i]<35) {
				System.out.println((i+1)+") "+names[i]+" - "+marks[i]+" : Needs improvement");
			} else {
				System.out.println((i+1)+") "+names[i]+" - "+marks[i]);
			}
		}
		//Display the average marks
		float average = getAvg(marks, numberOfStudents);
		System.out.println("Average marks of "+numberOfStudents+" students is "+average);
	}
	
}