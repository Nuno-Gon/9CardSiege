package logicaEstados;
import logicaJogo.*;

public class AwaitEventPhase extends StateAdapter {
	
	public AwaitEventPhase(GameData gameData) {
		super(gameData);
	}

	@Override
	public IStates eventPhase() {
		gameData.getEvAtual().action(gameData);
		return new AwaitEnemyMovement(gameData);
	}

}
