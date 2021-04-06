import java.util.ArrayList;
import java.util.Scanner;

public class Player1 extends Player {
	private ArrayList<Item> arrItem = new ArrayList<>();
	private String job = "Penambang";
    private Scanner sc = new Scanner(System.in);

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Player1() {
        arrItem = new ArrayList<>();
    }

    public void printPlayer() {
        System.out.println("Nama Player:"+nama);
        System.out.println("Kesehatan Player:"+kesehatan);
        System.out.println("Job Player:"+job);
    }
}