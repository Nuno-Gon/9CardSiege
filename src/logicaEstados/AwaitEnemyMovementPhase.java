package logicaEstados;
import logicaJogo.*;

public class AwaitEnemyMovementPhase extends StateAdapter {

	public AwaitEnemyMovementPhase(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates enemyMovementPhase() {
		for(int c = 0; c < gameData.getEvAtual().enemyAdOrder.length ; c++) {
			if(gameData.getEvAtual().enemyAdOrder[c] == 0)
				return new AwaitPlayerActions(gameData);
			if(gameData.getEvAtual().enemyAdOrder[c] == 1)
				gameData.setLeft_ladder_minus(1);
			if(gameData.getEvAtual().enemyAdOrder[c] == 2)
				gameData.setMid_ram_minus(1);
			if(gameData.getEvAtual().enemyAdOrder[c] == 3)
				gameData.setRight_siege_minus(1);
			if(gameData.getEvAtual().enemyAdOrder[c] == 4) {
				gameData.setLeft_ladder_minus(1);
				gameData.setMid_ram_minus(1);
				gameData.setRight_siege_minus(1);
			}
		}
	}
}
