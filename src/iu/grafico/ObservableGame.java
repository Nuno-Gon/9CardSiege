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
}
