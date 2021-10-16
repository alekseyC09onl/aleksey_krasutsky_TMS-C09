public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private String name;
    private int age;
    private String gender;
    private String country;
    private String city;

    public Person(String name, int age, String gender, String country, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
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
