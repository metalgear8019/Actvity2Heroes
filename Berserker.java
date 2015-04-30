public class Berserker extends hero
{
	public void initSkills()
	{
		skillset.addSkill("having tantrums");
		skillset.addSkill("jumping all day");
		skillset.addSkill("rolling over the floor, laughing");
		skillset.addSkill("turning green");
		skillset.addSkill("plucking out flower petals");
	}

	public void attack(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Berserker attacks by " + skillset.getCurrentSkill());
	}

	public void block(int skillNum)
	{
		skillset.setCurrentSkill(skillNum);
		System.out.println("Berserker blocks by " + skillset.getCurrentSkill());
	}
}