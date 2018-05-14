package logicaJogo;
import java.io.Serializable;

public class E_BadWeather extends Events implements Serializable {
	
	public E_BadWeather () {
		this.actionPoints = 2;
		this.evName = "Bad Weather";
		this.event = "Only raid and sabotage actions allowed this turn";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 0;
	}
	
	@Override
	public void action(GameData gameData) {
		gameData.setActionCalls(new int[] {1,2,3,4,5,6});
		gameData.setActionP(actionPoints);
	}

}
