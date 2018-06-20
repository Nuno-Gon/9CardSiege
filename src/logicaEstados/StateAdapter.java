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
	public IStates start(){
		return this;
	}
	
	@Override
	public IStates lineCheck(boolean i, boolean u){
		return this;
	} 
	
	@Override
	public IStates advance() {
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
	public IStates playerActions(int escolha) {
		return this;
	}
	
	@Override
	public IStates winOrLossCheck(boolean wl) {
		return this;
	}
	
	@Override
	public IStates endOfDay() {
		return this;
	}

	@Override
	public IStates nextState() {
		return this;
	}
}