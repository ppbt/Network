import java.util.Scanner;

public class LoginDemo
{

	public static void main(String[] args)
	{
		String name,pwd;
		System.out.println("�������û���");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		System.out.println("����������");
		pwd = scanner.nextLine();
		if(name.equals("Java") && pwd.equals("201406"))
			System.out.println("Success");
		else {
			System.out.println("Fail");
		}		

	}

}
