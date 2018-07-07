package Obstacle;

import Competitors.*;

public class Course {
    Obstacle obstacles[];
    public Course(Obstacle ... obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Competitor competitors[] = team.getCompetitors();
        for (Obstacle o: obstacles){
            for(Competitor competitor: competitors){
                o.doIt(competitor);
            }
        }
    }
}
