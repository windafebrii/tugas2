import com.enigma.model.Mobil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input coordinate x,y :");
        String coordinate = reader.readLine();
        String [] posts = coordinate.split(",");

        Mobil rush = new Mobil(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]));

        System.out.print("Input Bensin : ");
        String fuel = reader.readLine();
        rush.getFuel(Integer.parseInt(fuel));

        System.out.print("Input Arah : ");
        rush.setCommands(reader.readLine());
        rush.run();

        System.out.println(rush.print());
    }
}