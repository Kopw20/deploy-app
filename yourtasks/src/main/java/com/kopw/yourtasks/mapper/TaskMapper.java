package com.kopw.yourtasks.mapper;

import com.kopw.yourtasks.dto.TaskDto;
import com.kopw.yourtasks.dto.request.TaskCreateReq;
import com.kopw.yourtasks.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {
    TaskDto toTaskDto(TaskEntity task);
    TaskEntity toTaskEntity(TaskCreateReq taskCreateReq);
}
