import java.util.*;

public class PhaseContext {
    private PhaseStrategy strategy;
    
    public PhaseContext(PhaseStrategy strategy){
        this.strategy = strategy;
    }
    //this can be set at runtime by the application preferences
    public void setPhaseStrategy(PhaseStrategy strategy) {
      this.strategy = strategy;
    }
    
    //use the strategy
    public void executePhase(Grid grid,
    ArrayList<Actor> actors,
    List<Cell> cellOverlay,
    List<MenuItem> menuOverlay,
    List<MenuItem> subMenuOverlay,
    Optional<Actor> actorInAction,  
    int x, int y) {
        strategy.toDo(grid, actors, cellOverlay, menuOverlay, subMenuOverlay, actorInAction, x, y);
    }
 }

  