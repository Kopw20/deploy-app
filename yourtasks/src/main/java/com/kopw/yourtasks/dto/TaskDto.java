package com.kopw.yourtasks.dto;

import com.kopw.yourtasks.util.Status;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private Status status;
}
