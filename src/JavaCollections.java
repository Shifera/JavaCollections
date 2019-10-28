import java.util.Collections;
import java.util.ArrayList;

public class JavaCollections {
    public static void main (String[]args) {
        ArrayList<Double> temperatureList = new ArrayList<Double>();
        temperatureList.add(40.5);
        temperatureList.remove(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);
        for (Double temp: temperatureList) {
            System.out.println(temperatureList);
        }
    }
}
