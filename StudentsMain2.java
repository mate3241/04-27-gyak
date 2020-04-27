package hu.flowacademy;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsMain2 {
  public static void main(String[] args) throws IOException {

    Map<String, List<String>> professors = getProfNames();
    getStudentCount(professors);

  }
  public static Map<String, List<String>> getProfNames() throws IOException {
    File file = new File("./oktatok.txt");
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = "";
    Map<String, List<String>> professors = new HashMap<>();
    while ((line = bufferedReader.readLine()) != null){
      professors.put(line, new ArrayList<>());
    }
    bufferedReader.close();
    return professors;
  }

  public static void getStudentCount(Map<String, List<String>> professors) throws IOException {
  File file = new File("./orak.txt");
  FileReader fileReader = new FileReader(file);
  BufferedReader bufferedReader = new BufferedReader(fileReader);
  String line = "";
    while((line = bufferedReader.readLine()) != null) {
      String[] splitLine = line.split("#");
      professors.get(splitLine[1]).add(splitLine[0]);
    }
    List<String> maxStudentProfessors = new ArrayList<>();
    List<String> zeroStudentProfessors = new ArrayList<>();
    int max = 0;
    for (String s : professors.keySet()) {
      if (professors.get(s).size() == 0) {
        zeroStudentProfessors.add(s);
      } else if(professors.get(s).size() > max){
        maxStudentProfessors.clear();
        max = professors.get(s).size();
        maxStudentProfessors.add(s);
      } else if (professors.get(s).size() == max){
        maxStudentProfessors.add(s);
      }
    }
    System.out.println("legtöbb diákkal(" + max + ") rendelkező tanárok:");
    System.out.println(maxStudentProfessors);
    System.out.println("nulla diákkal rendelkező tanárok:");
    System.out.println(zeroStudentProfessors);
  }
}
