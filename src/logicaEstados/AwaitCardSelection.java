package logicaEstados;
import logicaJogo.*;

public class AwaitCardSelection extends StateAdapter {
	
	public AwaitCardSelection(GameData gameData) {
        super(gameData);
    }
	
	@Override
	public IStates resolveCard() {
		gameData.setEvAtual(gameData.getCardsList().get(0).getEvents(gameData.getDay()));
		return new AwaitEventPhase(gameData);
		
		
	}
}
