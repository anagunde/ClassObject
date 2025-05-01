
/*
 *       import com.jbk.Student;     = own package
         import java.util.Scanner;   =  inbuild package
         import java.io.File;        = inbuild package
 */

package PracticeQuestion;

public class Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d.m1();
		d.m2();
		d1.m2();
	}

	public static void m1() 
	{
		System.out.println("This Is Static Method........");
	}

	public void m2() {
		System.out.println("This Is Non-Static Method..........");
	}

}




