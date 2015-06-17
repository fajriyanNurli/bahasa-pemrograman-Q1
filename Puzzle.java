import java.util.*;
public final class Puzzle {
 private Puzzle() {
 }

 private static Random rnd = new Random();

 public static void bug() {
  StringBuffer word;
  switch (rnd.nextInt(2)) {
   case 1:
    word = new StringBuffer('P');
   case 2:
    word = new StringBuffer('G');
   default:
    word = new StringBuffer('M');
  }
  word.append('a');
  word.append('i');
  word.append('n');
  Utils.print(word);
 }

 public static void fixed() {
  StringBuffer word;
  switch (rnd.nextInt(3)) {
   case 1:
    word = new StringBuffer("P");
    break;
   case 2:
    word = new StringBuffer("G");
    break;
   default:
    word = new StringBuffer("M");
    break;
  }
  word.append('a');
  word.append('i');
  word.append('n');
  Utils.print(word);
 }
}
