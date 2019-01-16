package University;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KarmaCount {

    public static int getKarma(){
        List<Integer> karma = new ArrayList<>();
        karma.add(0);
        karma.add(-10);
        karma.add(10);
        karma.add(15);
        karma.add(25);
        Random generator = new Random();
        int randomIndex = generator.nextInt(karma.size());
        return karma.get(randomIndex);
    }

}
