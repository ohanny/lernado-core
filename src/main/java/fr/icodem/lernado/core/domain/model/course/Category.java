package fr.icodem.lernado.core.domain.model.course;

public class Category {
    private CategoryId id;
    private String name;

    private Category(CategoryId id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Category createCategory(CategoryId id, String name) {
        return new Category(id, name);
    }

    public CategoryId getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
