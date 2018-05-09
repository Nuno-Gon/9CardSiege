package logicaJogo;
import java.io.Serializable;

public class E_IronShields extends Events implements Serializable {
	
	public E_IronShields() {
		this.actionPoints = 2;
		this.evName = "Iron Shields";
		this.event = "-1 to attacks on the Siege Tower";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 3;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setSiegeTowerAttackPoints(-1);
	}

}
