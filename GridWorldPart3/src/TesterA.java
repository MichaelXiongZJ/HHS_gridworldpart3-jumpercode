import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Jumper;
import info.gridworld.grid.Location;

/*
 * What will a jumper do if the location in front of it is empty, but the location two cells in front contains a flower or a rock?
 * - It will not jump and then turn 90 degrees to the right
 */
public class TesterA 
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(5, 4), new Jumper());
		world.add(new Location(3, 4), new Flower());
		world.show();
	}
}
