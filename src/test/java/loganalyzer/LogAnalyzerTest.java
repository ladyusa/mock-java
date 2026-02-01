package loganalyzer;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LogAnalyzerTest {

    @Test
    public void testAnalyzeTooShortFileNameCallsService() {
        // mock creation
        LogService mockService = mock(LogService.class);
        LogAnalyzer analyzer = new LogAnalyzer(mockService);
        analyzer.analyze("abc.ext");

        // verify
        verify(mockService).logError("Filename too short: abc.ext");
    }

}
