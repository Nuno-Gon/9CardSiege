package logicaJogo;
import java.io.Serializable;

public class E_EnemyFatigue extends Events implements Serializable {
	
	public E_EnemyFatigue() {
		this.actionPoints = 3;
		this.evName = "Enemy Fatigue";
		this.event = "+1 to Coupure, Raid and Sabotage actions";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 1;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setCoupurePoints(1);
		gameData.setRaidPoints(1);
		gameData.setSabotagePoints(1);
	}

}
