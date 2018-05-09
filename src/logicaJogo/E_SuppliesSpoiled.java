package logicaJogo;
import java.io.Serializable;

public class E_SuppliesSpoiled extends Events implements Serializable {
	
	public E_SuppliesSpoiled() {
		this.actionPoints = 2;
		this.evName = "Supplies Spoiled";
		this.event = "Reduces supplies by 1";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 1;
	}

	@Override
	public void action(GameData gameData) {
		gameData.setRight_supplies_minus(1);
	}
}
