package com.kopw.yourtasks.controller;

import com.kopw.yourtasks.dto.TaskDto;
import com.kopw.yourtasks.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.kopw.yourtasks.util.ApiEndpoint.BASE_ENDPOINT;

@AllArgsConstructor
@Controller
@RequestMapping(BASE_ENDPOINT)
public class HomeController {
    private final TaskService taskService;

    @GetMapping
    public String goHome(Model model) {
        List<TaskDto> tasks = taskService.getTasks();
        if(tasks.isEmpty()) {
            tasks.add(TaskDto.builder().title("A").description("Test DOP").build());
        }
        model.addAttribute("tasks", tasks);
        return "page/home";
    }
}
