package strategy;

import model.Photo;

public interface IPhotoSortStrategy {
    String sort(Photo photo1, Photo photo2);
}
