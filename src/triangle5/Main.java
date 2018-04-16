package triangle5;

public class Main {
    public static void main(String[] args) {
        String [][]arr=new String[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                System.out.print(arr[i][j]="   ");
            }
            for (int j=0;j<i+1;j++){
                System.out.print(arr[i][j]=" * ");
            }
            for (int j=0;j<i;j++){
                System.out.print(arr[i][j]=" * ");
            }
            System.out.println();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                System.out.print(arr[i][j]="   ");
            }
            for (int j=0;j<i+1;j++){
                System.out.print(arr[i][j]=" * ");
            }
            for (int j=0;j<i;j++){
                System.out.print(arr[i][j]=" * ");
            }
            System.out.println();
        }

    }
}
