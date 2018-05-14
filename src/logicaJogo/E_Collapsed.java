package logicaJogo;
import java.io.Serializable;

public class E_Collapsed extends Events implements Serializable {
	
	public E_Collapsed() {
		this.actionPoints = 2;
		this.evName = "Collapsed!";
		this.event = "Siege Tower removed from game if on starting space";
		this.enemyAdOrder = new int[2];
		this.enemyAdOrder[0] = 1;
		this.enemyAdOrder[1] = 2;
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getRight_siege() == 4)
			gameData.setRight_siege(5);
		gameData.setActionP(actionPoints);
	}

}
