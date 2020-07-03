package Task1;

import java.util.Iterator;
import java.util.*;

    public class main {
        public static void main(String[] args) {

            String article = new String("Florida Man was arrested after deputies say he broke into a school, spreading feces and cake frosting all over the place. " +
                    "Surveillance footage at Bear Lake Elementary School shows the man, identified as 25-year-old Christian Dominic Shay jumping a fence on the property at 2 am. " +
                    "Deputies found desks, chairs, and drawers of a classroom covered in cake frosting. " +
                    "There was also a trail of frosting-covered footprints on the floor. " +
                    "There was an open can of frosting in the trash can, alongside a child’s sweatshirt that was covered in both frosting and feces. " +
                    "There were also feces-covered hand and footprints on a window ledge where authorities say the Florida Man broke in. " +
                    "A stapler was found to be placed inside a toilet, and a feces/frosting-covered tv remote was in the bathroom. " +
                    "Outside the school, deputies discovered a laptop in the trash and a soiled pair of underwear hanging from a building. " +
                    "Employees at the school told deputies they recognized the Florida Man from previous incidents at the school. " +
                    "He was arrested on charges of burglary, petty theft, property damage, and indecent exposure. ");

            String[] articlesArray = article.split("\\.");

            //Task 1: sorting sentences by length

            CompareBySentenceLength comparator = new CompareBySentenceLength();
            Arrays.sort(articlesArray, comparator);
            for (String sentence : articlesArray) { System.out.println(sentence); }

            //Task 2: switching the first and the last word in each sentence

            String[]wordsArray;
            for (int i = 0; i < articlesArray.length-1; i++) {
                wordsArray = articlesArray[i].split(" ");
                int length = wordsArray.length - 1;
                String tmp = wordsArray[length];
                wordsArray[length] = wordsArray[0];
                wordsArray[0] = tmp;
                for (String word : wordsArray) { System.out.print(word + " "); }
                System.out.println("\n");

            }
        }

    }

    class CompareBySentenceLength implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
        return (((String)o1).split(" ").length - ((String)o2).split(" ").length);
        }
    }




            //Looks like shit but seems to be working
       /*
       String[] articlesArray = article.split("\\. ");
       int counter = 2;
        do {
            for (int i = 0; i < articlesArray.length - 1; i++) {
                int s1 = articlesArray[i].split(" ").length - articlesArray[i + 1].split(" ").length;
                if (s1 > 0) {
                    counter += 1;
                    String temp = articlesArray[i];
                    articlesArray[i] = articlesArray[i + 1];
                    articlesArray[i + 1] = temp;
                } else {
                    counter -=1;
                    continue;
                }
            }
        } while (counter > 0);

        for (String sentence : articlesArray) { System.out.println(sentence);}*/




