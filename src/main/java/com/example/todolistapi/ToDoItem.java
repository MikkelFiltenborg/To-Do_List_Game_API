package com.example.todolistapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

enum TypeTask
{
    CLEANING,
    COOKING,
    YARDWORK,
    TELEVISION,
    PLANNING,
    COALMINING
}

enum Priority
{
    HIGH,
    NORMAL,
    LOW
}

@Entity
public class ToDoItem
{
    @Id
    @GeneratedValue
    int id;
    String name;
    String imageBeforeFile;
    String imageAfterFile;
    String description;
    LocalDateTime plannedStartTime;
    LocalDateTime plannedEndTime;
    LocalDateTime StartTime;
    LocalDateTime EndTime;
    int timeSpent;
    TypeTask typeTask;
    Location location;
    @OneToMany
    List<ToDoItem> toDoItemsBlockersList;
    Boolean idComplete = false;
    Boolean isRepeatable;
    int xp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageBeforeFile() {
        return imageBeforeFile;
    }

    public void setImageBeforeFile(String imageBeforeFile) {
        this.imageBeforeFile = imageBeforeFile;
    }

    public String getImageAfterFile() {
        return imageAfterFile;
    }

    public void setImageAfterFile(String imageAfterFile) {
        this.imageAfterFile = imageAfterFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(LocalDateTime plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public LocalDateTime getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(LocalDateTime plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }

    public LocalDateTime getStartTime() {
        return StartTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        StartTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return EndTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        EndTime = endTime;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }

    public TypeTask getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<ToDoItem> getToDoItemsBlockersList() {
        return toDoItemsBlockersList;
    }

    public void setToDoItemsBlockersList(List<ToDoItem> toDoItemsBlockersList) {
        this.toDoItemsBlockersList = toDoItemsBlockersList;
    }

    public Boolean getIdComplete() {
        return idComplete;
    }

    public void setIdComplete(Boolean idComplete) {
        this.idComplete = idComplete;
    }

    public Boolean getRepeatable() {
        return isRepeatable;
    }

    public void setRepeatable(Boolean repeatable) {
        isRepeatable = repeatable;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
