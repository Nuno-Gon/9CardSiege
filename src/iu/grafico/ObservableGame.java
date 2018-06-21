package iu.grafico;

import logicaEstados.*;
import logicaJogo.*;
import java.util.*;

public class ObservableGame extends Observable{
	Game game;
	
	public ObservableGame(){
		game = new Game();
	}
	
	public Game getGame(){
		return game;
	}
	
	public void setGame(Game game){
		this.game = game;
		
		setChanged();
		notifyObservers();
	}
	
	public IStates getState(){
		return game.getState();
	}
	
	public void ResolveStart()
    {
        game.ResolveStart();
       
        setChanged();
        notifyObservers();
    }
	
	public void EnemyLineCheck() {
		game.ResolveLineCheck();
		
		setChanged();
    	notifyObservers();
	}
	
	public void TopCard() {
		game.ResolveCard();
		
		setChanged();
    	notifyObservers();
	}
	
	public void Event() {
		game.EventPhase();
		
		setChanged();
    	notifyObservers();
	}
	
	public void EnemyMov() {
		game.EnemyMovement();
		
		setChanged();
    	notifyObservers();
	}
	
	public void CheckAP() {
		game.CheckAbilityPoints();
		
		setChanged();
    	notifyObservers();
	}
	
	public int getLadder(){
        return game.getGameData().getLeft_ladder();
    }
	
	public int getRam(){
        return game.getGameData().getMid_ram();
    }
     
    public int getSiege(){
        return game.getGameData().getRight_siege();
    }
      
    public int getTrebuchet(){
        return game.getGameData().getTrebuchet();
    }  
    
    public int getWall() {
        return game.getGameData().getLeft_wall();
    }

    public int getMorale() {
        return game.getGameData().getMid_morale();
    }

    public int getSupplies() {
        return game.getGameData().getRight_supplies();
    }

    public int getTunnel() {
        return game.getGameData().getTunnel();
    }

    public int getRaidSupplies() {
        return game.getGameData().getSupplies();
    }
    
    public void actionCoupure(){
    	game.Coupure();
    	
    	setChanged();
        notifyObservers();
    }
    
    public void actionSupplyRaid() {
    	game.SupplyRaid();
    	
    	setChanged();
    	notifyObservers();
    }
    
    public void actionSabotage() {
    	game.Sabotage();
    	
    	setChanged();
    	notifyObservers();
    }
    
    public void actionAdditionalAP() {
    	game.AdditionalActionPoints();
    	
    	setChanged();
    	notifyObservers();
    }
    public void actionSkipCard() {
    	game.SkipCard();
    	
    	setChanged();
    	notifyObservers();
    }
}
