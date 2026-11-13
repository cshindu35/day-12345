class Rbi{
    void name(){
        System.out.println("This is Rbi");

    }
}
class Sbi extends Rbi{
  void Sbi (){
    System.out.println("This is Sbi");

  }  
}
class Main2{
    public static void main(String[] args){
        Sbi ch = new Sbi();
        ch.name();
            }
}