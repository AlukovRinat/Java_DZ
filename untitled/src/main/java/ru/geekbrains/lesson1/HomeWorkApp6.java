package ru.geekbrains.lesson1;

//public class HomeWorkApp6
      class Animal {
               public String name;
        public int run;
        public Animal() {
        }
        public Animal(String name) {
            this.name = name;
        }
        public void animalInfo() {
            System.out.println();
        }
    }
       class Cat extends Animal {
        protected boolean sweem;
        public Cat(String name, int run, boolean sweem) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
        }
           public void catInfo() {
            System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem );
        }
    }
    class Dog extends Animal {
        public int sweem;
        public Dog(String name, int run, int sweem) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
        }
        public void dogInfo() {
            System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem);
        }
    }
    public class HomeWorkApp6 {
        public static void main(String[] args) {
            Animal animal = new Animal("CatsCategory");
            Cat cat = new Cat("Matroskin", 200, false);
            animal.animalInfo();
            cat.animalInfo();
            cat.catInfo();
            Animal danimal = new Animal("Dogs");
            Dog dog = new Dog("Boblik", 500, 10);
            danimal.animalInfo();
            dog.animalInfo();
            dog.dogInfo();
        }
    }

