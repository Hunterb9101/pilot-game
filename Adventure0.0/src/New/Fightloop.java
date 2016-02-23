package New;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.applet.Applet;
class Fightloop {
	public static void Fight(Player a) {
		// Object E;
		// int p = playerLV;
		monsters e = new monsters(a.playerLV);
		Random PlayerDamage = new Random();
		Random MonsterDamage = new Random();		
		// fight!!!!!
		while (e.health > 0 && a.life > 0) {
			int mDamageDealt = MonsterDamage.nextInt(e.damage) + 1;
			int pDamageDealt = PlayerDamage.nextInt(a.harm) + a.critic;
			a.life -= mDamageDealt;
			e.health -= pDamageDealt;			
		}

		// win
		if (e.health <= 0) {
			//you win
			a.giveGold(e.GoldGiven);
			a.giveXP(e.xpGiven);
			
		} else if (a.life <= 0) {
			//you lose ...
		}
	}
	
	
		
	}

