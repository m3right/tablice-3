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
         for ( int i = 0; i < x; i++ ) 
            for ( int j = 0; j < y; j++ )
               if ( m[i][j] < m[min_x][min_y] ) {
                  min_x = i;
                  min_y = j;
               }
         
         System.out.println("Najmniejszy element znajduje sie w wierszu nr "+
                            (min_x)+" i kolumnie nr "+(min_y)+
                            " a jego wartosc wynosi "+m[min_x][min_y]);
      } catch(IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. Znajdz najwieksze z minimow poszczegolnych wierszy.
 * 2. Policz srednia minimow wierszy.
 */
 
