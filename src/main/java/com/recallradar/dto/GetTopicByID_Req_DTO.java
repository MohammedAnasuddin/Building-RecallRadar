package com.recallradar.dto;

import jakarta.validation.constraints.NotBlank;

public class GetTopicByID_Req_DTO {
    @NotBlank(message = "ID is required")
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long new_id) {
        this.id = new_id;
    }

}
