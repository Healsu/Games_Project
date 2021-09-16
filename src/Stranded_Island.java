import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Stranded_Island {
    public static void main(String[] args) {
        //De forskellige muligheder for spilleren at vælge imellem
        String options[] = {"Kanye west", "PC", "Your mom", "Coffee Machine", "Endless beer", "Jens (OwO)", "League of Gayess", "Newest verison of Java", "Rabuski Birb", "Gun"};
        //Her har vi mængden af int som der skal blive ændret på i forhold til hvor mange gange man havde valgt hver mulighed på den tidliger array
        int allInputsCombined[] = new int[10];

        //Et for loop til at vise hver mulighed for spilleren.
        for (int i = 0; i < options.length; i++) {
            //give hele indexet et nyt navn som kun bliver brugt her
            String elementInArray = options[i];
            System.out.println((i + 1) + ". " + elementInArray);
        }

        //Vi giver alt informationen vi har fået i vores main videre til vores næste method som få disse informationer som nye parameter
        //Selvom de har det samme navn (orker ikke at give dem nye navne)
        result(options,allInputsCombined);
    }

    public static void result (String options[], int allInputsCombined[]){
        for (int i = 0; i < allInputsCombined.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What item number would you like? ");
            int playerChoice = scanner.nextInt()-1;
            allInputsCombined[playerChoice]+=1;

           }
        for (int j = 0; j < allInputsCombined.length; j++){
            System.out.println(allInputsCombined[j]);
        }

        //Vi vil også gerne finde ud af hvilke en af mulighederne som blev valgt mest ud fra brugerinputted
        int maximum = allInputsCombined[0];
        int maximumIndex = 0;

        for (int i=1; i<allInputsCombined.length; i++) {
            if (allInputsCombined[i] > maximum) {
                //Som vi også gjorde før giver vi indexet for hele arrayet et nyt navn
                maximum = allInputsCombined[i];

                //Vi bruger en conditional operator kommando for at gøre det nemmere at stille et krav til hvad den skal gøre
                //ligesom en if else kommando
                maximumIndex = allInputsCombined[i] > allInputsCombined[maximumIndex]
                        ? i : maximumIndex;
            }

        }
        //vi slutter så af med at printe ud hvilke index blev valgt mest, og hvor mange gange det blev valgt
        System.out.println("The biggest choice is number "+(maximumIndex+1)+" and it was chosen "+maximum+" times");
        }
    }


