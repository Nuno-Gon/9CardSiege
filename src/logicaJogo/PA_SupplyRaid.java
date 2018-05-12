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
				}
				if(gameData.getDice() >=3 && gameData.getDice() < 6) {
					gameData.setSupplies(1);
				}
				if(gameData.getDice() == 6) {
					gameData.setSupplies(2);
				}
			}
			else {
				// aviso de que não pode levar mais supplies
			}
		}
		else {
			
			// aviso de que não tem soldados na enemy line
		}
	}

}
