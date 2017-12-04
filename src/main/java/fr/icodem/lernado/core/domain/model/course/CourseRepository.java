package fr.icodem.lernado.core.domain.model.course;

import java.util.List;

public interface CourseRepository {
    /**
     * Finds courses using a query
     * @param query the query
     * @return The courses, or empty list if not found
     */
    List<Course> findByQuery(String query);

    /**
     * Finds a course using course id
     * @param id course id
     * @return The course, or null if not found
     */
    Course findById(CourseId id);

    /**
     * Saves given course
     * @param course course to save
     */
    void store(Course course);

    /**
     * @return A unique, generated course ID
     */
    CourseId nextCourseId();
}
