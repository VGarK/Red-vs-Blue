import java.util.*;

public interface PhaseStrategy {
   
    void toDo(Grid grid,
    ArrayList<Actor> actors,
    List<Cell> cellOverlay,
    List<MenuItem> menuOverlay,
    List<MenuItem> subMenuOverlay,
    Optional<Actor> actorInAction,  
    int x, int y);
    
    
}