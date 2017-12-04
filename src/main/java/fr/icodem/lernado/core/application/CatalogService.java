package fr.icodem.lernado.core.application;

import fr.icodem.lernado.core.domain.model.course.Category;
import fr.icodem.lernado.core.domain.model.course.Course;
import fr.icodem.lernado.core.domain.model.course.CourseId;

import java.util.List;

public interface CatalogService {
    Course findCourseById(CourseId id);

    List<Course>  searchCourses(String query);

    List<Category> loadCategories();
}
