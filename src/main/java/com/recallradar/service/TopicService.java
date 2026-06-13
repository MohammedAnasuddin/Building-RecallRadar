package com.recallradar.service;

import org.springframework.stereotype.Service;

import com.recallradar.dto.TopicResponseDTO;
import com.recallradar.dto.updateTopicDescriptionRequestDTO;
import com.recallradar.entity.Topic;
import com.recallradar.repository.TopicRepository;
import com.recallradar.dto.CreateTopicRequestDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    // Temp DB
    private final TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    // Function to create a topic using request
    public TopicResponseDTO createTopic(CreateTopicRequestDTO requestDTO) {
        Topic current_topic = new Topic();

        // Getting Details from requestDTO
        current_topic.setName(requestDTO.getName());
        current_topic.setDifficulty(requestDTO.getDifficulty());
        current_topic.setDescription(requestDTO.getDescription());

        // Saving to DB
        Topic savedTopic = topicRepository.save(current_topic);

        // Creating the Response DTO
        TopicResponseDTO responseDTO = new TopicResponseDTO();
        responseDTO.setId(savedTopic.getId());
        responseDTO.setName(savedTopic.getName());
        responseDTO.setDifficulty(savedTopic.getDifficulty());
        responseDTO.setDescription(savedTopic.getDescription());

        // topics.add(responseDTO);

        return responseDTO;
    }

    public List<TopicResponseDTO> getTopics() {
        List<Topic> all_topics = topicRepository.findAll();
        if (all_topics.isEmpty()) {
            throw new RuntimeException("No Topics Found");
        }
        List<TopicResponseDTO> all_topics_response_dtos = new ArrayList<>();

        for (Topic current_topic : all_topics) {

            TopicResponseDTO current_topic_response_DTO = new TopicResponseDTO();

            current_topic_response_DTO.setId(current_topic.getId());
            current_topic_response_DTO.setName(current_topic.getName());
            current_topic_response_DTO.setDifficulty(current_topic.getDifficulty());
            current_topic_response_DTO.setDescription(current_topic.getDescription());

            all_topics_response_dtos.add(current_topic_response_DTO);
        }

        return all_topics_response_dtos;

    }

    public TopicResponseDTO getTopicById(Long id) {
        Optional<Topic> current_topic = topicRepository.findById(id);
        if (current_topic.isEmpty()) {
            throw new RuntimeException("Topic Not Found for the provided Id");
        }

        Topic result_current_topic = current_topic.get();
        TopicResponseDTO current_topic_response_DTO = new TopicResponseDTO();
        current_topic_response_DTO.setId(result_current_topic.getId());
        current_topic_response_DTO.setName(result_current_topic.getName());
        current_topic_response_DTO.setDifficulty(result_current_topic.getDifficulty());
        current_topic_response_DTO.setDescription(result_current_topic.getDescription());

        return current_topic_response_DTO;
    }

    public TopicResponseDTO deleteTopic(Long id) {
        Optional<Topic> current_topic = topicRepository.findById(id);
        if (current_topic.isEmpty()) {
            throw new RuntimeException("No topic found associated with Id:" + id);
        }

        Topic result_current_topic = current_topic.get();
        topicRepository.delete(result_current_topic);

        TopicResponseDTO deleted_topic_dto = new TopicResponseDTO();
        deleted_topic_dto.setId(result_current_topic.getId());
        deleted_topic_dto.setName(result_current_topic.getName());
        deleted_topic_dto.setDifficulty(result_current_topic.getDifficulty());
        deleted_topic_dto.setDescription(result_current_topic.getDescription());

        return deleted_topic_dto;
    }


    public TopicResponseDTO updateTopicDescription(updateTopicDescriptionRequestDTO requestDTO){
        Optional<Topic> topicOptional = topicRepository.findById(requestDTO.getId());

        if(topicOptional.isEmpty()){
            throw new RuntimeException("Topic doesn't exist to update the description");
        }

        Topic topic = topicOptional.get();
        topic.setDescription(requestDTO.getDescription());
        Topic updatedTopic = topicRepository.save(topic);

        TopicResponseDTO responseDTO = new TopicResponseDTO();
        responseDTO.setId(updatedTopic.getId());
        responseDTO.setName(updatedTopic.getName());
        responseDTO.setDifficulty(updatedTopic.getDifficulty());
        responseDTO.setDescription(updatedTopic.getDescription());

        return responseDTO;

    }

    

}