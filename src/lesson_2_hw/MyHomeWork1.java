package lesson_2_hw;
public class MyHomeWork1 {
    public static void main(String[] args) {
        setPersonData();
    }

    public static void setPersonData() {
        String name;
        String surname;
        int age;
        float weight;
        boolean isMaried;

        name = "Ilya";
        surname = "Mescheryakov";
        age = 39;
        weight = 93.7f;
        isMaried = true;
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Are you Maried? " + isMaried);
    }

}




