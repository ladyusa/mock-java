package loganalyzerwithemail;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class LogAnalyzerMockStubTest {

    @Test
    public void testAnalyzeServiceThrowsSendEmail() {
        // mock and stub creation
        LogService stubService = mock(LogService.class);
        EmailService mockEmail = mock(EmailService.class);

        // stubbing
        doThrow(new RuntimeException("fake exception"))
                .when(stubService).logError(anyString());

        // CUT and setting up + calling method under test
        LogAnalyzer analyzer = new LogAnalyzer(stubService, mockEmail);
        analyzer.analyze("abc.ext");

        // verify
        verify(mockEmail).send("admin@xyz.com", "subject", "fake exception");
    }
}
