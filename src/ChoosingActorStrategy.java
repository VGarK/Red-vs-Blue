import java.util.*;

public class ChoosingActorStrategy implements PhaseStrategy {


    private Grid grid; 
    private ArrayList<Actor> actors; 
    private List<Cell> cellOverlay; 
    private List<MenuItem> menuOverlay; 
    private List<MenuItem> subMenuOverlay; 
    private Optional<Actor> actorInAction;  
    private int x; 
    private int y; 

    public ChoosingActorStrategy(Grid grid, ArrayList<Actor> actors, List<Cell> cellOverlay, List<MenuItem> menuOverlay, List<MenuItem> subMenuOverlay, Optional<Actor> actorInAction, int x, int y){
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
        actorInAction = Optional.empty();
        for (Actor a : actors) {
            if (a.loc.contains(x, y) && a.isTeamRed() && a.turns > 0) {
                cellOverlay = grid.getRadius(a.loc, a.moves, true);
                actorInAction = Optional.of(a);
                strategy = setPhaseStrategy();
                
                //changes Strategy to SelectingNewLocationStrategy
            }
        }
        if(!actorInAction.isPresent()){

            //changes Strategy to SelectingMenuItemStrategy

            menuOverlay.add(new MenuItem("Oops", x, y, () -> changes Strategy to ChoosingActorStrategy));
            menuOverlay.add(new MenuItem("End Turn", x, y+MenuItem.height, () -> changes Strategy to CPUMovingStrategy));
            menuOverlay.add(new MenuItem("End Game", x, y+MenuItem.height*2, () -> System.exit(0)));
        */
        
    }
  }