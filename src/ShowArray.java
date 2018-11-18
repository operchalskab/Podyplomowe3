public class ShowArray {
    public static void main(String[] args) {
        int[] [] [] array = {{{1,2,3},{1,2}, {1,4,5}}};

        for ( int i =0; i <=array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print("array");
                    System.out.print("[" + i + "]");
                    System.out.print("[" + j + "]");
                    System.out.print("[" + k + "]");
                    System.out.println(array[i][j][k]);

                }
            }
        }
//        System.out.println(array[0][1][0]);
//        System.out.println(array[0][0][1]);
//        System.out.println(array[1][0][0]);
//        System.out.println(array[0][0][2]);
//        System.out.println("Długość tablicy:" + array.length);

    }
}
