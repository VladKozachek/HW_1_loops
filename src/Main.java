public class Main {
    public static void main(String[] args) {
        String [][]arr=new String[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                System.out.print(arr[i][j]=" * ");
            }
            System.out.println();
        }
    }
}
