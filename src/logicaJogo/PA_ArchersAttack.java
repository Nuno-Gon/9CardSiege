package logicaJogo;
import java.io.Serializable;

public class PA_ArchersAttack extends PlayerActions implements Serializable {
	
	public PA_ArchersAttack() {
		this.apName = "Archers Attack";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getChoice() == 1 && gameData.getLeft_ladder() != 4) {
			gameData.setDice(gameData.RollDice() + gameData.getAttackPoints() + gameData.getLadderAttackPoints());
			if(gameData.getDice() >= 3) {
				gameData.setLeft_ladder_plus(1);
				gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
				gameData.setChange(true);
				gameData.setActionP_minus(1);
			}
			else {
				gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
				gameData.setChange(true);
				gameData.setActionP_minus(1);
			}
		}
		
		else if(gameData.getChoice() == 2 && gameData.getMid_ram() != 4) {
			gameData.setDice(gameData.RollDice() + gameData.getAttackPoints() + gameData.getBatRamAttackPoints());
			if(gameData.getDice() >= 4) {
				gameData.setMid_ram_plus(1);
				gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
				gameData.setChange(true);
				gameData.setActionP_minus(1);
			}
			else {
				gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
				gameData.setChange(true);
				gameData.setActionP_minus(1);
			}
		}
		
		else if(gameData.getChoice() == 3 && gameData.getRight_siege() != 4) {
			gameData.setDice(gameData.RollDice() + gameData.getAttackPoints() + gameData.getSiegeTowerAttackPoints());
			if(gameData.getDice() >= 5) {
				gameData.setRight_siege_plus(1);
				gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
				gameData.setChange(true);
				gameData.setActionP_minus(1);
			}
			else {
				gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
				gameData.setChange(true);
				gameData.setActionP_minus(1);
			}
		}
		
		else {
			gameData.setText("Wrong option, choose another option");
			gameData.setWrongOption(true);
		}
	}

}
