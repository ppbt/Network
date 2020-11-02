package class15;

public class Dryad extends Monster
{	
	public Dryad(String name, int att, int def, int hp, double height)
	{
		super(name, att, def, hp);
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	double height;
	
	@Override
	void showInfo()
	{	
		super.showInfo();
		System.out.println(" �߶�: " + height);
	}
	
	@Override
	void attack(Monster monster)
	{
		int harm = this.att - monster.def;
		if( harm < 1 )
			harm = 1;
		monster.hp -= harm;
		System.out.println(name + " ʹ����֦���ƹ�������" + monster.name + "���" + harm + "���˺�" );
		
	}
}
