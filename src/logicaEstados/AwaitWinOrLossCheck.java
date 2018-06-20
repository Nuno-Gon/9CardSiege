package logicaEstados;
import logicaJogo.*;

public class AwaitWinOrLossCheck extends StateAdapter {
	
	public AwaitWinOrLossCheck(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates winOrLossCheck() {
		if(gameData.getLeft_wall()==0 || gameData.getMid_morale()==0 || gameData.getRight_supplies()==0) {
			gameData.setChoice(1);
			return new AwaitQuit(gameData);
		}
		if((gameData.getLeft_ladder() == 0 && gameData.getMid_ram() == 0) || (gameData.getLeft_ladder() == 0 && gameData.getRight_siege() == 0) || (gameData.getMid_ram() == 0 && gameData.getRight_siege() == 0)) {
			gameData.setChoice(1);
			return new AwaitQuit(gameData);
		}
		if(gameData.getTurn() == 7) {
			return new AwaitEndOfDay(gameData);
		}
		else {
			for(int i = 0 ; i < 8; i++)
				gameData.setActionCalls[i] = 1;
		}
		return new AwaitTopCard(gameData);
	}
}
