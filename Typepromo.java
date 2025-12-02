package javaprograms;

public class Typepromo {

	public static void main(String[] args) {
		byte b = 50; 
	    char c = 'a'; 
	    short s = 1024; 
	    int i = 1234;
	    int m = 1;
	    float f = 7.67f; 
	    double d = .6921; 
			
	    int result = (int) ((int)(f / b) - (i / c) + (d * s));
	    int answer = m * c; 
			
	    System.out.println("result = " + result);
	    System.out.println("result = " + answer);

	}

}
