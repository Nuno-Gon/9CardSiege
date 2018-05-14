package logicaJogo;
import java.io.Serializable;

public class E_RepairedTrebuchet extends Events implements Serializable {
	
	public E_RepairedTrebuchet() {
		this.actionPoints = 2;
		this.evName = "Repaired Trebuchet";
		this.event = "Add 1 Trebuchet (max 3) \n+1 to Coupure action";
		this.enemyAdOrder = new int[2];
		this.enemyAdOrder[0] = 1;
		this.enemyAdOrder[1] = 2;
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getTrebuchet() < 3)
			gameData.setTrebuchet_plus(1);
		gameData.setCoupurePoints(1);
		gameData.setActionP(actionPoints);
	}

}
