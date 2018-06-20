package logicaJogo;
import java.io.Serializable;

public class PA_Sabotage extends PlayerActions implements Serializable {
	
	public PA_Sabotage() {
		this.apName = "Sabotage";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getTunnel() == 3) {
			if(gameData.getTrebuchet() > 0) {
				gameData.setDice(gameData.RollDice() + gameData.getSabotagePoints());
				if(gameData.getDice() >= 5) {
					gameData.setTrebuchet_minus(1);
					gameData.setActionP_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you decreased the enemies number of trebuchets");
					gameData.setChange(true);
				}
				else if(gameData.getDice() == 1) {
					gameData.setTunnel(0);
					gameData.setMid_morale_minus(1);
					gameData.setActionP_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost your soldiers on the enemy line");
					gameData.setChange(true);
				}
				else {
					gameData.setText("You rolled an " + gameData.getDice() + ", the sabotage didn't go well");
					gameData.setChange(true);
					gameData.setActionP_minus(1);
				}
			}
		}
		else {
			gameData.setText("You do not have soldiers on the enemy line!");
			gameData.setWrongOption(true);
		}
	}

}
