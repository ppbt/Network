
public class LibBookTest
{

	public static void main(String[] args)
	{
		LibBook javaBook = new LibBook();
		javaBook.isbn = "1234-4312413";
		javaBook.name = "����һ����Ư����JAVA��";
		javaBook.price = 100;
		javaBook.isBorrowed = false;
		System.out.println(javaBook.getInfo());
		javaBook.borrow();
		System.out.println(javaBook.getInfo());
		
		LibBook pythonBook = new LibBook();
		pythonBook.isbn = "132434-1234";
		pythonBook.name = "��Ư����Python��";
		pythonBook.price = 12.5;
		System.out.println(pythonBook.getInfo());

	}

}
