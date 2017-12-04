package fr.icodem.lernado.core.domain.model.course;

public class CourseId {
    private String id;

    private CourseId(String id) {
        this.id = id;
    }

    public static CourseId createCourseId(String id) {
        return new CourseId(id);
    }

    public String getId() {
        return id;
    }
}
