package Lesson1;

public class Team {
   private String teamName;
   IPlayers[] teamPlayers = new IPlayers[4];

   Team(String teamName, Participant[] teamPlayers) {
       this.teamName = teamName;
       this.teamPlayers = teamPlayers;
   }

   public String getTeamName() {
       return "Team name:" + teamName;
   }

    public Participant[] getTeamPlayers() {
        return teamPlayers;
    }

    public void showResults() {
       for (Participant c : teamPlayers) {
           c.showResult();
       }
    }
}
