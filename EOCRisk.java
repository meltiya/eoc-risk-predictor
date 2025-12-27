
public class EOCRisk {

	private String name;
	private int baselineScore;
	private double currentAvg;

public EOCRisk(String inputName, int inputBaselineScore, double inputCurrentAvg) {
	name = inputName;
	baselineScore = inputBaselineScore;
	currentAvg = inputCurrentAvg;
}

private String detRisk() {
	if (baselineScore >= 50 && currentAvg >= 2.5) {
		return "Likely to pass";
	}
	else if (baselineScore < 50 && currentAvg < 2.5) {
		return "At risk";
	}
	else {
		return "Borderline";
	}
}

public void printRisk() {
	System.out.println("EOC Prediction: " + detRisk());
}

}
