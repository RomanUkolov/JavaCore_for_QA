package Lesson1;

public class Team {
   private String teamName;
   private  IPlayers[] teamPlayers = new Players[4];

   public Team(String teamName) {
      this.teamName = teamName;
      teamPlayers[0] = new Athlete1("Max", 5.0, 3.0, 1.2);
      teamPlayers[1] = new Athlete2("John", 3.0, 6.0, 2.1);
      teamPlayers[2] = new Athlete3("Will", 1.5, 1.0, 1.6);
      teamPlayers[3] = new Athlete4("Rob", 3.2, 3.0, 3.1);
   }
   void infoAboutPlayers() {
      for (IPlayers p : teamPlayers) {
         System.out.println(p);
      }
   }

   public IPlayers[] getTeamPlayers() {
      return  teamPlayers;
   }

   public void showResults(Course course) {
      Obstacle[] obstacles = course.getObstacle();
      for (Obstacle obs : obstacles) {
         for (IPlayers p : teamPlayers) {
            System.out.println(p.getName() +  obs.getResult(p));
         }
         System.out.println();
      }

   }

   @Override
   public String toString() {
      return "Team: " + teamName;
   }

}
