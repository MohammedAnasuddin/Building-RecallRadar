package com.recallradar.service;

import org.springframework.stereotype.Service;

import com.recallradar.dto.TopicResponseDTO;
import com.recallradar.entity.Topic;
import com.recallradar.repository.TopicRepository;
import com.recallradar.dto.CreateTopicRequestDTO;
import com.recallradar.dto.TopicResponseDTO;

import java.util.ArrayList;
import java.util.List;

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

}