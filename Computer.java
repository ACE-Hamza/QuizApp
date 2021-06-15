public class Computer extends CSVReader{
    public static void computer(){
        String[][] bank = csv("Computer.csv");
        displayQuestion(bank);
    }
}
