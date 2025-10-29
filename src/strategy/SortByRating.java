package strategy;

import model.Photo;

public class SortByRating implements IPhotoSortStrategy {
    @Override
    public String sort(Photo photo1, Photo photo2) {
        if (photo1.getRating() > photo2.getRating()) {
            return "Sorted photos by rating: " + photo1.getRating() + ", " + photo2.getRating();
        } else {
            return "Sorted photos by rating: " + photo2.getRating() + ", " + photo1.getRating();
        }
    }
}
