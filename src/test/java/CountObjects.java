public class CountObjects {
    String name;
    int age;
    static int countObject=0;
    static int a = 10;

    public CountObjects(String name, int age) {
        this.name = name;
        this.age = age;
        countObject++;
    }

        public static void main(String[] args){
        int b = 5;
        a = b;
        System.out.println("a :" + a + " b :" + b);
        CountObjects student1 = new CountObjects("Vijay", 32);
        CountObjects student4 = new CountObjects("Shan", 19);
        CountObjects student5 = new CountObjects("Varun Dhawan", 49);
        CountObjects student6 = new CountObjects("Vanitha Nagaraj", 23);

        System.out.println("Total count of Objects " + countObject);
    }
}
