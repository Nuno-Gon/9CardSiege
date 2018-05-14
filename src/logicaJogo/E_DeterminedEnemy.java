package logicaJogo;
import java.io.Serializable;

public class E_DeterminedEnemy extends Events implements Serializable {
	
	public E_DeterminedEnemy() {
		this.actionPoints = 2;
		this.evName = "Determined Enemy";
		this.event = "-1 to attacks on Battering Ram";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 2;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setBatRamAttackPoints(-1);
		gameData.setActionP(actionPoints);
	}

}
