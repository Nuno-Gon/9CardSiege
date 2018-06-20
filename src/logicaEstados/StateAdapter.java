package logicaEstados;

import java.io.Serializable;
import logicaJogo.GameData;

public class StateAdapter implements IStates, Serializable {
	
	GameData gameData;
	
	public StateAdapter(GameData gameData){
		this.gameData = gameData;
	}
	
	public GameData getGameData(){
		return gameData;
	}
	
	public void setGameData(GameData gameData){
		this.gameData = gameData;
	}
	
	@Override
	public IStates start() {
		return this;
	}
	
	@Override
	public IStates lineCheck() {
		return this;
	}
	
	@Override
	public IStates resolveCard() {
		return this;
	}
	
	@Override
	public IStates eventPhase() {
		return this;
	}
	
	@Override
	public IStates enemyMovement() {
		return this;
	}
	
	@Override
	public IStates checkAbilityPoints(int turn) {
		return this;
	}
	
	@Override
	public IStates skipCard(int turn) {
		return this;
	}
	
	@Override
	public IStates archersAttack() {
		return this;
	}
	
	@Override
	public IStates boillingWater() {
		return this;
	}
	
	@Override
	public IStates closeCombat() {
		return this;
	}
	
	@Override
	public IStates coupure() {
		return this;
	}
	
	@Override
	public IStates rallyTroops() {
		return this;
	}
	
	@Override
	public IStates tunnelMovement() {
		return this;
	}
	
	@Override
	public IStates supplyRaid() {
		return this;
	}
	
	@Override
	public IStates sabotage() {
		return this;
	}
	
	@Override
	public IStates additionalActionPoint() {
		return this;
	}
	
	@Override
	public IStates nextState() {
		return this;
	}
	
	@Override
	public IStates ladder() {
		return this;
	}
	
	@Override
	public IStates ram() {
		return this;
	}
	
	@Override
	public IStates tower() {
		return this;
	}
	
	@Override
	public IStates cancel() {
		return this;
	}
	
	@Override
	public IStates normalRally() {
		return this;
	}
	
	@Override
	public IStates suppliesRally() {
		return this;
	}
	
	@Override
	public IStates enterTunnelFree() {
		return this;
	}
	
	@Override
	public IStates enterTunnelFast() {
		return this;
	}
	
	@Override
	public IStates moveTunnelFreeCastle() {
		return this;
	}
	
	@Override
	public IStates moveTunnelFastCastle() {
		return this;
	}
	
	@Override
	public IStates moveTunnelFreeEnemyLine() {
		return this;
	}
	
	@Override
	public IStates moveTunnelFastEnemyLine() {
		return this;
	}
	
	@Override
	public IStates winOrLossCheck() {
		return this;
	}
	
	@Override
	public IStates endOfDay() {
		return this;
	}

	@Override
	public void quit() {
		System.exit(0);
		
	}

	@Override
	public IStates playAgain() {
		return this;
	}
}