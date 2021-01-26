import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MainTest {

    Main mainTestClass;


    @ParameterizedTest
    @MethodSource("dataForShowElementsAfterFourOperation")
    void showElementsAfterFour(int[] originalArray, int[] expectedResult) {
        int[] actualResult = Main.arrayForTest1(originalArray);
        Assertions.assertArrayEquals(actualResult, expectedResult);
    }

    public static Stream<Arguments> dataForShowElementsAfterFourOperation() {
        List<Arguments> arguments = new ArrayList<>() {{
            add(Arguments.arguments(new int[]{2,5,4,1,7}, new int[] {1,7}));
            add(Arguments.arguments(new int[]{4,7,2,2,5}, new int[] {7,2,2,5}));
            add(Arguments.arguments(new int[]{1,6,3,8,4}, new int[] { }));
            add(Arguments.arguments(new int[]{4,1,4,3,3}, new int[] {3,3}));
        }};
        return arguments.stream();
    }

    @Test
    void showElementsAfterFourExceptionTest() {
        int[] arrayWithoutFour = {2, 5, 1};
        Assertions.assertThrows(RuntimeException.class, () -> Main.arrayForTest1(arrayWithoutFour));

        int[] emptyArray = {};
        Assertions.assertThrows(RuntimeException.class, () -> Main.arrayForTest1(emptyArray));

    }

    @ParameterizedTest
    @MethodSource("dataForCheckFourAndOne")
    void checkFourOrOneInArray(int[] originalArray, boolean expectedResult) {
        boolean actualresult = Main.arrayForTest2(originalArray);
        Assertions.assertEquals(actualresult, expectedResult);
    }

    public static Stream<Arguments> dataForCheckFourAndOne() {
        List<Arguments> arguments = new ArrayList<>() {{
            add(Arguments.arguments(new int[]{1,1,4,1,4}, true));
            add(Arguments.arguments(new int[]{1,4,1,1,2}, false));
            add(Arguments.arguments(new int[]{1,1,1,1,1}, false));
            add(Arguments.arguments(new int[]{4,4,4}, false));
        }};
        return arguments.stream();
    }
}