package info.gridworld.actor;


import info.gridworld.grid.*;


public class Jumper extends Actor{
	
	
	public Jumper() {
		setColor(Color.RED);
	}
	
	
	public void turn() {
		setDirection(getDirection() + Location.HALF_RIGHT);
	}
	
	
	public void move() {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
	}
	
	
	public void act() {
		 if (canMove())
	            move();
	        else
	            turn();
	}
	
	public boolean canMove() {
		
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
	}
	
	
}
