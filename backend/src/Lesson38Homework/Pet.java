package Lesson38Homework;

class Pet {
    String name, species; int age;
    Pet(String name,String species,int age){this.name=name;this.species=species;this.age=age;}
    void show(){System.out.println(name+" ("+species+"), Age: "+age);}
    int ageInHumanYears(){ return age*7; }
}

class DogPet extends Pet {
    String favoriteToy;
    DogPet(String name,int age,String toy){ super(name,"Dog",age); favoriteToy=toy; }
    void show(){ super.show(); System.out.println("Favorite Toy: "+favoriteToy); }
}

class BirdPet extends Pet {
    double wingSpan;
    BirdPet(String name,int age,double wingSpan){ super(name,"Bird",age); this.wingSpan=wingSpan; }
    void show(){ super.show(); System.out.println("Wing span: "+wingSpan); }
}

 class Main29 {
    public static void main(String[] args){
        DogPet d = new DogPet("Rex",3,"Ball");
        BirdPet b = new BirdPet("Tweety",2,0.5);
        d.show(); System.out.println("Human age: "+d.ageInHumanYears());
        b.show(); System.out.println("Human age: "+b.ageInHumanYears());
    }
}
