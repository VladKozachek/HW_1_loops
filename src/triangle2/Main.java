package triangle2;

public class Main {
    public static void main(String[] args) {
        String [][]arr=new String[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                System.out.print(arr[i][j]=" * ");
            }
            for (int t=0;t>i;t++){
                System.out.print(arr[i][t]=" * ");
            }
            System.out.println();
        }
    }
}
