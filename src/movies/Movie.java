package movies;

public class Movie {
    private String name;
    private String category;
//    public Movie (String movieName, String movieCategory){
//        this.name = movieName;
//        this.category = movieCategory;
//    }
    public String getName(String name) {
        return this.name = name;
    }
    public String getCategory(String category) {
        return this.category = category;
    }
    public static void main(String[] args) {
        Movie one = new Movie();
    }
}
