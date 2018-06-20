package logicaEstados;
import logicaJogo.*;

public class AwaitEndOfDay extends StateAdapter {
	
	public AwaitEndOfDay(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates endOfDay() {
		gameData.setRight_supplies_minus(1);
		if(gameData.getTunnel() == 1 || gameData.getTunnel() == 2) {
			gameData.setTunnel(0);
		}
		if(gameData.getTunnel() == 3) {
			gameData.setTunnel(0);
			gameData.setMid_morale_minus(1);
			gameData.setSupplies(0);
		}
		
		if(gameData.getDay() == 3) {
			gameData.setChoice(2);
			return new AwaitQuit(gameData);
		}
		else
			gameData.setDay(gameData.getDay() + 1);
		
		return new AwaitTopCard(gameData);
	}

}
