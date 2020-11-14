import java.util.*;

public class SelectingTargetStrategy implements PhaseStrategy {

    private Grid grid; 
    private ArrayList<Actor> actors; 
    private List<Cell> cellOverlay; 
    private List<MenuItem> menuOverlay; 
    private List<MenuItem> subMenuOverlay; 
    private Optional<Actor> actorInAction;  
    private int x; 
    private int y; 

    public SelectingTargetStrategy(Grid grid, ArrayList<Actor> actors, List<Cell> cellOverlay, List<MenuItem> menuOverlay, List<MenuItem> subMenuOverlay, Optional<Actor> actorInAction, int x, int y){
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

        /*
        for(Cell c: cellOverlay){
            if (c.contains(x, y)){
                Optional<Actor> oa = actorAt(c);
                    if (oa.isPresent()){
                        oa.get().makeRedder(0.1f);
                    }
                }
            }
            cellOverlay = new ArrayList<Cell>();

            //changes Strategy to ChoosingActorStrategy 
        
        */
        
    }
  }