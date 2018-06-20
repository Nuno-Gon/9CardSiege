package logicaJogo;
import java.io.Serializable;

public class PA_SupplyRaid extends PlayerActions implements Serializable {
	
	public PA_SupplyRaid() {
		this.apName = "Supply Raid";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getTunnel() == 3) {
			if(gameData.getSupplies() != 2) {
				gameData.setDice(gameData.RollDice());
				if(gameData.getDice() < 3) { // CAPTURE PROCEDURE
					gameData.setTunnel(0);
					gameData.setMid_morale_minus(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you lost your soldiers on the enemy line");
					gameData.setChange(true);
					gameData.setActionP_minus(1);
				}
				if(gameData.getDice() >=3 && gameData.getDice() < 6) {
					gameData.setSupplies(1);
					gameData.setText("You rolled an " + gameData.getDice() + ", you successfully got one supply");
					gameData.setChange(true);
					gameData.setActionP_minus(1);
				}
				if(gameData.getDice() == 6) {
					gameData.setSupplies(2);
					gameData.setText("You rolled an " + gameData.getDice() + ", you successfully got two supplies");
					gameData.setChange(true);
					gameData.setActionP_minus(1);
				}
			}
		}
		else {
			gameData.setText("You don't have soldiers on the enemy line");
			gameData.setWrongOption(true);
		}
	}

}
