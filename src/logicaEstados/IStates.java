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
    IStates supplyRaid();
    IStates sabotage();
    IStates additionalActionPoint();
    IStates nextState();
    
/****** Archers Attack / Boilling Water / Close Combat *****/
    IStates ladder();
    IStates ram();
    IStates tower();
    IStates cancel();
    
/****** Rally Troops *******/
    IStates normalRally();
    IStates suppliesRally();
    
/****** Tunnel Movement ******/
    IStates enterTunnelFree();
    IStates enterTunnelFast();
    IStates moveTunnelFreeCastle();
    IStates moveTunnelFastCastle();
    IStates moveTunnelFreeEnemyLine();
    IStates moveTunnelFastEnemyLine();
    
    
    
/****** WinOrLossCheck *****/
    IStates winOrLossCheck(boolean wl);
    
/****** EndOfDay *****/
    IStates endOfDay();
}
