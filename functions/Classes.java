package functions;

public class Classes {
    public static boolean BiSearch(int[] arr, int value){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == value){
                return true;
            }
            if(arr[mid] < value){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return false;
    }
    public static int Calculator(int x, int y, String Operator){
        int result;
        if(Operator.equals("+")){
            result = x + y;
            return result;
        }
        if(Operator.equals("-")){
            result = x-y;
            return result;
        }
        if(Operator.equals("/")){
            result = x / y;
            return result;
        }
        if (Operator.equals("*")){
            result = x * y;
            return result;
        }
        else{
            System.out.println("This is not a valid Option. Please try again");
        }
        return -1;
    }

    public static int[] AddResults(int[] results, int value){
        int length = results.length+1;
        int[] newArray = new int [length];
        for(int c = 0; c < length; c++){

        }
        return newArray;
    }
}
