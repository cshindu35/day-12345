abstract class Bank{
    abstract void money();
    void printing(){
        System.out.println("Your money is safe");

    }
}
class Sbi extends Bank{
    void money(){
        System.out.println("Your money is secured");
    }
}
class Main4{
    public static void main(String[] args){
        Sbi sb = new Sbi();
        sb.money();
        sb.printing();
    }
}