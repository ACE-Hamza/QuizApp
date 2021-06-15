import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

public abstract class CSVReader {

    String path;

    // public static void main(String[] args){
    public static String[][] csv(String path){
        String line = "";
        String[][] bank = new String[5][6];

        try{
            BufferedReader bro = new BufferedReader(new FileReader(path));

            int i = 0;
            while((line = bro.readLine()) != null){
                String[] values = line.split(",");
                bank[i] = values;
                i++;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return bank;
    }
    
    public static void displayQuestion(String[][] bank){
        Scanner sc = new Scanner(System.in);
        int score = 0;

        ArrayList<Integer> qlist = UniqueRandomNumbers.randomSequence(5);

        for(int i= 0;i < 5;i++){
            String[] options = new String[4];
            System.out.println(bank[qlist.get(i)][0]);

            ArrayList<Integer> olist = UniqueRandomNumbers.randomSequence(4);
            for(int j = 0;j < 4;j++)
            {
                System.out.println((j + 1) + "." + bank[qlist.get(i)][olist.get(j) + 1]);
                options[j] = bank[qlist.get(i)][olist.get(j) + 1];
            }

            System.out.println();
            System.out.println("Enter your answer: ");
            
            int ans = sc.nextInt();
            if(options[ans - 1].equals(bank[qlist.get(i)][5])){
                score += 20;
            }
            System.out.println();
        }

        System.out.println("Your score (out of 100) is: " + score);
        System.out.println();
    }
}