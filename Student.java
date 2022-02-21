public class Student {
    private int age;
    private int iq;
    private float weight;
    private float height;
    private String name;

    public Student(int age, int iq, float weight, float height, String name) {
        this.age = age;
        this.iq = iq;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public int getIq() {
        return this.iq;
    }

    public float getWeight() {
        return this.weight;
    }

    public float getHeight() {
        return this.height;
    }

    public void talk(){
        System.out.println("My name is " + this.name);
    }
}
