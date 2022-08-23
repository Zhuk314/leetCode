package romanToInteger;

class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] roman = s.toCharArray();

        for(int i = 0; i < roman.length; i++) {
            if (i == roman.length - 1){
                result += charToInt(roman[i]);
                break;
            }
            if(
               (roman[i] == 'I' && (roman[i+1] == 'V' || roman[i+1] == 'X')) ||
               (roman[i] == 'X' && (roman[i+1] == 'L' || roman[i+1] == 'C')) ||
               (roman[i] == 'C' && (roman[i+1] == 'D' || roman[i+1] == 'M'))
            ) {
                result += charToInt(roman[i+1]) - charToInt(roman[i]);
                i++;
            }
            else{
                result += charToInt(roman[i]);
            }
        }

        return result;
    }

    public static int charToInt(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
