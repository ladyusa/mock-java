package loganalyzerwithemail;

public class LogAnalyzer {    // CUT

    private WebService webService;
    private EmailService emailService;

    public LogAnalyzer(WebService service, EmailService email) {
        this.webService = service;
        this.emailService = email;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8) {
            try {
                webService.logError("Filename too short: " + fileName);
            } catch (Exception e) {
                emailService.send("admin@xyz.com", "subject", e.getMessage());
            }
        }
        // ...
    }
	// ...
}