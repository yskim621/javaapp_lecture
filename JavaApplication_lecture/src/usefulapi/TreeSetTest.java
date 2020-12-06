package usefulapi;

import java.util.*;

public class TreeSetTest {
  public static void main(String[] args) {
    TreeSet<Integer> tSet = new TreeSet<Integer>();
    
    tSet.add(3);
    tSet.add(1);
    tSet.add(2);

    System.out.println(tSet);
    
    System.out.println("모든 데이터 순서대로 각각 출력하기");
    
    Iterator <Integer> it = tSet.iterator();
    while(it.hasNext()){
    	System.out.println(it.next());
    }
  }
}
