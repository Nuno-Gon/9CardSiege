package logicaEstados;

import logicaJogo.*;

public class AwaitBeginning extends StateAdapter {

	public AwaitBeginning(GameData gameData){
	      super(gameData);
	}
	
	@Override
	public IStates start(int day) {
		gameData.baralhaCartas();
		gameData.setDay(day);
		return this;
	}
	
	@Override
	public IStates lineCheck(){
		if(gameData.getTunnel() == 3) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() == 1) {
				gameData.setTunnel(0);
				gameData.setText("Your soldiers died on the enemy line");
			}
			else {
				gameData.setText("Your soldiers were not detected");
			}
		}
		else {
			gameData.setText("You don't have soldiers on the enemy line");
		}
		return new AwaitTopCard(gameData);
	}
	
}