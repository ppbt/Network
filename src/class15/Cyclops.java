package class15;

public class Cyclops extends Monster
{
	
	String weapon;
	public Cyclops(String name, int att, int def, int hp, String weapon)
	{
		super(name, att, def, hp);
		this.weapon = weapon;		
	}
	
	@Override
	void showInfo()
	{	
		super.showInfo();
		System.out.println(" ������" + weapon);
		
	}
	
	@Override
	void attack(Monster monster)
	{
		int harm = this.att - monster.def;
		if( harm < 1 )
			harm = 1;
		monster.hp -= harm;
		System.out.println(name + " ʹ��" + weapon + "��������" + monster.name + "���" + harm + "���˺�" );
		
	}
	


}
