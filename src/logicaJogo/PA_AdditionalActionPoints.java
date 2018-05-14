package logicaJogo;
import java.io.Serializable;

public class PA_AdditionalActionPoints extends PlayerActions implements Serializable {
	
	public PA_AdditionalActionPoints() {
		this.apName = "Additional Action Points";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getAdditionalAP() == 0) {
			if(gameData.getChoice() == 1) { // escolhe gastar um ponto de moral
				gameData.setMid_morale_minus(1);
				gameData.setActionP_plus(1);
				gameData.setAdditionalAP(1);
				gameData.setText("You used a Morale Point to get an additional Action Point");
				gameData.setChange(true);
			}
			else if(gameData.getChoice() == 2) { // escolhe gastar um ponto de supplies
				gameData.setRight_supplies_minus(1);
				gameData.setActionP_plus(1);
				gameData.setAdditionalAP(1);
				gameData.setText("You used a Supplie Point to get an additional Action Point");
				gameData.setChange(true);
			}
		}
	}

}
