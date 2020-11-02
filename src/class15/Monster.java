package class15;

public class Monster
{
	String name;
	int att, def, hp;	
	
	
	public Monster(String name, int att, int def, int hp)
	{
		super();
		this.name = name;
		this.att = att;
		this.def = def;
		this.hp = hp;
	}

	void showInfo()
	{
		System.out.print("�������ƣ�" + name + " Ѫ��: " + hp + " ������:" + att + " ��������" + def);
	}
	
	boolean isDeath()
	{		
		return hp <= 0;
	}
	
	void attack(Monster monster)
	{
		int harm = this.att - monster.def;
		if( harm < 1 )
			harm = 1;
		monster.hp -= harm;
	}
}
