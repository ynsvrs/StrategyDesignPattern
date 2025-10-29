package strategy;

import model.Photo;

public interface IPhotoSortStrategy {
    void sort(Photo photo1, Photo photo2);
}
