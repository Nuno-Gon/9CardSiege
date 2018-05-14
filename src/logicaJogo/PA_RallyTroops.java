package logicaJogo;
import java.io.Serializable;

public class PA_RallyTroops extends PlayerActions implements Serializable {
	
	public PA_RallyTroops() {
		this.apName = "Rally Troops";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getMid_morale() != 4) {
			if(gameData.getChoice() == 1) {
				gameData.setDice(gameData.RollDice() + gameData.getMoralePoints());
				if(gameData.getDice() >=5) {
					gameData.setMid_morale_plus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you increased your morale");
					gameData.setChange(true);
				}
			}
			else if(gameData.getChoice() == 2) { // Gasta supplies para +1 DRM
				gameData.setRight_supplies_minus(1);
				gameData.setDice(gameData.RollDice() + gameData.getMoralePoints() +1);
				if(gameData.getDice() >= 5) {
					gameData.setMid_morale_plus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you increased your morale");
					gameData.setChange(true);
				}
			}
			else {
				gameData.setText("You can't raise your morale");
				gameData.setWrongOption(true);
			}
		}
	}

}
