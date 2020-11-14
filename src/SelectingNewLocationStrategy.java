import java.util.*;

public class SelectingNewLocationStrategy implements PhaseStrategy {

    private Grid grid; 
    private ArrayList<Actor> actors; 
    private List<Cell> cellOverlay; 
    private List<MenuItem> menuOverlay; 
    private List<MenuItem> subMenuOverlay; 
    private Optional<Actor> actorInAction;  
    private int x; 
    private int y; 

    public SelectingNewLocationStrategy(Grid grid, ArrayList<Actor> actors, List<Cell> cellOverlay, List<MenuItem> menuOverlay, List<MenuItem> subMenuOverlay, Optional<Actor> actorInAction, int x, int y){
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
        Optional<Cell> clicked = Optional.empty();
            for (Cell c : cellOverlay) {
                if (c.contains(x, y)) {
                    clicked = Optional.of(c);
                }
            }
            if (clicked.isPresent() && actorInAction.isPresent()) {
                cellOverlay = new ArrayList<Cell>();
                actorInAction.get().setLocation(clicked.get());
                actorInAction.get().turns--;
                    
                menuOverlay.add(new MenuItem("Fire", x, y, () -> {
                    cellOverlay = grid.getRadius(actorInAction.get().loc, actorInAction.get().range, false);
                    cellOverlay.remove(actorInAction.get().loc);
                    
                    //changes Strategy to SelectingTargetStrategy                       
                
                }));

                menuOverlay.add(new MenuItem("Done", x, y+MenuItem.height, () -> //changes Strategy to ChoosingActorStrategy  ));
                   
                //changes Strategy to SelectingMenuItemStrategy  
            } 
    
        */
        
    }
  }