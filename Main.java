import java.io.*;

public class Main {

   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int x, y;
         System.out.println("Podaj liczbe wierszy macierzy: ");
         x = Integer.parseInt(in.readLine());
         System.out.println("Podaj liczbe kolumn macierzy: ");
         y = Integer.parseInt(in.readLine());        
         int[][] m = new int[x][y];
         
         for ( int i = 0; i < x; i++ ) {
            for ( int j = 0; j < y; j++ ) {
               System.out.println("Podaj element ["+i+"]["+j+"]: ");
               m[i][j] = Integer.parseInt(in.readLine());
            }
         }
         
         int min_x = 0, min_y = 0;
         int[] minima = new int[x];
         for ( int i = 0; i < x; i++ )
         {
            minima[i] = m[i][0];
            for ( int j = 0; j < y; j++ )
               if ( m[i][j] < minima[i] ) {
                  minima[i] = m[i][j];
               }
         }
         for(int i=0; i<x; i++)
            System.out.println(minima[i]);
         
            System.out.println("To jest srednia: " + average(minima,x));

      } catch(IOException e) {
      }
   }
   public static float average(int[] tablica, int rozmiar) {
      float average = (float)suma(tablica,rozmiar)/rozmiar;
    return average;
}
   public static int suma(int[] tablica, int rozmiar) {
   int s = 0;
   for ( int i = 0; i < rozmiar; i++ )
      s += tablica[i];
   return s;
}

}


/*
 * Cwiczenia:
 * 1. Znajdz najwieksze z minimow poszczegolnych wierszy.
 * 2. Policz srednia minimow wierszy.
 */
 
