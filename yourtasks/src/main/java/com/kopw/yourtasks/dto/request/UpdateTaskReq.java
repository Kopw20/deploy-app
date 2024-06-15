package com.kopw.yourtasks.dto.request;

import com.kopw.yourtasks.util.Status;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UpdateTaskReq {
    private String description;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private Status status;
}
