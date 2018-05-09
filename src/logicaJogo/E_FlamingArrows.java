package logicaJogo;
import java.io.Serializable;

public class E_FlamingArrows extends Events implements Serializable {

	public E_FlamingArrows() {
		this.actionPoints = 3;
		this.evName = "Flaming Arrows";
		this.event = "+1 to attacks on the Siege Tower";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 3;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setSiegeTowerAttackPoints(1);
	}
}
