import java.util.ArrayList;

public class Student
{
	String name;
	String no;
	int age;
	ArrayList courses = new ArrayList();
	
	public void dispInfo()
	{
		System.out.println("������ " + name + "; ѧ��: " +  no + "; ���䣺 " + age + "; ��ѡ�γ̣� " );

		for (Object course : courses)
		{
			System.out.print(course + " ");
			
		}
		
	}
	
	public void choiceCourse(String name)
	{
		courses.add(name);
	}
	
	public void quitCourse(String name)
	{
		courses.remove(name);
	}
	
	
}
