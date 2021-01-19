import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Jumper;
import info.gridworld.grid.Location;

/*
 * What will a jumper do if the location two cells in front of the jumper is out of the grid?
 * - It will not jump and then turn 90 degrees to the right
 */
public class TesterB 
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(1, 4), new Jumper());
		world.add(new Location(0, 4), new Flower());
		world.show();
	}
}
