package loganalyzerwithemail;

public class LogAnalyzer {    // CUT

    private LogService logService;
    private EmailService emailService;

    public LogAnalyzer(LogService service, EmailService email) {
        this.logService = service;
        this.emailService = email;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8) {
            try {
                logService.logError("Filename too short: " + fileName);
            } catch (Exception e) {
                emailService.send("admin@xyz.com", "subject", e.getMessage());
            }
        }
        // ...
    }
	// ...
}