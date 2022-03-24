package Lesson1;

public class Team {
   private String teamName;
   private  IPlayers[] teamPlayers = new Players[4];

   public Team(String teamName) {
      this.teamName = teamName;
      teamPlayers[0] = new Athlete1("Max", 5, 3, 1);
      teamPlayers[1] = new Athlete2("John", 3, 6, 2);
      teamPlayers[2] = new Athlete3("Will", 1, 1, 1);
      teamPlayers[3] = new Athlete4("Rob", 3, 3, 3);
   }
   void infoAboutPlayers() {
      System.out.println(teamPlayers);
   }
   @Override
   public String toString() {
      return teamName;
   }
}
