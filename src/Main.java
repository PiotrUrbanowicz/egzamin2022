import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("pdodaj dane:");
        String[] tabString=(scanner.nextLine()).split(" ");
        int[] tabIn=new int[tabString.length];
        for (int i = 0; i < tabString.length; i++) {
            tabIn[i]=Integer.parseInt(tabString[i]);
        }
        int[] wynik=oblicz(tabIn);
        System.out.println("minimalna roznica: "+wynik[2]);
        System.out.println("Inlosc jablek: "+ wynik[0]);
        System.out.println("ilosc pomaranczy: "+ wynik[1]);
    }

    public static int[] oblicz(int[] tabIn){
        int J=tabIn[0];
        int P=tabIn[1];
        int Z=tabIn[2];
        if(Z==0){
            return new int[]{J,P,Math.abs(J-P)};
        }
        if(J>=P){
            P++;
            Z--;
        }else if(J<P){
            J++;
            Z--;
        }
        return oblicz(new int[]{J,P,Z});




    }



}