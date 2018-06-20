package logicaJogo;

import java.io.Serializable;
import java.util.*;
import logicaEstados.*;

public class Game implements Serializable{

		private GameData gameData; //Dados do jogo
		private IStates state;
		
		public Game(){
			
			gameData = new GameData();
			gameData.baralhaCartas();
			state = new AwaitBeginning(gameData);
			System.out.println("New Game");
		}
		
		public GameData getGameData() {
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
	    
	    
	    /**************************************************************************************************************/
	    /**********************************                 ESTADOS                  **********************************/
	    /**************************************************************************************************************/

	    
        /*********** AwaitBeginning *********/

	    public void ResolveStart() {
	    	setState(getState().start());
	    }
	    
	    /********** AwaitEnemyLineCheck *********/
	    
	    public void ResolveLineCheck(boolean i, boolean u) {
	    	setState(getState().lineCheck(i, u));
	    }
	    
	    public void ResolveAdvance() {
	    	setState(getState().advance());
	    }
	    
	    /********* AwaitCardSelection *********/
	    
	    public void ResolveCard() {
	    	setState(getState().resolveCard());
	    }
	    
	    /******** AwaitEventPhase **********/
	    
	    public void EventPhase() {
	    	setState(getState().eventPhase());
	    }
	    
	    /******** AwaitEnemyMovePhase ******/
	    
	    public void EnemyMovement() {
	    	setState(getState().enemyMovement());
	    }
	    
	    /******* AwaitPlayerActions ******/
	    
	    public void PlayerActions(int escolha) {
	    	setState(getState().playerActions(escolha));
	    }
	    
	    public void NextState() {
	    	setState(getState().nextState());
	    }
	    
	    /****** AwaitWinOrLossCheck ******/
	    public void WinOrLossCheck(boolean wl) {
	    	setState(getState().winOrLossCheck(wl));
	    }
	    
	    /****** AwaitEndOfDay ******/
	    public void EndOfDay() {
	    	setState(getState().endOfDay());
	    }
}
