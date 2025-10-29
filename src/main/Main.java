package main;

import model.Photo;
import context.Gallery;
import strategy.SortByDate;
import strategy.SortByRating;

public class Main {
    public static void main(String[] args) {
        Photo p1 = new Photo("in AITU with my friends", "2025-06-05", 4.7);
        Photo p2 = new Photo("at the beach with my family", "2023-12-11", 4.9);

        Gallery gallery = new Gallery(new SortByDate());
        String result1 = gallery.sortPhotos(p1, p2);
        System.out.println(result1);

        gallery.setSortingStrategy(new SortByRating());
        String result2 = gallery.sortPhotos(p1, p2);
        System.out.println(result2);
    }
}
