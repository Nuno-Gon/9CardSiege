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
				gameData.setText("You rolled an " + gameData.getDice() + ", you successfully increased your wall");
				gameData.setChange(true);
			}
		}
		else {
			gameData.setText("You can't increase your wall");
			gameData.setWrongOption(true);;
		}
	}

}
