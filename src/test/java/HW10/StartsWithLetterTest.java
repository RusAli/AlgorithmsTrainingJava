package HW10;

import homework.HW10.StartsWithLetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartsWithLetterTest {

  @Test
  public void testStartsWithLetter() {
    String str =
            "As a decrepit father takes delight\n" +
            "To see his active child do deeds of youth,\n" +
            "So I, made lame by fortune’s dearest spite,\n" +
            "Take all my comfort of thy worth and truth.\n" +
            "For whether beauty, birth, or wealth, or wit,\n" +
            "Or any of these all, or all, or more,\n" +
            "Entitled in thy parts do crownèd sit,\n" +
            "I make my love engrafted to this store.\n" +
            "So then I am not lame, poor, nor despised,\n" +
            "Whilst that this shadow doth such substance give\n" +
            "That I in thy abundance am sufficed,\n" +
            "And by a part of all thy glory live.\n" +
            "Look what is best, that best I wish in thee.\n" +
            "This wish I have; then ten times happy me";

    char letter = 'l';
    String expected = "lame, love, lame, live, Look";

    StartsWithLetter startsWithLetter = new StartsWithLetter();
    String actual = startsWithLetter.startsWithLetter(str,letter);

    Assertions.assertEquals(expected,actual);


  }
}
