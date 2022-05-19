package finalexample;

//final przy klasie blokuje dziedziczenie
public final class Student {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    //final przy metodzie blokuje nadpisanie metody
    public final void walk() {
        System.out.println("Idę tup tup!");
    }

}
