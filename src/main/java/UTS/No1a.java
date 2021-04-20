
package UTS;

public class No1a {
    public static void Insertionsort(int[] A){
        for(int i = 1; i < A.length; i++){
            int key = A[i];
            int j = i-1;
            while((j >=0 && (A[j] > key))){
                
            
            
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        } 
    }
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Muhammad Reziq Darusman (20090127) Kelas 2B");
        System.out.println();
        int A[] = {3, 10, 4, 2, 8, 13};
        No1a.tampil(A);
        No1a.Insertionsort(A);
        No1a.tampil(A);
    }
}