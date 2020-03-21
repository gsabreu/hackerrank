public class ReverseArray {

    static int[] reverseArray(int[] a) {
        int aSize = a.length;
        int[] result = new int[aSize];
        int auxPosition = 0;

        for (int i = aSize -1; auxPosition < aSize  ; i--) {
            result[auxPosition] = a[i];
            auxPosition++;
        }
        return result;
    }
}
