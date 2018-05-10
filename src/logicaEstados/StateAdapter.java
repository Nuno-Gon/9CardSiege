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
}