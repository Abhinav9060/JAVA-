package oops;

public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

		System.out.println(s.name);
		System.out.println(s.age);
		s.age=90;
		s.name="Abhinav";
		System.out.println(s.name);
		System.out.println(s.age);
		Student s1 = new Student();
		s1.name= "vimal";
		s1.age= 29;

		//System.out.println(s1.name);
		///System.out.println(s1.age);
		
		s.intro_yourself();
		s1.intro_yourself();

	}

}
