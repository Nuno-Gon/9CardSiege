package logicaJogo;
import java.io.Serializable;
import java.util.*;

public class E_Illness extends Events implements Serializable {
	
	public E_Illness() {
		this.actionPoints = 2;
		this.evName = "Illness";
		this.event = "Reduces moral by 1\nReduces supplies by 1";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 3;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setMid_morale_minus(1);
		gameData.setRight_supplies_minus(1);
		gameData.setActionP(actionPoints);
	}
}
