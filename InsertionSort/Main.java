import java.util.*;
class InsertionSort { 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }

    void instanceArray(int arr[]){
        System.out.println("Ingrese los numeros");
        Scanner reader = new Scanner(System.in);
        int n = arr.length; 
        for (int i=0; i<n; ++i){
            arr[i]=reader.nextInt();
        }
        reader.close();   
    } 
}
class Main {
<<<<<<< HEAD:InsertionSort/Main.Java
    //Branch: Experimento
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 1, 15 }; 
=======
  //Branch : Experimento
  public static void main(String[] args) {
      int arr[] = { 12, 11, 13, 5, 6, 1, 15 }; 
>>>>>>> adf08a62569950e7812b705eb05a830041473b28:InsertionSort/Main.java
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
        System.out.println("Sorted array");
        ob.printArray(arr); 
  }
}
