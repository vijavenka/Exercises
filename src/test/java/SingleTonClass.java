public class SingleTonClass {

    private static SingleTonClass singleTonClass = null;

    private SingleTonClass(){}

    public static SingleTonClass getInstance(){
        if(singleTonClass == null){
            singleTonClass = new SingleTonClass();
        }
        return singleTonClass;
    }

    public void display(){
        System.out.println("Calling display method ... using single instance object");
    }

    public static void main(String[] args){
        SingleTonClass myObj = SingleTonClass.getInstance();
        myObj.display();
    }
}
