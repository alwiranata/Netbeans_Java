
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Masukkan hari menurut angka 1 - 7 : ");
        int day = scanner.nextInt();
        
        switch(day){
        case 1: 
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Tuesday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Angka di inputkan tidak valid!");
    }
        
        for(int add = 0 ; add < 11; add++){
            System.out.println(add);
        }
    }
}
