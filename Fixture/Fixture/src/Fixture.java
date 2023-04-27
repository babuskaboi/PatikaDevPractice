
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fixture {
    private List<Team> t_played;
    private List<Team> teams;
    private List<String> fRounds, sRounds;
    private static int sc = 1;
    int team_count;

    public Fixture(List<Team> teams) {
        this.teams = teams;
        fRounds = new ArrayList<>();
        sRounds = new ArrayList<>();
        t_played = new ArrayList<>();
        team_count=teams.size();
    }

    public void generate() {
        Random random = new Random();
        int half = (teams.size() * (teams.size() - 1)) / 2;
        int counter = 0;
        if (teams.size() % 2 == 0) {
            while (counter < half) {
                Team home = teams.get(random.nextInt(teams.size()));
                Team away = teams.get(random.nextInt(teams.size()));
                
                
                

                if (home != away && !fRounds.contains(home.getName() + " - " + away.getName())&& !fRounds.contains(away.getName() + " - " + home.getName())) {
                    fRounds.add(home.getName() + " - " + away.getName());
                    sRounds.add(away.getName() + " - " + home.getName());
                    counter++;
                    teams.remove(home);
                    teams.remove(away);
                    
                    t_played.add(home);
                    t_played.add(away);
                    
                    
    
                    
    
                    if (teams.isEmpty()) {
                        teams.addAll(t_played);
                        t_played.clear();
    
                    }
                    
                }

            }
        } else {

            teams.add(new Team(0, "BAY"));

            while (counter < half) {
                Team home = teams.get(random.nextInt(teams.size()));
                Team away = teams.get(random.nextInt(teams.size()));

                if (home != away && !fRounds.contains(home.getName() + " - " + away.getName()) && away.getId() != 0
                        && home.getId() != 0) {
                    fRounds.add(home.getName() + " - " + away.getName());
                    sRounds.add(away.getName() + " - " + home.getName());
                    counter++;

                    teams.remove(home);
                    teams.remove(away);
                    
                    t_played.add(home);
                    t_played.add(away);
                    
                    
    
                    
    
                    if (teams.isEmpty()) {
                        teams.addAll(t_played);
                        t_played.clear();
    
                    }
                }

            }
        }
        display(fRounds);
        display(sRounds);

    }

    public void display(List<String> rounds) {

        for (int i = 0; i < rounds.size(); i++) {
            if (i % (team_count/2) == 0) {
                System.out.println("\n " + sc + ". Round: ");
                sc++;
            }

            System.out.println(rounds.get(i));

        }
    }
}