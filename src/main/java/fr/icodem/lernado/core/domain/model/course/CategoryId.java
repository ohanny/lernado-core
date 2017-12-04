package fr.icodem.lernado.core.domain.model.course;

public class CategoryId {
    private String id;

    private CategoryId(String id) {
        this.id = id;
    }

    public static CategoryId createCategoryId(String id) {
        return new CategoryId(id);
    }

    public String getId() {
        return id;
    }
}
