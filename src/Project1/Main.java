package Project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Next step would be to move data part into seperate class
        HashMap<String, Integer> data = new HashMap<String, Integer>();


            data.put("Drake", 24);
            data.put("NF",89);
            data.put("UFC", 15);





        System.out.println(getEntry(data));
        System.out.println(getEntry(data));

    }

    public static HashMap<String, Integer> getEntry(HashMap<String, Integer>data){
        ArrayList<String> keysAsArray = new ArrayList<String>(data.keySet());
        Random r = new Random();
        int rand = r.nextInt(keysAsArray.size());
        String name = keysAsArray.get(rand);
        int followerCount = data.get(keysAsArray.get(rand));
        HashMap<String, Integer> entry = new HashMap<String, Integer>();

        entry.put(name, followerCount);

        return entry;

    }


}
