public class mafe(){
  public static void main(String[]args){
    Cliente objA = new Cliente();
    Cliente objB = new Cliente();
    
    // inicializando mesmos valores para objA e objB
    // ...
    
    if(objA == objB) {
      System.out.println("Iguais");
    } else {
      System.out.println("Diferentes");
    }
  }
}
