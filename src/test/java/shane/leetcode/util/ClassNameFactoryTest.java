package shane.leetcode.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static shane.leetcode.util.ClassNameFactory.getClassName;

public class ClassNameFactoryTest {

    @Test
    void regexText() {
        String regex = "[0-9]+\\..*";
        assertThat(Pattern.matches(regex, "338. Counting Bits")).isTrue();
        assertThat(Pattern.matches(regex, "338")).isFalse();
    }

    @Test
    void test() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final String[] args = "1315. Sum of Nodes with Even-Valued Grandparent".split(" ");

        String className = getClassName(args);
        assertThat(className).isEqualTo("Q1315SumOfNodesWithEvenValuedGrandparent");
        System.out.println("Class name : " + className);
        System.out.println("class name has been copied to your Clipboard!");

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(className);
        clipboard.setContents(stringSelection, null);

        stopWatch.stop();
        System.out.println("stopWatch = " + stopWatch.getTotalTimeMillis() + "ms");

        return;
    }

    @Test
    public void forbiddenWords() {
        assertThat(getClassName("2124. Check if All A's Appears Before All B's".split(" ")))
                .isEqualTo("Q2124CheckIfAllAsAppearsBeforeAllBs");
    }

}
