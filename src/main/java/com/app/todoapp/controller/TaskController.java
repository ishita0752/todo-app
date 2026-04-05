package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    //for constructor injection
    //it will make sure the task service dependency is getting injected in the class at runtime
    @GetMapping
    public String getTasks(Model model) {
        //generally service layer has all the logic of fetching the data and managing it
        //all the business logic is in service layer
        //controller is just doing the job of intercepting the request
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";//returning thymeleamf template which is basically a htmlpage
        //also this template task should have access to the list of as tasks
        //as we are displaying the tasks into the interface or ui
        //we pass it using model
    }
    @PostMapping
    public String createTasks(@RequestParam String title) {
        taskService.createTask(title);

        return "redirect:/";//redirecting for auto refreshment
    }
    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);

        return "redirect:/";//redirecting for auto refreshment
    }
    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id) {
        taskService.toggleTask(id);

        return "redirect:/";//redirecting for auto refreshment
    }


}

