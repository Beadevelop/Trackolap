package test;
//Checking changes
import my.Student;

public class Demo {

	public static void main(String[] args) {

		Student s[] = new Student[5];

		s[0] = new Student("Rohit", "e1", 30);
		s[1] = new Student("Dipanshu", "e2", 28);
		s[2] = new Student("Vanshita", "e3", 36);
		s[3] = new Student("Dipali", "e4", 40);
		s[4] = new Student("Vikash", "e5", 35);

		for (int i = 0; i < s.length; i++) {
			s[i].show();
			System.out.println(" ");
		}

		for (int i = 0; i < s.length; i++) {

			for(int j= i+1; j<s.length; j++)
			{
				if(s[i].marks < s[j].marks)
				{
					int temp = s[i].marks;
					s[i].marks = s[j].marks;
					s[j].marks = temp;
				}
			}
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(s[0].marks);
		System.out.println(s[1].marks);
		System.out.println(s[2].marks);
	}

}
