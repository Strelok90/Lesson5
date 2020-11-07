package ru.geekbrains.homework.lesson5;

public class questionnaire {
    public static void main(String[] args) {
        System.out.println();

        Person[] perArray = new Person[5];
        perArray[0] = new Person("Ivanov Ivan", "Engineer", "ii@mail.ru", "+79997777779", 30000.05, 30, "123-123-123-123");
        perArray[1] = new Person("Tor Vit", "Chief financial officer", "tv@mail.ru", "+79997777778", 127000.25, 42, "123-123-123-321");
        perArray[2] = new Person("Petrov Kiril", "Security", "pk@mail.ru", "+79997777777", 19000.15, 60, "123-123-321-123");
        perArray[3] = new Person("Star Tony", "Lead Developer", "st@mail.ru", "+79997777776", 120000.10, 28, "123-312-123-123");
        perArray[4] = new Person("Wayne Bruce", "Specialist", "wb@mail.ru", "+799977777795", 138000.09, 48, "321-123-123-123");

        for (Person person : perArray) if (person.getAge() > 40) person.Show();

        System.out.println();

        Person pers1 = new Person();
        pers1.setFio("Иванов Иван");

        System.out.println(pers1.getFio());

     }

}
