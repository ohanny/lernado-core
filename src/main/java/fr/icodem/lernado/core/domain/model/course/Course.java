package fr.icodem.lernado.core.domain.model.course;

public class Course {
    private CourseId id;
    private String title;

    private Course(CourseId id, String title) {
        this.id = id;
        this.title = title;
    }

    public static Course createCourse(CourseId id, String title) {
        return new Course(id, title);
    }

    public CourseId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
