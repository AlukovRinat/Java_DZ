package ru.geekbrains.lesson1;

public class HomeWorkApp5 {
    public static class Person {
        String midleName;
        String name;
        String lastName;
        String email;
        String phone;
        int salary;
        int age;
        String post;
        Person (String midleName,
        String name,
        String lastName,
        String email,
        String phone,
        int salary,
        int age,
        String post) {
            this.midleName=midleName;
            this.name=name;
            this.email=email;
            this.phone=phone;
            this.salary=salary;
            this.lastName=lastName;
            this.age=age;
            this.post=post;
        }
        void printInfo (){
            System.out.println(this.midleName);
            System.out.println(this.name);
            System.out.println(this.email);
            System.out.println(this.phone);
            System.out.println(this.salary);
            System.out.println(this.lastName);
            System.out.println(this.age);
            System.out.println(this.post);
        }
    }
    public static void main(String[] args) {
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov","Ivan", "Ivanovih", "ivivan@mailbox.com", "892512312", 30000, 30, "Engineer"); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Ksenia","Zimina", "Olegovna", "ksenia.com", "892313312", 60000, 22, "Model");
        persArray[2] = new Person("Iva","Iv", "Ivano", "ivivano.com", "892314312", 40000, 44, "Engin");
        persArray[3] = new Person("N","M", "P", "NMP.com", "892312212", 30000, 20, "Hr");
        persArray[4] = new Person("K","A", "R", "KAR.com", "892312312", 50000, 29, "KI");
        for (Person person:persArray){
            if (person.age>40){
                person.printInfo();
            }
        }

    }


}
