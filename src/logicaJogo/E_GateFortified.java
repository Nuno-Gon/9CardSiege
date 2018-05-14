package logicaJogo;
import java.io.Serializable;

public class E_GateFortified extends Events implements Serializable {

	public E_GateFortified() {
		this.actionPoints = 2;
		this.evName = "Gate Fortified";
		this.event = "+1 to attacks on the Battering Ram";
		this.enemyAdOrder = new int[2];
		this.enemyAdOrder[0] = 1;
		this.enemyAdOrder[1] = 2;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setBatRamAttackPoints(1);
		gameData.setActionP(actionPoints);
	}
}
