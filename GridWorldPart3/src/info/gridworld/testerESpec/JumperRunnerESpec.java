package info.gridworld.testerESpec;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

import java.awt.Color;

import info.gridworld.actor.*;

public class JumperRunnerESpec {
	 public static void main(String[] args)
	    {
	        ActorWorld world = new ActorWorld();
	        
	        Jumper buggy = new Jumper();
	        world.add(buggy);
	        buggy.setDirection(0);
	        buggy.moveTo( new Location (5,5));
	        
	        
	        Jumper buggy2 = new Jumper();
	        buggy2.setColor(Color.GREEN);
	        world.add(buggy2);
	        buggy2.setDirection(0);
	        buggy2.moveTo( new Location (4,5));
	        
	        world.show();
	    }

}
