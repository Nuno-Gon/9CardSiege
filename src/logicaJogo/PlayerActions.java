package logicaJogo;

import java.io.Serializable;

abstract class PlayerActions implements Serializable {
	
	public String apName;
	abstract public void action(GameData gameData);
	
}
