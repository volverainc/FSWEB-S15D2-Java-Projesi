package com.workintech.task.main;

import com.workintech.task.challenge.Challenge;
import com.workintech.task.enums.Priority;
import com.workintech.task.enums.Status;
import com.workintech.task.model.Task;
import com.workintech.task.model.TaskData;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Java", "Write", "ann", Priority.LOW, Status.IN_QUEUE);
        Set<Task> annsTasks = new LinkedHashSet<>();
        annsTasks.add(task1);
        Set<Task> bobsTasks = new LinkedHashSet<>();
        Set<Task> carolsTasks = new LinkedHashSet<>();
        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks);


    }
}