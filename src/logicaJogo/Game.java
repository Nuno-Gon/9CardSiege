package logicaJogo;

import java.io.Serializable;
import java.util.*;

import logicaEstados.*;

public class Game implements Serializable{

		private GameData gameData; //Dados do jogo
		private IStates state;
		
		public Game(){
			
			gameData = new GameData();
			state = new AwaitBeginning(gameData);
			System.out.println("New Game");
		}
		
		public GameData getDataGame() {
	        return gameData;
	    }
		
		public void setGameData(GameData gameData) {
	        this.gameData = gameData;
	    }
		
		public IStates getState() {
	        return state;
	    }

	    public void setState(IStates state) {
	        this.state = state;
	    } 
	    
	    public void baralhaCartas(){
	    	gameData.baralhaCartas();
	    }
}
