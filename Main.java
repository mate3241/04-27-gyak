package hu.flowacademy;

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    //readInputFromConsole();
    System.out.println(generateLotteryNumbers());
    System.out.println(wordStatistics().toString());


  }

  public static void readInputFromConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("írj be mondatokat, EXIT a kilépéshez");
    List<String> list = new ArrayList<>();
    String line;
    while(!(line = scanner.nextLine()).equals("EXIT")){
      list.add(line);
    }
    int min = Integer.MAX_VALUE;
    int max = 1;
    String maxS = "";
    String minS = "";
    for (String s : list) {
      if (s.length() > max){
        maxS = s;
        max = s.length();
    } else if (s.length() < min && !s.equals("")){
        minS = s;
        min = s.length();
      }

    }
    System.out.println(maxS);
    System.out.println(minS);
  }
  public static Set<Integer> generateLotteryNumbers(){
    Set<Integer> numbers = new HashSet<>();
    while (numbers.size() < 5){
      numbers.add((int)(Math.random() * 90) + 1);
    }
    return numbers;
  }

  static Map<Character, Integer> wordStatistics(){

    try {
      FileReader fileReader = new FileReader(new File("./loremipsum.txt"));
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      Map<Character, Integer> words = new HashMap<>();
      int next;
      while ((next = bufferedReader.read()) != (-1)) {
        char c = (char)next;
        System.out.println(c);

        if (words.get(c) == null) {
          words.put(c, 1);
        } else {
          words.put(c, words.get(c) + 1);
        }
      }
      return words;
    }catch (NullPointerException e){
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new HashMap<Character, Integer>();
  }

}


