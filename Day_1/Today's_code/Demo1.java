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

public class Demo1
{
	public static void main(String args[])
	{
		//int data;   //  primitive

		Student s1=new Student();   // object or instance    // reference type
		s1.setName("Rahul");
		s1.setAge(23);

		System.out.println(s1.getName()+"\t"+s1.getAge());

		Student s2=new Student();		// reference type
		s2.setName("Nilam");
		s2.setAge(21);

		System.out.println(s2.getName()+"\t"+s2.getAge());

		//System.out.println(data);


	}
}