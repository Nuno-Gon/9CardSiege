package logicaJogo;
import java.io.Serializable;

public class PA_BoilingWaterAttack extends PlayerActions implements Serializable {
	
	public PA_BoilingWaterAttack() {
		this.apName = "Boiling Water Attack";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getLeft_ladder() == 1 || gameData.getMid_ram() == 1 || gameData.getRight_siege() == 1) {
			if(gameData.getLeft_ladder() == 1 && gameData.getChoice() == 1) {
				gameData.setDice(gameData.RollDice() + gameData.getCircleAttackPoints() + gameData.getAttackPoints() + gameData.getLadderAttackPoints());
				if(gameData.getDice() >= 3) {
					gameData.setLeft_ladder_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
					gameData.setChange(true);
				}
				else if (gameData.getDice() == 1) {
					gameData.setMid_morale_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost 1 morale point");
					gameData.setChange(true);
				}
				
				else {
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
					gameData.setChange(true);
				}
				gameData.setActionCalls(new int[] {2});
			}
			
			else if(gameData.getMid_ram() == 1 && gameData.getChoice() == 2) {
				gameData.setDice(gameData.RollDice() + gameData.getCircleAttackPoints() + gameData.getAttackPoints() + gameData.getBatRamAttackPoints());
				if(gameData.getDice() >= 4) {
					gameData.setMid_ram_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
					gameData.setChange(true);
				}
				else if (gameData.getDice() == 1) {
					gameData.setMid_morale_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost 1 morale point");
					gameData.setChange(true);
				}
				
				else {
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
					gameData.setChange(true);
				}
				gameData.setActionCalls(new int[] {2});
			}
			
			else if(gameData.getRight_siege() == 1 && gameData.getChoice() == 3) {
				gameData.setDice(gameData.RollDice() + gameData.getCircleAttackPoints() + gameData.getAttackPoints() + gameData.getSiegeTowerAttackPoints());
				if(gameData.getDice() >= 5) {
					gameData.setRight_siege_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you won the fight");
					gameData.setChange(true);
				}
				else if (gameData.getDice() == 1) {
					gameData.setMid_morale_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost 1 morale point");
					gameData.setChange(true);
				}
				else {
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost the fight");
					gameData.setChange(true);
				}
				
				gameData.setActionCalls(new int[] {2});
			}
			
			else {
				gameData.setText("There is no enemy in the line you chose to attack");
				gameData.setWrongOption(true);
			}
		}
		
	}
	
}
