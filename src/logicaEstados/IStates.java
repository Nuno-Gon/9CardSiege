package logicaEstados;

public interface IStates {

/***** AwaitBeginning  *****/  
    
    IStates start();
    IStates lineCheck();
    IStates advance();
    IStates resolveCard();
    IStates eventPhase();
    IStates enemyMovement();
    
/****** PlayerActions *****/
    IStates playerActions(int escolha);
    IStates nextState();
    
/****** WinOrLossCheck *****/
    IStates winOrLossCheck(boolean wl);
    
/****** EndOfDay *****/
    IStates endOfDay();
}
