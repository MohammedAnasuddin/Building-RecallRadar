package com.recallradar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recallradar.dto.CreateTopicRequestDTO;
import com.recallradar.dto.TopicResponseDTO;
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
    public List<TopicResponseDTO> handle_fetAllTopics() {
        return topicService.getAllTopics();

    }

}