package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import library.MyLibraryClass;

@SpringBootApplication
public class MyBootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyBootApplication.class, args);

//        MyLibraryClass myLibraryClass = applicationContext.getBean(MyLibraryClass.class);
//        myLibraryClass.printInfo();
//
//        MyLibraryClass myLibraryClass1 = (MyLibraryClass) applicationContext.getBean("myLibraryClass");
//        myLibraryClass1.printInfo();

//        MyLibraryClass myLibraryClass2 = (MyLibraryClass) applicationContext.getBean("my.property");
//        myLibraryClass2.printInfo();

        MyLibraryClass myLibraryClass = applicationContext.getBean(MyLibraryClass.class);
        myLibraryClass.printInfo();
    }
}