package logicaEstados;
import logicaJogo.*;

public class AwaitRallyTroops extends StateAdapter {
	
	public AwaitRallyTroops(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates normalRally() {
		gameData.setChoice(1);
		gameData.setAction(gameData.getActionsList().get(4));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override
	public IStates suppliesRally() {
		gameData.setChoice(2);
		gameData.setAction(gameData.getActionsList().get(4));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override
	public IStates cancel() {
		return new AwaitPlayerActions(gameData);
	}

}
