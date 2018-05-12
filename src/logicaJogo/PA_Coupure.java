package logicaJogo;
import java.io.Serializable;

public class PA_Coupure extends PlayerActions implements Serializable {
	
	public PA_Coupure() {
		this.apName = "Coupure";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getLeft_wall() != 4) {
			gameData.setDice(gameData.RollDice());
			if(gameData.getDice() >=5) {
				gameData.setLeft_wall_plus(1);
			}
		}
	}

}
