package lec03;

import org.jetbrains.annotations.NotNull;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    @Nullable
    @NotNull
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
