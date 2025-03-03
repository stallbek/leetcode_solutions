public class Leetcode1 {


    public static void main(String[] argv){
        System.out.println(mergeAlternately("dajmknzgidixqgt", "nahamebx"));
    }


    public static String mergeAlternately(String word1, String word2) {
        String[] arr1 = word1.split("");
        String[] arr2 = word2.split("");
        int len1 = arr1.length;
        int len2 = arr2.length;
        int ind = 0;
        int ind2 = 0;
        boolean done1 = false;
        boolean done2 = false;
        boolean even = true;

        String answer = "";
        for (int i = 0; i < len2 + len1 ; i++ ){
            if (even && !done1 && !done2){
                answer = answer.concat(arr1[ind]);
                ind++;
                even = false;

                if (ind >= len1){
                    done1 = true;
                }
            }
            else if (!even && !done2 && !done1){
                answer = answer.concat(arr2[ind2]);
                ind2++;
                even = true;

                if (ind2 >= len2){
                    done2 = true;
                }
            }
            else if (done1){
                answer = answer.concat(arr2[ind2]);
                ind2++;
            }
            else if (done2){
                answer = answer.concat(arr1[ind]);
                ind++;
            }
        }

        return answer;

    }
}
