package com.kopw.yourtasks.service;

import com.kopw.yourtasks.dto.TaskDto;
import com.kopw.yourtasks.dto.request.TaskCreateReq;
import com.kopw.yourtasks.dto.request.UpdateTaskReq;

import java.util.List;

public interface TaskService {
    List<TaskDto> getTasks();
    TaskDto getTaskById(Long id);
    TaskDto createTask(TaskCreateReq request);
    TaskDto updateTask(Long id, UpdateTaskReq request);
    TaskDto deleteTask(Long id);
}
