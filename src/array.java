

public class array {

  
    public static void main(String[] args) {
      String[] Handphone =  {"Samsung", "Vivo", "Iphone"};
      System.out.println(Handphone.length);
      for (String h : Handphone){
          System.out.println(h);
      }
      
      int[] number = {
          11,
          12,
          13,
      };
      number[0] = 13;
      System.out.println("Panjang Array " + number.length);
      System.out.println(number[0]);
      for(int n : number){
          System.out.println(n);
      }
      
      String[] myFamily = {"I" ,"Litle Brother", "My Parent"};
        for(int i = 0 ; i< myFamily.length ; i++){
          System.out.println(myFamily[i]);
      }
      
      for(String m : myFamily){
          System.out.println("m" + m);                                     
      }
      
      //multidimensi arrays
      int[][] myNumbers= {{1,2,3},{4,5,6}};
      System.out.println(myNumbers[1][2]);
      myNumbers[1][1]=9;
      System.out.println(myNumbers[1][1]);
      
     
      
      int[][]myArray= {{1,2,3},{4,5,6,7}}; //length = 2
      for(int i = 0; i < myArray.length; i++){ // 0 < 2 true  {
          for(int n = 0; n< myArray[i].length; n++){// 0 < 3 {
              System.out.println("p"+myArray[i][n]);
          }
      }
      
      for(int[] newArray : myArray){
          for(int array : newArray){
           System.out.println(array);
          }
      }
    }
}