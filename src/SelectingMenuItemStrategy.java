import java.util.*;

public class SelectingMenuItemStrategy implements PhaseStrategy {

    private Grid grid; 
    private ArrayList<Actor> actors; 
    private List<Cell> cellOverlay; 
    private List<MenuItem> menuOverlay; 
    private List<MenuItem> subMenuOverlay; 
    private Optional<Actor> actorInAction;  
    private int x; 
    private int y; 

    public SelectingMenuItemStrategy(Grid grid, ArrayList<Actor> actors, List<Cell> cellOverlay, List<MenuItem> menuOverlay, List<MenuItem> subMenuOverlay, Optional<Actor> actorInAction, int x, int y){
        this.grid = grid;
        this.actors = actors; 
        this.cellOverlay = cellOverlay;
        this.menuOverlay = menuOverlay;
        this.subMenuOverlay = subMenuOverlay;
        this.actorInAction = actorInAction;  
        this.x = x;
        this.y = y; 
    }

    @Override
    public  void toDo(Grid grid,
    ArrayList<Actor> actors,
    List<Cell> cellOverlay,
    List<MenuItem> menuOverlay,
    List<MenuItem> subMenuOverlay,
    Optional<Actor> actorInAction,  
    int x, int y) {
    
        for(MenuItem mi : menuOverlay){
            if (mi.contains(x,y)){
                mi.action.run();
                menuOverlay = new ArrayList<MenuItem>();
            }
        }           
    }
}