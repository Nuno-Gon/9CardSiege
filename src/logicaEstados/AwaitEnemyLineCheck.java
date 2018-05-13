package logicaEstados;
import logicaJogo.*;

public class AwaitEnemyLineCheck extends StateAdapter {
	
	public AwaitEnemyLineCheck(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates lineCheck(boolean i, boolean u) {
		if(gameData.getTunnel() == 3) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() == 1) {
				gameData.setTunnel(0);
				i = true;
			}
			else {
				u = true;
			}
		}
		return this;
	}
	
	@Override
	public IStates advance() {
		return new AwaitCardSelection(gameData);
	}

}
