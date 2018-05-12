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
				}
				if(gameData.getDice() == 1) {
					gameData.setTunnel(0);
					gameData.setMid_morale_minus(1);
				}
			}
		}
	}

}
