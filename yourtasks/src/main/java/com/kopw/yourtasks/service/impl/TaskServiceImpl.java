package com.kopw.yourtasks.service.impl;

import com.kopw.yourtasks.dto.TaskDto;
import com.kopw.yourtasks.dto.request.TaskCreateReq;
import com.kopw.yourtasks.dto.request.UpdateTaskReq;
import com.kopw.yourtasks.entity.TaskEntity;
import com.kopw.yourtasks.mapper.TaskMapper;
import com.kopw.yourtasks.repository.TaskRepository;
import com.kopw.yourtasks.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Override
    public List<TaskDto> getTasks() {
        List<TaskEntity> result = taskRepository.findAll();
        return result.isEmpty() ? null : result.stream().map(taskMapper::toTaskDto).toList();
    }

    @Override
    public TaskDto getTaskById(Long id) {
        return taskMapper.toTaskDto(taskRepository.findById(id).orElse(null));
    }

    @Override
    public TaskDto createTask(TaskCreateReq request) {
        TaskEntity newTask = taskRepository.save(taskMapper.toTaskEntity(request));
        return taskMapper.toTaskDto(newTask);
    }

    @Override
    public TaskDto updateTask(Long id, UpdateTaskReq request) {
        return null;
    }

    @Override
    public TaskDto deleteTask(Long id) {
        return null;
    }
}
