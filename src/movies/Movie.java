package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String setName, String setCategory){
        name = setName;
        category = setCategory;
    }
    public String getMovie(){
        return name;
    }

    public String getCategory(){
        return category;
    }

}
