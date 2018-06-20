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
	
	public int getLadder(){
        return game.getGameData().getLeft_ladder();
    }
	
	public int getRam(){
        return game.getGameData().getMid_ram();
    }
     
    public int getSiege(){
        return game.getGameData().getRight_siege();
    }
      
    public int getTrincheiras(){
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
}
