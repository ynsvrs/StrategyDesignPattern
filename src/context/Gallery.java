package context;
import model.Photo;
import strategy.SortingStrategy;

public class Gallery {
    private SortingStrategy sortingStrategy;

    public Gallery(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sortPhotos(Photo photo1, Photo photo2) {
        sortingStrategy.sort(photo1, photo2);
    }
}

