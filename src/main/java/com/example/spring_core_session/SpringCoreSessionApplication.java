package com.example.spring_core_session;

import com.example.spring_core_session.die.PythonStudent;
import com.example.spring_core_session.ios.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreSessionApplication {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Teacher myTeacher = context.getBean("myTeacher",Teacher.class);
//        myTeacher.code();
//        myTeacher.speed();
//        context.close();

        PythonStudent pythonStudent = context.getBean("myTeacher1", PythonStudent.class);
        System.out.println(pythonStudent.getName());
        System.out.println(pythonStudent.getAge());
        System.out.println(pythonStudent.getEmail());
        System.out.println(pythonStudent.getPhoneNumber());
        pythonStudent.getTeacher().code();
        pythonStudent.getTeacher().speed();
        context.close();



    }
}
