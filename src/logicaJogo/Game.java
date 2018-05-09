package logicaJogo;

import java.io.Serializable;
import java.util.*;

public class Game implements Serializable{

		private GameData gameData; //Dados do jogo
		//private // Estado do jogo
		
		public Game(){
			
			gameData = new GameData();
			System.out.println("New Game");
		}
		
		public GameData getDataGame() {
	        return gameData;
	    }
		
		public void setGameData(GameData gameData) {
	        this.gameData = gameData;
	    }
}
