package com.wzc.javase.about.annotation.myannotation;

public class MainTest {

    public static void main(String[] args) {
        Class<Person> person = Person.class;
        MyAnnotation annotation = person.getAnnotation(MyAnnotation.class);
        String name = annotation.name();
        int age = annotation.age();;
        String[] hobby = annotation.hobbies();
        Person newPerson = null;
        try {
            newPerson = person.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        newPerson.setName(name);
        newPerson.setAge(age);
        newPerson.setHobby(hobby);
        System.out.println(newPerson);
    }

}
