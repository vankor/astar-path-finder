package jpathFinder.heuristics;

import java.awt.Point;


/**
 * A heuristic that uses the tile that is closest to the target
 * as the next best tile.
 */
public class ClosestHeuristic implements Heuristic {

	public float getEstimatedDistanceToGoal(Point start, Point goal) {		
		float dx = goal.x - start.x;
		float dy = goal.y - start.y;
		
		float result = (float) (Math.sqrt((dx*dx)+(dy*dy)));
		
		return result;
	}

}
