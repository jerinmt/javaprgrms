public class GradeChecker {

	public static void main(String[] args) {
		int marks[] = {42, 53, 100, 60, 45};
		int total = 0;
        int average;
        boolean isFailed = false;
		System.out.println("Grade Card");
		for(int i = 0; i < 5; i++) {
			if(marks[i]<35) {
				isFailed = true;
                break;
			} else {
                total += marks[i];
            }
		}
        if(isFailed) {
            System.out.println("Failed");
        } else {
            average = total/5;
            if(average>=90) {
                System.out.println("Grade A");
            } else if(average>=75) {
                System.out.println("Grade B");
            } else if(average>=60) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade D");
            }
        }
	}

}