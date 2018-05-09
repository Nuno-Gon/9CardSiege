package logicaJogo;
import java.io.Serializable;

public class E_VolleyOfArrows extends Events implements Serializable {
	
	public E_VolleyOfArrows() {
		this.actionPoints = 3;
		this.evName = "Volley of Arrows";
		this.event = "+1 to all attacks";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 2;
	}

	@Override
	public void action(GameData gameData) {
		gameData.setAttackPoints(1);
	}
}
