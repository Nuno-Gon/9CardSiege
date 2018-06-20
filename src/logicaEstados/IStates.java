package logicaEstados;

public interface IStates {

/***** AwaitBeginning  *****/  
    
    IStates lineCheck();
    IStates resolveCard();
    IStates eventPhase();
    IStates enemyMovement();
    
/****** PlayerActions *****/
    //IStates playerActions(int escolha, int alvo);
    IStates checkAbilityPoints(int turn);
    IStates skipCard(int turn);
    IStates archersAttack();
    IStates boillingWater();
    IStates closeCombat();
    IStates coupure();
    IStates rallyTroops();
    IStates tunnelMovement();
    IStates nextState();
    
/****** Archers Attack / Boilling Water / Close Combat *****/
    IStates ladder();
    IStates ram();
    IStates tower();
    IStates cancel();
    
/****** Rally Troops *******/
    
    
/****** WinOrLossCheck *****/
    IStates winOrLossCheck(boolean wl);
    
/****** EndOfDay *****/
    IStates endOfDay();
}
