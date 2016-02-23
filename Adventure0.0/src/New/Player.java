package New;
public class Player {

	public int playerLV = 1;
	public int Health = 1;
	public int Evasion = 1;
	public int power = 1;
	public int harm = playerLV + power * 2;
	public int life = 4 + playerLV + Health * 5 * Evasion;
	public int gold = 0;
	public int xp = 0;
	public String job;
	public int critic = 1;

	public Player(String j) {
		job = j;
		if (job.equalsIgnoreCase("Thief")) {
			//set critical hits
			//set weaknesses
		} else if (job.equalsIgnoreCase("warrior")) {
			//set critical hits
			//set weaknesses
		} else if (job.equalsIgnoreCase("archer")) {
			//set critical hits
			//set weaknesses
		}
	}

	public void giveXP(int xpGiven) {
		xp += xpGiven;
		if (xp >= 5 + (5 * playerLV)) {
			playerLV = playerLV + 1;
			xp = 0;
		} else if (playerLV == 11) {
			//max lvl, restart
			playerLV = 1;
			harm = 2 + playerLV;
			life = 9 + playerLV;
			gold = 0;
			xp = 0;
		}

	}

	public void giveGold(int GoldGiven) {
		gold += GoldGiven;
	}
}
