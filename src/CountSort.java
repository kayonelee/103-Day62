//public class CountSort {
//        public static String countSort(String arr) {
//        int[] count = new int[26];
//
//        for (int i = 0; i < arr.length(); i++) {
//            char c = arr.charAt(i);
//            count[c - 'a']++;
//        }
//
//        //COUNT ARRAY
//        StringBuilder sortedString = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            while (count[i] > 0) {
//                sortedString.append((char) ('a' + i));
//                count[i]--;
//            }
//        }
//
//        return sortedString.toString();
//    }
//    public static void main(String[] args) {
//        int N = 13;
//        String S = "geeksforgeeks";
//        System.out.println("Input: ");
//        System.out.println("N = " + N);
//        System.out.println("S = " + S);
//        System.out.println("Output: ");
//        System.out.println(countSort(S));
//    }
//}