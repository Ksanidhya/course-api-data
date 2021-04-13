package Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;


    public List<Course> getAllCourses(String topicId) {
        List<Course> courses =new ArrayList<>();
        courseRepo.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        Optional op = courseRepo.findById(id);
        System.out.println(op);
        return  new Course();
        //return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addCourse(Course course) {
        courseRepo.save(course);
        // topics.add(topic);


    }

    public void updateCourse(String id, Course course) {
        courseRepo.save(course);
      /*  for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        } */
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);
        //topics.removeIf(t -> t.getId().equals(id));
    }
    }