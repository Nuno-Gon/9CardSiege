package logicaEstados;
import logicaJogo.*;

public class AwaitQuit extends StateAdapter {
	
	public AwaitQuit(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public void quit() {
		if(gameData.getChoice() == 1) {
			gameData.setText("You lost!");
			System.exit(0);
		}
		
		if(gameData.getChoice() == 2) {
			gameData.setText("You won!");
			System.exit(0);
		}
		
		System.exit(0);
	}
	
	@Override
	public IStates playAgain() {
		if(gameData.getChoice() == 2) {
			gameData.setText("You won");
			return new AwaitBeginning(gameData);
		}
		else {
			gameData.setText("You lost");
			return new AwaitBeginning(gameData);
		}
	}

}
