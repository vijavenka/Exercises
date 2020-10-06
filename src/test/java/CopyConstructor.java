public class CopyConstructor {
    int x;
    int y;

    @Override
    public String toString() {
        return "CopyConstructor{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    CopyConstructor(int x, int y){
        this.x = x;
        this.y = y;
    }

    CopyConstructor(CopyConstructor c){
        System.out.println("Copy constructor is called ...");
        x = c.x;
        y = c.y;
    }

    public static void main(String[] args){
        CopyConstructor a = new CopyConstructor(2, 3);
        CopyConstructor b = new CopyConstructor(a);
        System.out.println(b.toString());
    }
}
