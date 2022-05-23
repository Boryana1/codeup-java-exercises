class ArraysSample {

    public static void main(String[] args) {
//        String[] weather = {"sunny", "cloudy", "rainy"};
//        String[] weather = new String;
//        weather[0] = "sunny";
//        weather[1] = "cloudy";
//        weather[2] = "rainy";

//        array of our daily steps for 7 days:
//        long[] dailySteps = {10_000L, 3_000L, 5_000L, 1_000L, 10_000L, 2_000L, 6_000L};
//        System.out.println(Arrays.toString(dailySteps));
//
//        long[] dailyStep = {654, 784, 9983, 2321, 10094, 4439, 39483,};
//        for (long element: dailyStep) {
//            System.out.println(element);
//        }

//        TODO: Let's create a method that returns the sum of all integers in an int array (nums)

//        int x = 3;
//        String number = "ne znam";
//        System.out.println(x + number);
        int[] nums = {2, 5, 10, 13};
        System.out.println(ArraysSample.sumAll(nums));
    };
    public static int sumAll(int[] numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    }
