package Lesson38Homework;

    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void printInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

class Main1 {
        public static void main(String[] args) {
            Person p1 = new Person("Elsen", 25);
            Person p2 = new Person("Leyla", 22);

            p1.printInfo();
            p2.printInfo();
        }
    }

