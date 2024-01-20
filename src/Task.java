/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacobmajd
 */
import java.time.LocalDate;

public class Task {
    private String name;
    private int timeNeeded;
    private int timeAllocated;
    private String status;
    private LocalDate dueDate;
    private String description;
    
    // Constructor 
    public Task(String name, int timeAllocated, String status, LocalDate dueDate, String description) {
        this.name = name;
        //this.timeNeeded = timeNeeded;
        this.timeAllocated = timeAllocated;
        this.status = status;
        this.dueDate = dueDate;
        this.description = description;
    }
    
   
    
    // Getters
    public String getName() {
        return name;
    }

    public int getTimeNeeded() {
        return timeNeeded;
    }

    public int getTimeAllocated() {
        return timeAllocated;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTimeNeeded(int timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    public void setTimeAllocated(int timeAllocated) {
        this.timeAllocated = timeAllocated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "" + name +"\n" + timeAllocated + "\n" + status + "\n" + dueDate + "\n" + description+"\n";
    }
    
    public int compareTo(Task other) {
        return this.dueDate.compareTo(other.getDueDate());
    }
    public String getDetails() {
        return "Time Allocated: " + timeAllocated + "\n"
                + "Status: " + status + "\n"
                + "Due Date: " + dueDate + "\n"
                + "Description: " + description;
    }
    }


