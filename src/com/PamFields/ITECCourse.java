package com.PamFields;
import java.util.ArrayList;

/**
 * Stores data about an ITEC course.
 *
 */
public class ITECCourse {

    //Data that an ITECCourse object needs to store
     String name;
     int code;
     ArrayList<String> students;
     int maxStudents;
     String room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    void addStudent(String studentName) {
        if (students == null) {    //See if students has been set up yet – initialize it if not
            students = new ArrayList<String>();
        }
        students.add(studentName);
    }

    void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + maxStudents);
        System.out.println("The number of freespots in the class is (are): "+getFreeSpace());
        System.out.println("The room this class is "+room);
    }

    int getNumberOfStudents() {
        return this.students.size();
    }

    int getFreeSpace(){
        int freespace = this.maxStudents - this.students.size();
        return freespace;
    }

}
