package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Maksym", "Kulikov", "IO-42");
        String json = new Gson().toJson(person);
        System.out.println(json);
    }
}
