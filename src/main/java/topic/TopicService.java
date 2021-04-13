package topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    TopicRepo topicRepo;

    private  List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Java", "Java Description"),
            new Topic("JavaScript", "JavaScript", "JavaScript Description")
    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics=new ArrayList<>();
        topicRepo.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        Optional op =topicRepo.findById(id);
        System.out.println(op);
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicRepo.save(topic);
        // topics.add(topic);


    }

    public void updateTopic(String id, Topic topic) {
        topicRepo.save(topic);
      /*  for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        } */
    }

    public void deleteTopic(String id) {
        topicRepo.deleteById(id);
        //topics.removeIf(t -> t.getId().equals(id));
    }
    }