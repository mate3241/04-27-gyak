package hu.flowacademy;

import java.io.*;
import java.util.*;
// TODO: ÁTÍR Map<String, List<String>>-re
public class StudentsMain {
  public static void main(String[] args) throws IOException {
    File file = new File("./oktatok.txt");
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = "";
    Map<String, Integer> professors = new HashMap<>();
    while ((line = bufferedReader.readLine()) != null){
        professors.put(line, 0);
    }
    bufferedReader.close();
    file = new File("./orak.txt");
    fileReader = new FileReader(file);
    bufferedReader = new BufferedReader(fileReader);



    // INNENTŐL



    while((line = bufferedReader.readLine()) != null){
      String professor = line.split("#")[1];
      professors.put(professor, professors.get(professor) + 1);
    }
    int max = 0;
    List<String> zeroStudentProfessors = new ArrayList<>();
    List<String> maxStudentProfessors = new ArrayList<>();
    for (Map.Entry e : professors.entrySet()) {
      if (Integer.parseInt(e.getValue().toString()) > max){
        max = Integer.parseInt(e.getValue().toString());
        maxStudentProfessors.clear();
        maxStudentProfessors.add(e.getKey().toString());
      } else if (Integer.parseInt(e.getValue().toString()) == max){
        maxStudentProfessors.add(e.getKey().toString());
      }

    }
    for (Map.Entry m : professors.entrySet()
         ) {
      if (Integer.parseInt(m.getValue().toString()) == 0){
        zeroStudentProfessors.add(m.getKey().toString());
      }
    }
   // System.out.println("Legtöbb diákkal rendelkező tanárok: ");
    for (String s : maxStudentProfessors
         ) {
      System.out.println(s);

    }
    System.out.println("Nulla diákkal rendelkező tanárok: ");
    System.out.println(zeroStudentProfessors);
  }
}
