package exercise04.ex07;

public class ProbMain {

	public static void main(String[] args) {
		WorkMode workMode = new MyWorkMode();

		workMode.service("낮");
		workMode.service("밤");
		WorkMode bworkModease = null;
		bworkModease.service("오후"); 
	}
}