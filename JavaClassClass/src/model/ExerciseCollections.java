package model;

import java.util.*;
public  class ExerciseCollections {

    public ExerciseCollections() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("blue");
        list_Strings.add("Green");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Red");

        for (String color : list_Strings) {
            System.out.println(color);
        }
    }

}