import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

//What if the jumper is surrounded by rocks that are one block away from it.? 
public class TesterF {

	public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(5, 5), new Jumper());
        world.add(new Location(5, 7), new Rock());
        world.add(new Location(5, 3), new Rock());     
        world.add(new Location(3, 5), new Rock());
        world.add(new Location(7, 5), new Rock());
        
        world.show();

    }	

}
