import java.util.Scanner;
class Player {
    int pid;
    String pname;
    int totalRuns;
    int inningsPlayed;
    int notOutTimes;

    public double average() {
        return inningsPlayed > 0 ? (double) totalRuns / inningsPlayed : 0;
    }
}

public class players  {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = scanner.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            players[i] = new Player();
            System.out.print("Enter player ID: ");
            players[i].pid = scanner.nextInt();
            System.out.print("Enter player name: ");
            players[i].pname = scanner.next();
            System.out.print("Enter total runs: ");
            players[i].totalRuns = scanner.nextInt();
            System.out.print("Enter innings played: ");
            players[i].inningsPlayed = scanner.nextInt();
            System.out.print("Enter not out times: ");
            players[i].notOutTimes = scanner.nextInt();
        }

        Player maxAvgPlayer = players[0];
        for (Player player : players) {
            if (player.average() > maxAvgPlayer.average()) {
                maxAvgPlayer = player;
            }
        }

        System.out.println("Player with maximum average:");
        System.out.println("ID: " + maxAvgPlayer.pid);
        System.out.println("Name: " + maxAvgPlayer.pname);
        System.out.println("Average: " + maxAvgPlayer.average());
    }
}




