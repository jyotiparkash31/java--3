package sunny;

public class university {
	void classroom()
	{
		System.out.println("Method for classroom");
	}
	void regularClasses()
	{
		System.out.println("Method for Regular classroom");
	}
	void eveningClasses()
	{
		System.out.println("Method for Evening classroom");
	}
	void playGround()
	{
		System.out.println("Method for playground");
		
	}
	
}
class Stanford extends university{
		
	public void regularClasses()
	{
		System.out.println("overriden class of regular classes by stanford child class");
	}
	void eveningClasses()
	{
		System.out.println("overriden class of regular classes by stanford child class");
	}
	
     void specialSessions()
	{
		System.out.println("special session");
	}
     void PHDCourse()
	{
		System.out.println("phd courses");
	}
	 void DualDegreeCourse()
	{
		System.out.println("Dual degree courses");
	}
		
}
class MIT extends university{
	
	public void regularClasses()
	{
		System.out.println("overriden class of regular classes by MIT child class");
	}
	protected void eveningClasses()
	{
		System.out.println("overriden class of regular classes by MIT child class");
	}
    void specialSessions()
	{
		System.out.println("special session");
	}
	void PHDCourse()
	{
		System.out.println("phd courses");
	}
	void DualDegreeCourse()
	{
		System.out.println("Dual degree courses");
	}
}
class NYU extends university{
	
	protected void regularClasses()
	{
		System.out.println("overriden class of regular classes by NYU child class");
	}
	public void eveningClasses()
	{
		System.out.println("overriden class of regular classes by NYU child class");
	}

	void specialSessions()
	{
		System.out.println("special session");
	}
	void PHDCourse()
	{
		System.out.println("phd courses");
	}
	void DualDegreeCourse()
	{
		System.out.println("Dual degree courses");
	}
}

