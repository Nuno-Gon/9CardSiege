package logicaJogo;
import java.io.Serializable;

public class E_Rally extends Events implements Serializable {

	public E_Rally() {
		this.actionPoints = 3;
		this.evName = "Rally!";
		this.event = "+1 to attacks on Close Combat or Circle Spaces";
		this.enemyAdOrder = new int [2];
		this.enemyAdOrder[0] = 2;
		this.enemyAdOrder[1] = 3;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setCloseCombatPoints(1);
		gameData.setCircleAttackPoints(1);
	}
}
