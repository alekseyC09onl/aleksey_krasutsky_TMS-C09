public class Person {
    String name;
    int age;
    String gender;
    String country;
    String city;

    public Person(String name, int age, String gender, String country, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name +
                ", age = " + age +
                ", gender = " + gender +
                ", address = " + country + ", " +
                city + '}';
    }


}
