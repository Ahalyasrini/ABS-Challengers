package dsalgo_stepdefinition;

public class ScenarioDetails {
	public static ThreadLocal<String> scenarioName = new ThreadLocal<>();
	
	public static void setScenarioName(String scenario) {
		scenarioName.set(scenario);
	}
	public static String getScenarioName() {
		return scenarioName.get();
	}
}
