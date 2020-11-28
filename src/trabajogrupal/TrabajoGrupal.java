package trabajogrupal;

public class TrabajoGrupal {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("Programa que muestra los multiplos de 5 del 0 a 100");
        for(int i = 0;i <= 100;i++){
            do{ if(i%5==0){
                b = true;
                System.out.println(i);
                }
            }while(b==false);
        }
    }
    
}
