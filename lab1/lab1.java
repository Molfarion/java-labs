import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigDecimal;

class NumberOperations {
    public static void main(String[] args) {
        ArrayList<Number> nums = new ArrayList<>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));
        
        printNumbers(nums);

        printRoundedNumbers(nums);

        printPrecisionNumbers(nums);
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Double> doubleList = new ArrayList<Double>();
        ArrayList<Float> floatList = new ArrayList<Float>();

        for (Number num : nums) {
            if (num instanceof Integer i) {
                intList.add(i);
            } else if (num instanceof Float f) {
                floatList.add(f);
            } else if (num instanceof Double d) {
                doubleList.add(d);
            } else {
                System.err.println("Unknown type: ");
            }
        }

        System.out.print("\nInteger numbers: ");
        printList(intList);

        System.out.print("\nDouble numbers: ");
        printList(doubleList);

        System.out.print("\nFloat numbers: ");
        printList(floatList);

        ArrayList<BigDecimal> bigDecimals = convertToBigDecimal(nums);
        System.out.print("\nBigDecimal numbers: ");
        printList(bigDecimals);
    }

    private static void printNumbers(ArrayList<Number> nums){
        System.out.print("\nNumbers  ");
        for (Number num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void printRoundedNumbers(ArrayList<Number> nums) {
        System.out.print("\nInteger numbers  ");
        for (Number num : nums) {
            System.out.print(Math.round(num.doubleValue()) + " ");
        }
    }

    private static void printPrecisionNumbers(ArrayList<Number> nums) {
        System.out.print("\nNumbers with precision  ");
        for (Number num : nums) {
            System.out.printf(String.format("%.2f", num.doubleValue()) + " ");
        }
    }

    private static <T extends Number> void printList(ArrayList<T> list) {
        for (T num : list) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<BigDecimal> convertToBigDecimal(ArrayList<Number> nums) {
        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();
        for (Number num : nums) {
            BigDecimal bd = new BigDecimal(num.toString());
            bigDecimals.add(bd);
        }
        return bigDecimals;
    }
}
