package logicaEstados;
import logicaJogo.*;

public class AwaitArchersAttack extends StateAdapter {
	
	public AwaitArchersAttack(GameData gameData) {
		super(gameData);
	}
	
	@Override IStates askLine() {
		return this;
	}
	
	@Override
	public IStates archersAttack() {
		
	}
}
