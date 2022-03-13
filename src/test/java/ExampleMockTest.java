import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class ExampleMockTest {

    @Test
    void testMockExample() {
        List mockList = mock(List.class);

        when( mockList.get(anyInt()) ).thenReturn("first");

        mockList.add(0);
        mockList.add(1);

        System.out.println( mockList.get(9) );

        verify(mockList, times(2)).add(anyInt());
    }
}
