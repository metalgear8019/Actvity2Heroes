public class Warrior extends hero
{
	public void initSkills()
	{
		skillset.addSkill("waving his sword nonesensly");
		skillset.addSkill("shouting a meaningless cry");
		skillset.addSkill("using his scrap shield");
		skillset.addSkill("crying after laughing his guts out");
		skillset.addSkill("playing dead");
	}

	public void attack(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Warrior attacks by " + skillset.getCurrentSkill());
	}

	public void block(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Warrior blocks by " + skillset.getCurrentSkill());
	}
}