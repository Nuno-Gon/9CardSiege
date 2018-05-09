package logicaJogo;
import java.io.Serializable;

public class E_GuardsDistracted extends Events implements Serializable {
	
	public E_GuardsDistracted() {
		this.actionPoints = 2;
		this.evName = "Guards Distracted";
		this.event = "+1 to sabotage action \n+1 to morale action";
		this.enemyAdOrder = new int[1];
		this.enemyAdOrder[0] = 4;
	}

}
