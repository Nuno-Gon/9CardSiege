package logicaJogo;
import java.io.Serializable;

public class E_BoilingOil extends Events implements Serializable {

	public E_BoilingOil() {
		this.actionPoints = 2;
		this.evName = "Boiling Oil";
		this.event = "+2 to attacks on enemy units in circle spaces";
		this.enemyAdOrder = new int[2];
		this.enemyAdOrder[0] = 1;
		this.enemyAdOrder[1] = 2;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setCircleAttackPoints(2);
		gameData.setActionP(actionPoints);
	}
}
