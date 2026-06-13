package com.recallradar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recallradar.dto.CreateTopicRequestDTO;
import com.recallradar.dto.TopicResponseDTO;
import com.recallradar.dto.updateTopicDescriptionRequestDTO;
import com.recallradar.service.TopicService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService param_topicService) {
        this.topicService = param_topicService;
    }

    @PostMapping
    public TopicResponseDTO handle_createTopic(
            @Valid @RequestBody CreateTopicRequestDTO inp_requestDTO) {

        return topicService.createTopic(inp_requestDTO);
    }

    @GetMapping
    public List<TopicResponseDTO> handle_getTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/{given_id}")
    public TopicResponseDTO handle_getTopicByID(@PathVariable Long given_id) {
        return topicService.getTopicById(given_id);
    }

    @DeleteMapping("/{id}")
    public TopicResponseDTO handle_deleteTopic(@PathVariable Long id){
        return topicService.deleteTopic(id);
    }

    @PutMapping("/description")

    public TopicResponseDTO handle_updateTopicDescription(@Valid @RequestBody updateTopicDescriptionRequestDTO requestDTO){
        return topicService.updateTopicDescription(requestDTO);
    }

}