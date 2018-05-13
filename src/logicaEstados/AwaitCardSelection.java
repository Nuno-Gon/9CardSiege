package logicaEstados;
import logicaJogo.*;

public class AwaitCardSelection extends StateAdapter {
	
	public AwaitCardSelection(GameData gameData) {
        super(gameData);
    }
	
	@Override
	public IStates ResolveCard() {
		gameData.getCardsList().get(0);
		
	}
}
