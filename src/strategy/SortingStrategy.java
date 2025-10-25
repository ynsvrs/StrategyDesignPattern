package strategy;
import model.Photo;

public interface SortingStrategy {
    void sort(Photo photo1, Photo photo2);
}
