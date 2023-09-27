//bubble sort with time less complexity
package Sorting;

public class BubbleSort2 { 
    public static void  bubble_sort(int array[]){
    for(int i=0;i<=array.length-2;i++){
      int swaps=0;
      for(int j=0;j<=array.length-2-i;j++){
          if(array[j]>array[j+1]){
              int temp=array[j];
              array[j]=array[j+1];
              array[j+1]=temp;
              swaps++;
          }
      }
    }
  }
  public static void main (String args[]){
    int array[]={5,4,1,3,2};
    bubble_sort(array);
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
}
}

