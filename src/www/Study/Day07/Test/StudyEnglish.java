package www.Study.Day07.Test;

public interface StudyEnglish {
   void studyEnglish();
   default void speakingEnglish() {
       System.out.println("说英语");
   }
}
