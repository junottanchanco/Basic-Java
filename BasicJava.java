import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class BasicJava{
  public void print1To255(){
    for(int i = 0; i < 256; i++){
      System.out.println(i);
    }
  }
  public void printOdds(){
    for(int i = 0; i < 256; i++){
      if(i % 2 != 0){
        System.out.println(i);
      }
    }
  }
  public void printSum(){
    int sum = 0;
    for(int i = 0; i < 256; i++){
      sum += i;
      System.out.println("New number: " + i + " Sum: " + sum);
    }
  }
  public void iterArr(int[] array){
    for(int X : array){
      System.out.println(X);
    }
  }
  public void printMax(int[] array){
    int max = array[0];
    for(int Y : array){
      if(Y > max){
        max = Y;
        System.out.println(max);
      }
    }
  }
  public void getAverage(int[] array){
    int sum = array[0];
    int length = 0;
    for(int x : array){
      sum += x;
      length++;
    }
    int average = sum/length;
    System.out.println(average);
  }
  public void arrOdd(){
    ArrayList<Integer> y = new ArrayList<Integer>();
    for(int i = 1; i < 256; i++){
      if(i % 2 != 0){
        y.add(i);
      }
    }
    System.out.println(y);
  }
  public void greaterThan(int[] arr, int y){
    int count = 0;
    for(int x : arr){
      if(x > y){
        count++;
      }
    }
    System.out.println(count);
  }
  public void squareVal(int[] arr){
    ArrayList<Integer> x = new ArrayList<Integer>();
    for(int a : arr){
      int val =(int) Math.pow(a, 2);
      x.add(val);
    }
    System.out.println(x);
  }
  public int[] elimNeg(int[] arr){
    int length = 0;
    for(int a : arr){
      length++;
    }
    for(int i=0; i < length; i++){
      if(arr[i] < 0){
        arr[i] = 0;
      }
    }
    return arr;
  }
  public void maxMinAvg(int[] arr){
    int max = arr[0];
    int min = arr[0];
    int sum = 0;
    for(int Y : arr){
      if(Y > max){
        max = Y;
      }
      if(Y < min){
        min = Y;
      }
      sum += Y;
    }
    int avg = sum/arr.length;
    int newArr[] = {max, min, avg};
    System.out.println(Arrays.toString(newArr));
  }
  public void shiftVal(int[] arr){
    ArrayList<Integer> x = new ArrayList<Integer>();
    for(int i =1; i < arr.length; i++){
      x.add(arr[i]);
    }
    x.add(0);
    System.out.println(x);
  }
}
