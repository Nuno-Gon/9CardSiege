package logicaEstados;

public interface IStates {

/***** AwaitBeginning  *****/  
    
    IStates start();
    
/***** EnemyLineCheck *****/
    IStates lineCheck(boolean i, boolean u);
    IStates advance();
    
/***** CardSelection *****/
    IStates resolveCard();
    
/****** EventPhase *******/
    IStates eventPhase();
    
/****** EnemyMovement *****/
    IStates enemyMovementPhase();
}
