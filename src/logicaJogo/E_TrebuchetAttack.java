package logicaJogo;
import java.io.Serializable;
import java.util.*;


public class E_TrebuchetAttack extends Events implements Serializable {
	
	public E_TrebuchetAttack(int actionP) {
		this.evName = "Trebuchet Attack";
		this.actionPoints = actionP;
		this.event = "3 Trebuchet - -2 damage to wall \n 2 Trebuchet - -1 damage to wall \n 1 Trebuchet - -1 damage to the wall on D6 roll of 4, 5 or 6\n";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 0;
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getTrebuchet() == 3) {
			gameData.setLeft_wall_minus(2);
		}
		else if(gameData.getTrebuchet() == 2) {
			gameData.setLeft_wall_minus(1);
		}
		else if(gameData.getTrebuchet() == 1) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() == 4 || gameData.getDice() == 5 || gameData.getDice() == 6) {
				gameData.setLeft_wall_minus(1);
			}
		}
		gameData.setActionP(actionPoints);
	}
}
