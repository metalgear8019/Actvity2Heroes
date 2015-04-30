public class Thief extends hero
{
	public void initSkills()
	{
		skillset.addSkill("pickpocketing");
		skillset.addSkill("hiding under the hay");
	}

	public void attack(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Thief attacks by " + skillset.getCurrentSkill());
	}

	public void block(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Thief blocks by " + skillset.getCurrentSkill());
	}
}