package nineCardSiege;

import logicaJogo.*;
import iu.grafico.*;
import iu.grafico.gui.NineCardSiegeView;
public class MainNineCardSiege {

	public static void main(String[] args) {
		//TextUserInterface ui = new TextUserInterface(new Game());
		//ui.run();
		
		NineCardSiegeView GUI = new NineCardSiegeView(new ObservableGame());
	}
}
