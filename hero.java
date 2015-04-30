public abstract class hero
{
	private final String typeList[];
	private int type;
	protected skill skillset;

	public hero()
	{
		this(0);
	}

	public hero(int t)
	{
		typeList = new String[3];
		typeList[0] = "Intelligence";
		typeList[1] = "Agility";
		typeList[2] = "Strength";
		type = t;
		skillset = new skill();
		initSkills();
	}

	public String getType()
	{
		return typeList[type];
	}

	public void setType(int t)
	{
		if (t >= 0 && t <= 2)
			type = t;
	}

	public skill getSkillset()
	{
		return skillset;
	}

	public abstract void attack(int skillNum);
	public abstract void block(int skillNum);
	public abstract void initSkills();
}