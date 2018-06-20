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
	    
	    /********* AwaitTopCard *********/
	    
	    public void ResolveLineCheck() {
	    	setState(getState().lineCheck());
	    }
	    
	    public void ResolveCard() {
	    	setState(getState().resolveCard());
	    }
	    
	    public void EventPhase() {
	    	setState(getState().eventPhase());
	    }
	    
	    public void EnemyMovement() {
	    	setState(getState().enemyMovement());
	    }
	    
	    /******* AwaitPlayerActions ******/
	    
	    public void CheckAbilityPoints(int turn) {
	    	setState(getState().checkAbilityPoints(turn));
	    }
	    
	    public void SkipCard() {
	    	setState(getState().skipCard());
	    }
	    
	    public void ArchersAttack() {
	    	setState(getState().archersAttack());
	    }
	    
	    public void BoillingWater() {
	    	setState(getState().boillingWater());
	    }
	    
	    public void CloseCombat() {
	    	setState(getState().closeCombat());
	    }
	    
	    public void Coupure() {
	    	setState(getState().coupure());
	    }
	    
	    public void RallyTroops() {
	    	setState(getState().rallyTroops());
	    }
	    
	    public void TunnelMovement() {
	    	setState(getState().tunnelMovement());
	    }
	    
	    public void SupplyRaid() {
	    	setState(getState().supplyRaid());
	    }
	    
	    public void Sabotage() {
	    	setState(getState().sabotage());
	    }
	    
	    public void AdditionalActionPoints() {
	    	setState(getState().additionalActionPoint());
	    }
	    
	    public void NextState() {
	    	setState(getState().nextState());
	    }
	    
	    /****** AwaitWinOrLossCheck ******/
	    public void WinOrLossCheck() {
	    	setState(getState().winOrLossCheck());
	    }
	    
	    /****** AwaitEndOfDay ******/
	    public void EndOfDay() {
	    	setState(getState().endOfDay());
	    }
}
