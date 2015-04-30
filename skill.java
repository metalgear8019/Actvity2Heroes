import java.util.ArrayList;

public class skill
{
	private int currentSkill;
	private ArrayList<String> skillList;

	public skill()
	{
		currentSkill = 0;
		skillList = new ArrayList<String>();
	}

	public void addSkill(String name)
	{
		skillList.add(name);
	}

	public String getCurrentSkill()
	{
		return skillList.get(currentSkill);
	}

	public void setCurrentSkill(int s)
	{
		currentSkill = s;
	}

	public int getSkillSize()
	{
		return skillList.size();
	}
}