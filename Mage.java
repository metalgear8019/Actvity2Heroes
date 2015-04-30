public class Mage extends hero
{
	public void initSkills()
	{
		skillset.addSkill("breaking his \"stick\"");
		skillset.addSkill("waving his \"stick\" like a helicopter");
		skillset.addSkill("invoking \"harden\" using a \"stick\"");
	}

	public void attack(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Mage attacks by " + skillset.getCurrentSkill());
	}

	public void block(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Mage blocks by " + skillset.getCurrentSkill());
	}
}