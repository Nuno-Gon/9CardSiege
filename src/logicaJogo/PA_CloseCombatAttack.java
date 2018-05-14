package logicaJogo;
import java.io.Serializable;

public class PA_CloseCombatAttack extends PlayerActions implements Serializable {
	
	public PA_CloseCombatAttack() {
		this.apName = "Close Combat Attack";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getLeft_ladder() == 0) {
			
		}
	}

}
