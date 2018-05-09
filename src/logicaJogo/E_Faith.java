package logicaJogo;
import java.io.Serializable;

public class E_Faith extends Events implements Serializable {
	
	public E_Faith() {
		this.actionPoints = 3;
		this.evName = "Faith";
		this.event = "+1 to attacks on the Battering Ram";
		this.enemyAdOrder = new int[3];
		this.enemyAdOrder[0] = 1;
		this.enemyAdOrder[1] = 2;
		this.enemyAdOrder[2] = 3;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setBatRamAttackPoints(1);
		gameData.setLadderAttackPoints(1);
		gameData.setMoralePoints(1);
	}

}
