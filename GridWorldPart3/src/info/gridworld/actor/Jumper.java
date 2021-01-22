package info.gridworld.actor;


import info.gridworld.grid.*;


public class Jumper extends Actor{
	
	
	public Jumper() {
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
        if (gr.isValid(next)) {
            moveTo(next);
        }
        else {
            removeSelfFromGrid();
        }
	}
	
	public void jump() {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location secNext = next.getAdjacentLocation(getDirection());
        if (gr.isValid(secNext)) {
            moveTo(secNext);
        }
        else {
            removeSelfFromGrid();
        }
	}
	
	public void act() {
		 if (canJump()){
			 jump();
		 }else if(canMove()){
			 move();
		 }else {
	    	 turn();
	     }
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
        return (neighbor == null);// || (neighbor instanceof Flower);
	}
	
	public boolean canJump() {
		
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location secNext = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(secNext))
            return false;
        Actor neighbor = gr.get(secNext);
        return (neighbor == null);// || (neighbor instanceof Flower);
	}
}
