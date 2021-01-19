import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Jumper;
import info.gridworld.grid.Location;

//What will a jumper do if it encounters another jumper in its path? 
public class TesterE {

	public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 5), new Jumper());
        world.add(new Location(2, 5), new Jumper());
        world.show();

    }	

}
