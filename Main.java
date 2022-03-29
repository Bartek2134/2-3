import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String tekst;
        Scanner wpisz=new Scanner(System.in);
        System.out.print("Podaj slowo do zamiany: ");
        tekst=wpisz.nextLine();
        int j=0;
        byte numer;

        //zmiana na duże litery
        System.out.println("zmiana na duze litery");
        for(int i=0;i<tekst.length();i++ )
        {
            numer = (byte) tekst.charAt(i);
            if(numer>95)
                j+=1;
        }
        String Duze = tekst.toUpperCase();
        System.out.println("Tekst po zmiana: " + Duze);
        System.out.print("Ilosc zmian: " + j);

        //zmiana na małe litery
        System.out.println();
        System.out.println("zmiana na małe litery");
        j=0;
        for(int i=0;i<tekst.length();i++ )
        {
            numer = (byte) tekst.charAt(i);
            if(numer<95)
                j+=1;
        }
        String Male = tekst.toLowerCase();
        System.out.println("Tekst po zmiana: " + Male);
        System.out.print("Ilosc zmian: " + j);
      }
}