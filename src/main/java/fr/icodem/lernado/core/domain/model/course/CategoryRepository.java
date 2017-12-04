package fr.icodem.lernado.core.domain.model.course;

public interface CategoryRepository {
    /**
     * Finds all categories
     * @return The categories
     */
    Course findAll();

    /**
     * Saves given category
     * @param category category to save
     */
    void store(Category category);

    /**
     * @return A unique, generated category ID
     */
    CategoryId nextCategoryId();
}
