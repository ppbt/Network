package class16;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		int a = 10, b = 0, c;
		
	    //����ĳ���Ϊ0����������쳣
		try
		{
			c = a / b;
			System.out.println("**********************");
		} catch (Exception e)
		{
			System.out.println("�����쳣�ˡ�����");
		}
		
		System.out.println("��������");
	    
	    


	}

}
