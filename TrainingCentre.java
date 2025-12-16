class Course {
	String name;
	int numberOfWeeks;
	static int numberOfCourses = 0;
	final static String centreName = "Code Star";
	Course() {
		this.name = "HTML";
		this.numberOfWeeks = 4;
		numberOfCourses += 1;
	}
	Course(String name, int number) {
		this.name = name;
		this.numberOfWeeks = number;
		numberOfCourses += 1;
	}
	void showDetails() {
		System.out.print(this.name);
		System.out.println(" - " + this.numberOfWeeks);
	}
	class CourseMaterial {
		void showMaterials() {
			System.out.println("Materials provided for this course");
		}
	}
} 

public class TrainingCentre {

	public static void main(String[] args) {
		System.out.println(Course.centreName);
		System.out.println("Total courses: " + Course.numberOfCourses);
		Course c1 = new Course();
		Course c2 = new Course("Javascript", 6);
		c1.showDetails();
		c2.showDetails();
		System.out.println("Total courses: " + Course.numberOfCourses);
	}
	
}
