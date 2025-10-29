package model;

public class Photo {
    private String name;
    private String date;
    private double rating;

    public Photo(String name, String date, double rating) {
        this.name = name;
        this.date = date;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}


