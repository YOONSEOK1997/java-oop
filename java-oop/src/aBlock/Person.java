package aBlock;

public class Person {
    // public void first() {
    //     System.out.println("backup");
    // }
    // public void second() {
    //     System.out.println("delete");
    // }
    private void first() {
        System.out.println("backup");
    }
    private void second() {
        System.out.println("delete");
    }
    //캡슐화       

    public void deletePerson() {
        this.first();
        this.second();
    }
}

