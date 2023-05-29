import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int dem=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu");
        n= scanner.nextInt();
        int phantu[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap gia tri phan tu "+i);
            phantu[i]= scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if (n%phantu[i]==0){
                dem++;
            }
        }
        System.out.println("co "+dem+ " uoc cua n");
    }
}