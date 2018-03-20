package blog2018;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.TreeSet;


public class NewMain1 {

   public static void main(String[] args) {
      Comment c1 = new Comment("adam","jakis tekst1",LocalDateTime.of(2018,3,20,8,7,8));
      Comment c2 = new Comment("olek","jakis tekst2",LocalDateTime.of(2018,3,20,8,8,8));
      Comment c3 = new Comment("maciek","jakis tekst3",LocalDateTime.of(2018,3,20,9,8,8));
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      TreeSet set = new TreeSet();
      set.add(c1);
      set.add(c2);
      set.add(c3);
      System.out.println(set);
      
      CommentComparator cc = new CommentComparator();
      TreeSet set2 = new TreeSet(cc);
      set2.add(c1);
      set2.add(c2);
      set2.add(c3);
      System.out.println(set2);
     
    }
    
}
