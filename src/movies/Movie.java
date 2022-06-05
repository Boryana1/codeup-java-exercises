package movies;

public class Movie {
    private String name;
    private String category;
    public Movie (String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
//    public static void main(String[] args) {
//        Movie one = new Movie();
//    }
}
