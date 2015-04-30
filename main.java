import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		int heroChoice = 0;
		int attackChoice = 0;
		int blockChoice = 0;
		hero heroList[] = new hero[5];
		heroList[0] = new Archer();
		heroList[1] = new Thief();
		heroList[2] = new Warrior();
		heroList[3] = new Mage();
		heroList[4] = new Berserker();
		Scanner s = new Scanner(System.in);

		System.out.print("Choose your hero by inputting a number from 0-4: ");
		heroChoice = Integer.parseInt(s.nextLine());
		System.out.print("Choose an attack skill by inputting a number from 0-" + (heroList[heroChoice].getSkillset().getSkillSize()-1) + ": ");
		attackChoice = Integer.parseInt(s.nextLine());
		System.out.print("Choose an block skill by inputting a number from 0-" + (heroList[heroChoice].getSkillset().getSkillSize()-1) + ": ");
		blockChoice = Integer.parseInt(s.nextLine());

		heroList[heroChoice].attack(attackChoice);
		heroList[heroChoice].block(blockChoice);
	}
}