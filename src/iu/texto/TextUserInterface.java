package iu.texto;

import java.util.*;
import logicaJogo.*;

public class TextUserInterface {

	private final Game g;
	Scanner sc;
	
	public TextUserInterface(Game game)
    {
        g = game; 
        sc = new Scanner(System.in);
    }
	
	public void run(){
		System.out.println("Running");
	}
}
