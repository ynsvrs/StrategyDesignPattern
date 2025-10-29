package context;

import model.Photo;
import strategy.IPhotoSortStrategy;

public class Gallery {
    private IPhotoSortStrategy sortingStrategy;

    public Gallery(IPhotoSortStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(IPhotoSortStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sortPhotos(Photo photo1, Photo photo2) {
        sortingStrategy.sort(photo1, photo2);
    }
}
