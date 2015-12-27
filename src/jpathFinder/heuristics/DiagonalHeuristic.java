package jpathFinder.heuristics;

import java.awt.Point;

public class DiagonalHeuristic implements Heuristic {

	public float getEstimatedDistanceToGoal(Point start, Point goal) {		
		
		float h_diagonal = (float) Math.min(Math.abs(start.x-goal.x), Math.abs(start.y-goal.y));
		float h_straight = (float) (Math.abs(start.x-goal.x) + Math.abs(start.y-goal.y));
		float h_result = (float) (Math.sqrt(2) * h_diagonal + (h_straight - 2*h_diagonal));

		float p = (1/10000);
		h_result *= (1.0 + p);
		
		return h_result;
	}

}
