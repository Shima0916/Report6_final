/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e225733;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuujiateTest {
    @Test void guesstest(){
        int com_guess = 123;
        int correct_guess = 123;
        int wrong_guess = 923;

        Suujiate suuji = new Suujiate();
        boolean judge_suuji1 = suuji.isJudgeAnswer(com_guess,correct_guess);
        boolean judge_suuji2 = suuji.isJudgeAnswer(com_guess, wrong_guess);
        assertEquals(judge_suuji1,true);
        assertEquals(judge_suuji2, false);
    }
}
