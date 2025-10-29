package strategy;

import model.Photo;

public class SortByRating implements IPhotoSortStrategy {
    @Override
    public void sort(Photo photo1, Photo photo2) {
        System.out.println("Sorting photos by rating: "
                + photo1.getRating() + " and " + photo2.getRating());
    }
}
