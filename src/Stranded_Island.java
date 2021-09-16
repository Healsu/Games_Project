import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Stranded_Island {
    public static void main(String[] args) {
        String options[] = {"Kanye west","PC","Your mom","Coffee Machine","Endless beer","Jens (OwO)","League of Gayess","Newest verison of Java","Rabuski Birb","Gun"};

        for(int i = 0; i<options.length; i++){
            String elementInArray = options[i];
            System.out.println((i+1)+". "+elementInArray);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of what you would like to have on a deserted island: ");
        int choiceInput = scanner.nextInt();
        System.out.println("You have chosen "+options[choiceInput-1]);

    }
}
