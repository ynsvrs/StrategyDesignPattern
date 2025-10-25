package strategy;
import model.Photo;

public class SortByDate implements SortingStrategy {
    @Override
    public void sort(Photo photo1, Photo photo2) {
        System.out.println("Sorting photos by date: "
                + photo1.getDate() + " and " + photo2.getDate());
    }
}

