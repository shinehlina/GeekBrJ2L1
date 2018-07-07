package Competitors;

public class Team {
    String name;

    public String getName() {
        return name;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    Competitor[] competitors;

    public Team(String name, Competitor competitor1, Competitor competitor2, Competitor competitor3, Competitor competitor4){
        this.competitors = new Competitor[]{competitor1, competitor2, competitor3, competitor4};
        this.name = name;
    }

    public void memberInfo(){

    }

    public void showResults​(){
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
