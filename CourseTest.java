class Courses {
	String name;
	int duration;
	int numberOfStudents;
	final static String creatorName = "Code Star";
	static int totalStudents = 0;
	Courses(String name, int duration, int number) {
		this.name = name;
		this.duration = duration;
		this.numberOfStudents = number;
		totalStudents += number;
	}
	static class Platform {
		void showCourses() {
			System.out.println("Courses are hosted on Code Star");
		}
	}
}

public class CourseTest {

	public static void main(String[] args) {
		Courses c1 = new Courses("HTML", 4, 10);
		Courses c2 = new Courses("CSS", 6, 10);
		Courses c3 = new Courses("HTML", 8, 5);
		System.out.println(Courses.creatorName);
		System.out.println(Courses.totalStudents);
		System.out.println(c1.name);
		System.out.println(c1.duration);
		System.out.println(c1.numberOfStudents);
		System.out.println(c2.name);
		System.out.println(c2.duration);
		System.out.println(c2.numberOfStudents);
		System.out.println(c3.name);
		System.out.println(c3.duration);
		System.out.println(c3.numberOfStudents);
		Courses.Platform obj = new Courses.Platform();
		obj.showCourses();
	}

}
