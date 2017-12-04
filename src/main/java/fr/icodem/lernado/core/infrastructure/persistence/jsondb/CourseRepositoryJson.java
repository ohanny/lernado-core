package fr.icodem.lernado.core.infrastructure.persistence.jsondb;

import fr.icodem.lernado.core.domain.model.course.Course;
import fr.icodem.lernado.core.domain.model.course.CourseId;
import fr.icodem.lernado.core.domain.model.course.CourseRepository;

import java.util.List;

public class CourseRepositoryJson implements CourseRepository {
    @Override
    public List<Course> findByQuery(String query) {
        return null;
    }

    @Override
    public Course findById(CourseId id) {
        return null;
    }

    @Override
    public void store(Course course) {

    }

    @Override
    public CourseId nextCourseId() {
        return null;
    }
}
