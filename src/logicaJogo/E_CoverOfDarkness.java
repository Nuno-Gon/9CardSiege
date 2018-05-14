package logicaJogo;
import java.io.Serializable;

public class E_CoverOfDarkness extends Events implements Serializable {
	
	public E_CoverOfDarkness() {
		this.actionPoints = 3;
		this.evName = "Cover of Darkness";
		this.event = "+1 to Raid and Sabotage actions";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 4;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setRaidPoints(1);
		gameData.setSabotagePoints(1);
		gameData.setActionP(actionPoints);
	}

}
