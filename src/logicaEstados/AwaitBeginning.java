package logicaEstados;

import logicaJogo.*;

public class AwaitBeginning extends StateAdapter  {

	public AwaitBeginning(GameData gameData){
	      super(gameData);
	}
	
	@Override
	public IStates start(){
	    gameData.baralhaCartas();
	    gameData.lCheck(gameData.getTunnel());
	    return new AwaitCardSelect(dataGame);
	}
	
	@Override
	public IStates lineCheck(int tunnel){
		gameData.setTunnel(tunnel);
		return this;
	}
}