package logicaJogo;

import java.io.Serializable;

public abstract class Events implements Serializable {
	public int actionPoints;
	public String evName;
	public String event;
	public int[] enemyAdOrder; // 0 - nenhum , 1 - ladder , 2 - ram , 3 - tower , 4 slower
	abstract public void action(GameData gameData);
}
