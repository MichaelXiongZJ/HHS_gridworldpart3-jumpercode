package info.gridworld.testerFSpec;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.Jumper;

public class JumperRunnerFSpec {

	public static void main(String[] args) {
		
		 ActorWorld world = new ActorWorld();
		 Jumper j = new Jumper();
		 Rock r = new Rock();
		 Flower f = new Flower();
	     world.add(j);
	     world.add(r);
	     world.add(f);
	     j.moveTo(new Location(3,1));
	     r.moveTo(new Location(2,1));
	     f.moveTo(new Location(1,1));
	     
	     world.show();
		
	}

	
}
