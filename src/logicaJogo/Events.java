package logicaJogo;

import java.io.Serializable;

abstract class Events implements Serializable {
	public int actionPoints;
	public String evName;
	public String event;
	public int[] enemyAdOrder; // 0 - t 
	abstract public void action(GameData gameData);
}
