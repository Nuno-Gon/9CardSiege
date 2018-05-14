package logicaEstados;
import logicaJogo.*;

public class AwaitPlayerActions extends StateAdapter {
	
	public AwaitPlayerActions(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates playerActions(int escolha) {
		gameData.setAction(gameData.getActionsList().get(escolha-1));	
		gameData.getAction().action(gameData);
		
		return new AwaitWinOrLossCheck(gameData);
	}

}
