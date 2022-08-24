package integerToRoman;

public class IntToRoman {
    public String intToRoman(int num) {
        String roman = "";
        int remaining = num;

        while(remaining > 0){
            if(remaining>=1000){
                roman += "M";
                remaining -= 1000;
            }
            else if(remaining>=900){
                roman += "CM";
                remaining -= 900;
            }
            else if(remaining>=500){
                roman += "D";
                remaining -= 500;
            }
            else if(remaining>=400){
                roman += "CD";
                remaining -= 400;
            }
            else if(remaining>=100){
                roman += "C";
                remaining -= 100;
            }
            else if(remaining>=90){
                roman += "XC";
                remaining -= 90;
            }
            else if(remaining>=50){
                roman += "L";
                remaining -= 50;
            }
            else if(remaining>=40){
                roman += "XL";
                remaining -= 40;
            }
            else if(remaining>=10){
                roman += "X";
                remaining -= 10;
            }
            else if(remaining>=9){
                roman += "IX";
                remaining -= 9;
            }
            else if(remaining>=5){
                roman += "V";
                remaining -= 5;
            }
            else if(remaining>=4){
                roman += "IV";
                remaining -= 4;
            }
            else{
                roman += "I";
                remaining -= 1;
            }
        }

        return roman;
    }
}
