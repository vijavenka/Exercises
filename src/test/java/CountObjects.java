class Students{
    String name;
    int age;
    static int countObject=2;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        countObject++;
    }
}

public class CountObjects {
    public static void main(String[] args){
        Students student1 = new Students("Vijay", 32);
        Students student2 = new Students("Magesh", 30);
        Students student3 = new Students("Ravi", 39);
        Students student4 = new Students("Shan", 19);
        Students student5 = new Students("Varun", 49);

        System.out.println("Total count of Objects " + Students.countObject);
    }
}
