package fr.icodem.lernado.core.infrastructure.persistence.jsondb;

import fr.icodem.lernado.core.domain.model.course.Category;
import fr.icodem.lernado.core.domain.model.course.CategoryId;
import fr.icodem.lernado.core.domain.model.course.CategoryRepository;
import fr.icodem.lernado.core.domain.model.course.Course;

public class CategoryRepositoryJson implements CategoryRepository {
    @Override
    public Course findAll() {
        return null;
    }

    @Override
    public void store(Category category) {

    }

    @Override
    public CategoryId nextCategoryId() {
        return null;
    }
}
