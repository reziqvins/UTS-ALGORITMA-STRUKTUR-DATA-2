
package UTS;

import java.util.Scanner;

public class No3 {
     public static void printMatriks(int[][] matriks){
        //menampilkan matriks
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //berlaku untuk matriks A
        System.out.println("Masukan baris Matriks A;");
        int baris = input.nextInt();
        System.out.println("Masukan kolom Matriks A:");
        int kolom = input.nextInt();
        
        //membuat matriks A
        int[][] matriks_a = new int[baris][kolom];
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.println("Matriks A["+i+" , "+j+"]");
                matriks_a[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks A ===");
        printMatriks(matriks_a);
        
        int[][] hasilTranpose = new int[matriks_a.length][ matriks_a[0].length];
        for (int i=0; i<matriks_a.length; i++){
            for (int j=0; j< matriks_a[0].length; j++){
                hasilTranpose[j][i] = matriks_a[i][j];
            }
        }
        System.out.println("hasil tranpose");
        for (int i=0; i<matriks_a[0].length; i++){
            for (int j=0; j<matriks_a.length; j++){
                System.out.print(hasilTranpose[i][j]+" ");
            }
            System.out.println();
        }
        //berlaku untuk matriks A
        System.out.println("Masukan baris Matriks Ab;");
        int barisb = input.nextInt();
        System.out.println("Masukan kolom Matriks b:");
        int kolomb = input.nextInt();
        
        //membuat matriks B
        int[][] matriks_b = new int[barisb][kolomb];
        for (int i=0; i<barisb; i++){
            for (int j=0; j<kolomb; j++){
                System.out.println("Matriks A["+i+" , "+j+"]");
                matriks_b[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks A ===");
        printMatriks(matriks_b);
        
        int[][] hasilTranposeb = new int[matriks_b.length][ matriks_b[0].length];
        for (int i=0; i<matriks_b.length; i++){
            for (int j=0; j< matriks_b[0].length; j++){
                hasilTranpose[j][i] = matriks_b[i][j];
            }
        }
        System.out.println("hasil tranpose matriks b");
        for (int i=0; i<matriks_b[0].length; i++){
            for (int j=0; j<matriks_b.length; j++){
                System.out.print(hasilTranposeb[i][j]+" ");
            }
     }
     }
}