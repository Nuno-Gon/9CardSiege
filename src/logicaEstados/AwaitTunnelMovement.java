package logicaEstados;
import logicaJogo.*;

public class AwaitTunnelMovement extends StateAdapter {
	
	public AwaitTunnelMovement(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates enterTunnelFree() {
		gameData.setChoice(2);
		gameData.setAction(gameData.getActionsList().get(5));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override
	public IStates enterTunnelFast() {
		gameData.setChoice(1);
		gameData.setAction(gameData.getActionsList().get(5));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override 
	public IStates moveTunnelFreeCastle() {
		gameData.setChoice(2);
		gameData.setSecondChoice(1);
		gameData.setAction(gameData.getActionsList().get(5));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override 
	public IStates moveTunnelFastCastle() {
		gameData.setChoice(1);
		gameData.setSecondChoice(1);
		gameData.setAction(gameData.getActionsList().get(5));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override
	public IStates moveTunnelFreeEnemyLine() {
		gameData.setChoice(2);
		gameData.setSecondChoice(2);
		gameData.setAction(gameData.getActionsList().get(5));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override 
	public IStates moveTunnelFastEnemyLine() {
		gameData.setChoice(1);
		gameData.setSecondChoice(2);
		gameData.setAction(gameData.getActionsList().get(5));	
		gameData.getAction().action(gameData);
		return new AwaitPlayerActions(gameData);
	}
	
	@Override
	public IStates cancel() {
		return new AwaitPlayerActions(gameData);
	}
}
