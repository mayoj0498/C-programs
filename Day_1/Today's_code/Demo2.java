Student and Course classes are designed by developer

// designed by developer

class Student     // blueprint or just an idea about Student
{
	// member variables  [ data ]  or instance members

	String name;     // reference type
	int age;   // primitive

	// member functions  [ operations ]
	void setName(String str)
	{
		name=str;
	}
	String getName()
	{
		return name;
	}
	void setAge(int k)
	{
		age=k;
	}
	int getAge()
	{
		return age;
	}
}


// designed by developer

class Course      // blueprint
{
	// instance members

	String name;
	int duration;
	double fees;

	// member functions

	void setName(String str)
	{
		name=str;
	}
	String getName()
	{
		return name;
	}

	void setDuration(int k)
	{
		duration=k;
	}
	int getDuration()
	{
		return duration;
	}
	void setFees(double s)
	{
		fees=s;
	}
	double getFees()
	{
		return fees;
	}
}


// defined by client



public class Demo2
{
	public static void main(String args[])
	{
		// client uses "Student" class

		Student s1=new Student();   // object or instance    // reference type
		s1.setName("Rahul");
		s1.setAge(23);

		System.out.println(s1.getName()+"\t"+s1.getAge());

		Student s2=new Student();		// reference type
		s2.setName("Nilam");
		s2.setAge(21);

		System.out.println(s2.getName()+"\t"+s2.getAge());

		

		// client uses "Course" class

		Course c1=new Course();
		c1.setName("DAC");
		c1.setDuration(6);
		c1.setFees(100000);

		System.out.println(c1.getName()+"\t"+c1.getDuration()+"\t"+c1.getFees());

		Course c2=new Course();
		c2.setName("DBDA");
		c2.setDuration(6);
		c2.setFees(120000);

		System.out.println(c2.getName()+"\t"+c2.getDuration()+"\t"+c2.getFees());

	}
}