package logicaJogo;
import java.io.Serializable;

public class PA_CloseCombatAttack extends PlayerActions implements Serializable {
	
	public PA_CloseCombatAttack() {
		this.apName = "Close Combat Attack";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getLeft_ladder() == 0 && gameData.getChoice() == 1) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() >= 5) {
				gameData.setLeft_ladder_plus(1);
				gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
				gameData.setChange(true);
			}
			else {
				gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
				gameData.setChange(true);
			}
		}
		
		else if(gameData.getMid_ram() == 0 && gameData.getChoice() == 2) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() >= 5) {
				gameData.setMid_ram_plus(1);;
				gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
				gameData.setChange(true);
			}
			else {
				gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
				gameData.setChange(true);
			}
		}
		
		else if(gameData.getRight_siege() == 0 && gameData.getChoice() == 3) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() >= 5) {
				gameData.setRight_siege_plus(1);;
				gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
				gameData.setChange(true);
			}
			else {
				gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
				gameData.setChange(true);
			}
		}
		
		else {
			gameData.setText("There is no enemies on the Close Combat Space");
			gameData.setWrongOption(true);
		}
	}

}
