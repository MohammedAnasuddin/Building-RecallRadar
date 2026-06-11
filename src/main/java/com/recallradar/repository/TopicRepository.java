package com.recallradar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recallradar.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,Long>{
    
}
