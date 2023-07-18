package codeWithNLayeredApp.core.logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Logged(FILE): " + data);
		
	}

}
