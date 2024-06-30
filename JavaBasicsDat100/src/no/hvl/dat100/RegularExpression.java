package no.hvl.dat100;

public class RegularExpression {
    public static void main(String[] args) {

        //Regular expression
        /*
        String str="f";
        System.out.println(str.matches(".")); //any character
        System.out.println(str.matches("fdb"));
        System.out.println(str.matches("[afc]"));
        String str2="abc";
        System.out.println(str2.matches("[abc]"));//exactly given letters
        System.out.println(str2.matches("[a-z]")); //any character from a-z
        String str3="4";
        System.out.println(str3.matches("[a-d0-9]"));
        String str4="a5%";
        System.out.println(str4.matches("[a-d][0-9][%]"));
        System.out.println(str3.matches("[a|7]"));

        // Meta characters
        String str5="abcdefea";
        System.out.println(str5.matches(".*")); // any letter any number of times(0 or more)
        System.out.println(str5.matches("[a-d]{3}")); //exactly 3 letters
        System.out.println(str5.matches("[a-z]{3,7}"));
        String str6="abcd@gmail.com2";
        System.out.println(str6.matches(".*gmail.*"));
        System.out.println(str6.matches("\\w*@gmail(.*)")); // means \\w any number or digit any number of times,but should have @gmail and follows by any letter

        */



        //  Challenge
        String string="abcd@gmail.com";
        int index=string.indexOf("@");
        String startingPart=string.substring(0,index);
        System.out.println(startingPart);
        int indexOfDot=string.indexOf(".");
        String lastPart=string.substring(indexOfDot);
        System.out.println(lastPart);
        String middlePart=string.substring(index,indexOfDot);
        System.out.println(middlePart);
        System.out.println(middlePart.equals("@gmail"));


        //Challenge 2
        //Find if a number is Binary or not.Find if a number is Hexa-decimal.Find if the data is in date formate(dd/mm/yyyy).
        //Binary
       int number=1110111101;
        String str5=String.valueOf(number);
        System.out.println(str5.matches("[01]*"));
        //Hexadecimal
        String str6="34535F";
        System.out.println(str6.matches("[0-9A-F]+"));
        //Date
        String str7="01/02/1999";
        System.out.println(str7.matches("([0-3][0-9]/[0-1][0-9]/[0-9]{4})"));



    }
}
