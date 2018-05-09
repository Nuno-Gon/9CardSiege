package nineCardSiege;

import logicaJogo.*;
import iu.texto.*;

public class MainNineCardSiege {

	public static void main(String[] args) {
		TextUserInterface ui = new TextUserInterface(new Game());
		ui.run();
	}
}
