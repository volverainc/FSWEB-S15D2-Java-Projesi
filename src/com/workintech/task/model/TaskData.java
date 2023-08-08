package com.workintech.task.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getTasks(String person) {
        Set<Task> tasks = new HashSet<>();

        if (person.equals("ann")) {
            tasks.addAll(annsTasks);
        } else if (person.equals("bob")) {
            tasks.addAll(bobsTasks);
        } else if (person.equals("carol")) {
            tasks.addAll(carolsTasks);
        } else if (person.equals("all")) {
            tasks.addAll(annsTasks);
            tasks.addAll(bobsTasks);
            tasks.addAll(carolsTasks);
        }

        return tasks;
    }

    public Set<Task> getIntersection(Set<Task> first, Set<Task> second){
        Set<Task> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public Set<Task> getDifference(Set<Task> first, Set<Task> second){
        Set<Task> differences = new HashSet<>(first);
        differences.removeAll(second);
        return differences;
    }

    public Set<Task> getUnion(List<Set<Task>> taskList){
        Set<Task> totals = new HashSet<>();
        for(Set<Task> tasks: taskList){
            totals.addAll(tasks);
        }
        return totals;
    }
}
