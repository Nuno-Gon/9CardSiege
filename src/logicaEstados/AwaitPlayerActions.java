package logicaEstados;
import logicaJogo.*;

public class AwaitPlayerActions extends StateAdapter {

	public AwaitPlayerActions(GameData gameData) {
		super(gameData);
	}
	
	/*@Override
	public IStates playerActions(int escolha, int alvo) {
		//gameData.setAction(gameData.getActionsList().get(escolha-1));	
		//gameData.getAction().action(gameData);
		switch(escolha) {
			case 1: return new AwaitArchersAttack();
					break;
			case 2: return new AwaitBoillingWaterAttack();
					break;
			case 3: return new AwaitCloseCombatAttack();
					break;
			case 4: gameData.setAction(gameData.getActionsList().get(escolha-1));	
					gameData.getAction().action(gameData);
					break;
			case 5: return new AwaitRallyTroops();
					break;
			case 6: return new AwaitTunnelMovement();
					break;
			case 7: gameData.setAction(gameData.getActionsList().get(escolha-1));	
					gameData.getAction().action(gameData);
					break;
			case 8: gameData.setAction(gameData.getActionsList().get(escolha-1));	
					gameData.getAction().action(gameData);
					break;
			case 9: gameData.setAction(gameData.getActionsList().get(escolha-1));	
					gameData.getAction().action(gameData);
					break;
		}
		return this;
	}*/
	
	@Override
	public IStates checkAbilityPoints(int turn) {
		if(gameData.getActionP() == 0) {
			gameData.setCardSelected(gameData.getCardsList().get(turn + 1));
			return new AwaitWinOrLossCheck(gameData);
		}
		return this;
	}
	
	@Override
	public IStates skipCard(int turn) {
		gameData.setCardSelected(gameData.getCardsList().get(turn + 1));
		return new AwaitWinOrLossCheck(gameData);
	}
	
	@Override
	public IStates archersAttack() {
		return new AwaitArchersAttack(gameData);
	}
	
	@Override
	public IStates boillingWater() {
		return new AwaitBoillingWater(gameData);
	}
	
	@Override
	public IStates closeCombat() {
		return new AwaitCloseCombat(gameData);
	}
	
	@Override
	public IStates coupure() {
		gameData.setAction(gameData.getActionsList().get(3));	
		gameData.getAction().action(gameData);
		return new AwaitWinOrLossCheck(gameData);
	}
	
	@Override
	public IStates rallyTroops() {
		return new AwaitRallyTroops(gameData);
	}
	
	@Override
	public IStates tunnelMovement() {
		return new AwaitTunnelMovement(gameData);
	}
	
	@Override
	public IStates nextState() {
		return new AwaitWinOrLossCheck(gameData);
	}

}
