package strategy;

import model.Photo;

public class SortByDate implements IPhotoSortStrategy {
    @Override
    public String sort(Photo photo1, Photo photo2) {
        if (photo1.getDate().compareTo(photo2.getDate()) < 0) {
            return "Sorted photos by date: " + photo1.getDate() + ", " + photo2.getDate();
        } else {
            return "Sorted photos by date: " + photo2.getDate() + ", " + photo1.getDate();
        }
    }
}
