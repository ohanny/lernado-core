package fr.icodem.lernado.core.application.impl;

import fr.icodem.lernado.core.application.CatalogService;
import fr.icodem.lernado.core.domain.model.course.Category;
import fr.icodem.lernado.core.domain.model.course.Course;
import fr.icodem.lernado.core.domain.model.course.CourseId;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {

    @Override
    public Course findCourseById(CourseId id) {
        return null;
    }

    @Override
    public List<Course> searchCourses(String query) {
        return null;
    }

    @Override
    public List<Category> loadCategories() {
        return null;
    }
}
