package logicaEstados;
import logicaJogo.*;

public class AwaitWinOrLossCheck extends StateAdapter {
	
	public AwaitWinOrLossCheck(GameData gameData) {
		super(gameData);
	}
	
	@Override
	public IStates winOrLossCheck(boolean wl) {
		if(gameData.getLeft_wall()==0 || gameData.getMid_morale()==0 || gameData.getRight_supplies()==0) {
			wl = Boolean.TRUE;
			return this;
		}
		if((gameData.getLeft_ladder() == 0 && gameData.getMid_ram() == 0) || (gameData.getLeft_ladder() == 0 && gameData.getRight_siege() == 0) || (gameData.getMid_ram() == 0 && gameData.getRight_siege() == 0)) {
			wl = Boolean.TRUE;
			return this;
		}
		if()
	}
}
