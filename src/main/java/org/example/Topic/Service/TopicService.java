package org.example.Topic.Service;

import org.example.Topic.Topic;
import org.example.Topic.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
//    @Autowired
    private TopicRepository topicRepository;
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository=topicRepository;
    }

    public List<Topic> allTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public Object topicById(String id){
        return topicRepository.findById(id);
    }

    public void add(Topic topic) {
        topicRepository.save(topic);
    }

    public void update(Topic topic) {
        topicRepository.save(topic);
    }

    public void delete(String id) {
        topicRepository.deleteById(id);
    }
}
