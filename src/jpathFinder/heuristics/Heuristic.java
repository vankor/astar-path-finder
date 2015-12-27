package jpathFinder.heuristics;

import java.awt.Point;

public interface Heuristic {

	/**
	 * 
	 * The heuristic tries to guess how far a given Node is from the goal Node.
	 * The lower the cost, the more likely a Node will be searched next.
	 * 
	 * @param map The map on which we try to find the path
	 * @param x The x coordinate of the tile being evaluated
	 * @param y The y coordinate of the tile being evaluated
	 * @param tx The x coordinate of the target location
	 * @param ty The y coordinate of the target location
	 * @return The cost associated with the given tile
	 */
	public float getEstimatedDistanceToGoal(Point start, Point goal);
}
