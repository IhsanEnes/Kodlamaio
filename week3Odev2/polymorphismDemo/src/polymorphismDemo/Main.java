package polymorphismDemo;

public class Main {

	public static void main(String[] args) {

		BaseLogger[] baseLoggerList = { new DataBaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};
		for (BaseLogger baseLogger : baseLoggerList) {
			baseLogger.log("Log mesajý");

		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
