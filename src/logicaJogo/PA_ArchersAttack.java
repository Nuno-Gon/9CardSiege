package logicaJogo;
import java.io.Serializable;

public class PA_ArchersAttack extends PlayerActions implements Serializable {
	
	public PA_ArchersAttack() {
		this.apName = "Archers Attack";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getChoice() == 1) {
			gameData.setDice(gameData.RollDice() + gameData.getAttackPoints() + gameData.getLadderAttackPoints());
			if(gameData.getDice() >= 3) {
				gameData.setLeft_ladder_minus(1);
			}
		}
		
		if(gameData.getChoice() == 2) {
			gameData.setDice(gameData.RollDice() + gameData.getAttackPoints() + gameData.getBatRamAttackPoints());
			if(gameData.getDice() >= 4) {
				gameData.setMid_ram_minus(1);
			}
		}
		
		if(gameData.getChoice() == 3) {
			gameData.setDice(gameData.RollDice() + gameData.getAttackPoints() + gameData.getSiegeTowerAttackPoints());
			if(gameData.getDice() >= 5) {
				gameData.setRight_siege_minus(1);
			}
		}
	}

}
