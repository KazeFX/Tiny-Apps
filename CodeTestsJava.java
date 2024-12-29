public class Matrix3D {

    public static void main(String[] args) {
        int[][][] array = new int[9][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("[" + i + "][" + j + "][" + k + "]:" + array[i][j][k]);
                }
            }
        }
    }
}
