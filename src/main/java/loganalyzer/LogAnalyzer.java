package loganalyzer;

public class LogAnalyzer {    // CUT

    private LogService service;

    public LogAnalyzer(LogService service) {
        this.service = service;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8)
            service.logError("Filename too short: "+fileName);
		// ...
    }
	// ...
}