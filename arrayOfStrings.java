public class arrayOfStrings {
    public static void main(String args[]){
    String a[][] = new String[4][3];
    String b[] = {"Ace", "Sabo", "Luffy"};
    a[0] = b;
    System.out.println(a[0][1]);    
}
}
