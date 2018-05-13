package iu.texto;

import logicaEstados.*;
import logicaJogo.Game;
import java.util.*;

public class TextUserInterface {

	private final Game g;
	Scanner sc;
	
	public TextUserInterface(Game game)
    {
        g = game; 
        sc = new Scanner(System.in);
    }
	
	public void run(){
		int x=1;
		while(x==1) {
			if(g.getState() instanceof AwaitBeginning)
				InputAwaitBeginning();
			if(g.getState() instanceof AwaitEnemyLineCheck)
				InputAwaitEnemyLineCheck();
			if(g.getStat() instanceof AwaitCardSelection)
				InputAwaitCardSelection();
		}
	}
	
	public boolean checkLimits(int min,int max,int value)
    {
        return value>min ||  value<max;
    }
	
	public void InputAwaitBeginning() {
		System.out.println(" 1 -> Começar Jogo");
		System.out.println(" 2 -> Carregar Jogo");
		
		int escolhainit = sc.nextInt();
		
		System.out.println();
		
		if(checkLimits(1,2,escolhainit)) {
			if(escolhainit == 1) {
				g.ResolveStart();
			}
		}
	}
	
	public void InputAwaitEnemyLineCheck() {
		boolean i = false;
		boolean u = false;
		g.ResolveLineCheck(i,u);
		if(i == true) {
			System.out.println("Perdeu os seus soldados na Enemy Line");
		}
		else if(u == true) {
			System.out.println("Os seus soldados na Enemy Line conseguiram passar despercebidos");
			}
			else {
				System.out.println("Não tem soldados na Enemy Line");
			}
		g.ResolveAdvance();
	}
	
	public void InputAwaitCardSelection() {
		g.ResolveCard();
	}
}
