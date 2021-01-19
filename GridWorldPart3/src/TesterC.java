import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class TesterC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ActorWorld world = new ActorWorld();
	        world.add(new Location (0,0), new Jumper());
	        world.show();

	}

}
