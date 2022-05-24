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
        System.out.println(ServerNameGenerator.randomElement(adjectives));
        System.out.println(ServerNameGenerator.randomElement(nouns));
    }
}
