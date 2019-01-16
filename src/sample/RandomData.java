package sample;

import java.util.Random;

public class RandomData {

    public static String randomString(){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }

    public static int randomNumber(int min, int max){
        Random rnd = new Random(System.currentTimeMillis());
        return min + rnd.nextInt(max - min - 1);
    }
}
