public class Archer extends hero
{
	public void initSkills()
	{
		skillset.addSkill("shooting an arrow");
		skillset.addSkill("shrugging his bow");
		skillset.addSkill("raising a white flag");
	}

	public void attack(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Archer attacks by " + skillset.getCurrentSkill());
	}

	public void block(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Archer blocks by " + skillset.getCurrentSkill());
	}
}