package logicaEstados;

import logicaJogo.*;

public class AwaitBeginning extends StateAdapter {

	public AwaitBeginning(GameData gameData){
	      super(gameData);
	}
	
	@Override
	public IStates start(){
	    //gameData.baralhaCartas();
	    // gameData.lCheck(gameData.getTunnel());
	    return new AwaitEnemyLineCheck(gameData);
	}
	
	@Override
	public IStates lineCheck(){
		if(gameData.getTunnel() == 3) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() == 1) {
				gameData.setTunnel(0);
				// perdeu os soldados
			}
			else {
				// soldados indetataveis
			}
		}
		else {
			//sem soldados na linha inimiga
		}
		return new AwaitBeginning(gameData);
	}
	
	@Override
	public IStates resolveCard() {
		gameData.setEvAtual(gameData.getCardsList().get(0).getEvents(gameData.getDay()));
		return new AwaitBeginning(gameData);
	}
	
	@Override
	public IStates eventPhase() {
		gameData.getEvAtual().action(gameData);
		return new AwaitBeginning(gameData);
	}
	
	@Override
	public IStates enemyMovement() {
		for(int c = 0; c < gameData.getEvAtual().enemyAdOrder.length ; c++) {
			if(gameData.getEvAtual().enemyAdOrder[c] == 0)
				break;
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
		
		if(gameData.getLeft_ladder() == 0 && gameData.getMid_ram() == 0 || gameData.getLeft_ladder() == 0 && gameData.getRight_siege() == 0 || gameData.getMid_ram() == 0 && gameData.getRight_siege() == 0) {
			return new AwaitCloseCombat(gameData);
		}
		
		return new AwaitPlayerActions(gameData);
	}
	
}