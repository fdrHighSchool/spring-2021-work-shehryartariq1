import java.util.*;
public class SuperArray{
  private int[] array;
  private int count;


  public SuperArray(){
    this.array = new int[10];
  }//end constructor

  public SuperArray(int length){
    this.array = new int[length];
  }//end constructor

  public void add(int val){
      int length = this.array.length;

      for(int i = 0; i < this.array.length; i++ ){
        if(this.array[i] == 0){
          this.array[this.count] = val;
          this.count++;
          return;
        }
      
        int temp[] = new int[length + 1];
        //Use loop to copy the values over to the temp array
        for(i = 0 ; i < length; i++){
          temp[length] = this.array[i];
        }

        //
        temp[temp.length-1] = val;
        array = new int[temp.length];
        array = temp;
      }
    }//end add
   //Making the second add method.
    public void add(int index, int val){
      int []temp = new int[array.length + 1];//Temp array

      for(int i = 0; i < index; i++){
        temp[i] = array[i];
      }//end loop

      temp[index] = val;

      for(int i = index; i < array.length; i++){
        temp[i+1] = array[i];
      }//End

      array = new int[temp.length];
      array = temp;//Setting values back again

    }//end

    public void growArray(int size){
      //Making the array as big as the size entered
      int [] temp = new int[array.length + size];

      //Copy the values over
      for(int i = 0; i < array.length; i++){
        temp[i] = array[i]; //Setting the values to the temp array
      }//end

      array = new int[temp.length];
      array = temp;//Setting the values again
    }

    public void remove(int index){
      int [] temp = new int[array.length-1];

      //copy the values over
      for(int i = 0; i < index; i++){
        temp[i] = array[i];
      }//end

      for(int i = 0; i < temp.length; i++){
        temp[i] = array[i];
      }//end

      array = new int[array.length -1];
      array = temp;

    }

    public boolean isEmpty(){
      for(int i = 0; i < this.array.length; i++ ){
        if(this.array[i] != 0){
          return false;
        }
      }
      return true;
    }

    public int getValue(int index) {
      return array[index]; // return value
    }

    public void set(int index, int value) {
      if (index > array.length -1) {
        System.out.println("out of index");
        return;
      }
      array[index] = value; // sets value in the index
    }

    public String toString() {
     return Arrays.toString(this.array);
    } //end toString method

  }//end SuperArray(main)
