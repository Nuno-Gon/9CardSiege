package logicaJogo;
import java.io.Serializable;

public class E_DeathOfALeader extends Events implements Serializable {

	public E_DeathOfALeader() {
		this.actionPoints = 2;
		this.evName = "Death of a Leader";
		this.event = "Reduces morale by 1";
		this.enemyAdOrder = new int[2];
		this.enemyAdOrder[0] = 1;
		this.enemyAdOrder[1] = 3;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setMid_morale_minus(1);
	}
}
