package com.recallradar.service;

import org.springframework.stereotype.Service;

import com.recallradar.dto.TopicResponseDTO;
import com.recallradar.dto.CreateTopicRequestDTO;

import java.util.ArrayList;
import java.util.List;
@Service
public class TopicService{
    // Temp DB 
    private final List<TopicResponseDTO> topics = new ArrayList<>(); 

    private long currentId = 1L;

    //Function to create a topic using request
    public TopicResponseDTO createTopic(CreateTopicRequestDTO requestDTO){
        TopicResponseDTO responseDTO = new TopicResponseDTO();
        
        responseDTO.setId(currentId);
        responseDTO.setName( requestDTO.getName());
        responseDTO.setDifficulty(requestDTO.getDifficulty());

        topics.add(responseDTO);

        return responseDTO;
    }

    public List<TopicResponseDTO> getAllTopics(){
        return topics;
    }

}