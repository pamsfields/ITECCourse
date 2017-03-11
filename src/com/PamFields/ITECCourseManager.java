package com.PamFields;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String args[]) {
        ArrayList<ITECCourse> classList = new ArrayList<ITECCourse>();

        ITECCourse maintenanceCourse = new ITECCourse();
        classList.add(maintenanceCourse);
        maintenanceCourse.name = "Microcomputer Systems Maintenance";
        maintenanceCourse.code = 1310;
        maintenanceCourse.maxStudents = 3;
        maintenanceCourse.room = "T3500";


        //Add some students.
        //TODO check that we have not exceeded the max number for the class

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        //maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse();
        classList.add(datacomCourse);
        datacomCourse.name = "Data Communications";
        datacomCourse.code = 1425;
        datacomCourse.maxStudents = 30;
        datacomCourse.room = "T3040";

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        //datacomCourse.writeCourseInfo();

        ITECCourse infoTechCourse = new ITECCourse();
        classList.add(infoTechCourse);
        infoTechCourse.name = "Info Tech Concepts";
        infoTechCourse.code = 1100;
        infoTechCourse.maxStudents = 30;
        infoTechCourse.room = "T3050";

        infoTechCourse.addStudent("Max");
        infoTechCourse.addStudent("Nancy");
        infoTechCourse.addStudent("Orson");

        //infoTechCourse.writeCourseInfo();

        for( ITECCourse course :classList) {
            System.out.println(course.name);
            System.out.println(course.maxStudents-course.students.size());
        }

    }

}
