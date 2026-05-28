/*Write a program to display the postfix and prefix
values of the given number, 5, by using increment
operators.*/
class Postnprefix{
    public static void main(String[] args){
        int n=5,x=5;
        int po,pr;
        po=x++; // po = 5
        pr=++n; // pr = 6
        System.out.println("postfix: "+po+ " prefix: " +pr);

    }
}