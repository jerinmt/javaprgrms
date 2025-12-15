class Student {
	private String name;
	private int rollno;
	private float percentage;
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setRollno(int n) {
		this.rollno = n;
	}
	public void setPercentage(float n) {
		this.percentage = n;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Jerin Moni Thomas");
		s1.setRollno(19);
		s1.setPercentage(78.2f);
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		System.out.println(s1.getPercentage());
	}

}
