import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives = {"assistance", "artisan", "currency", "theory", "advertising", "guitar", "ambition", "shopping", "manager", "movie"};
    static String[] nouns = {"exciting", "quirky", "poor", "adjoining", "hospitable", "nice", "superb", "draconian", "gamy", "selective"};
    public static String randomElement(String[] random){
        Random generator = new Random();
        int randomIndex = generator.nextInt(random.length);
        return random[randomIndex];
    }
    public static void main(String[] args) {
        String randomAdj = ServerNameGenerator.randomElement(adjectives);
        String randomNoun = ServerNameGenerator.randomElement(nouns);
        System.out.printf("Here is your server name:\n%s-%s", randomAdj, randomNoun);
    }
}
