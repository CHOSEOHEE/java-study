package chapter03.tv;

public class TV {
	private static final int MAX_VOLUME = 100;
	private static final int MIN_VOLUME = 0;

	private int channel; // 1~255, rotate
	private int volume; // 0~100
	private boolean power;// true || false

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		power = on;
	}

	public void volume(boolean up) {// up <- true || false
		if (!power) {// if(power==false)
			return;
		}

		// volume+= (up ? 1: -1);
		if (up) {// if(up==true)
			volume = volume + 1;
		} else {// up==false
			volume = volume - 1;
		}

		if (volume < MIN_VOLUME) { // MIN_VOLUME == 0
			volume = MIN_VOLUME;
		} else if (volume > MAX_VOLUME) {//MAX_VOLUME == 100
			volume = MAX_VOLUME;
		}
	}

	public void status() {
		System.out.print("TV[channel:" + channel + ", volume:" + volume + ", power: ");

		if (power == true) {
			System.out.println("on]");
		} else {
			System.out.println("off]");
		}
	}

	public void channel(int i) {
		if (channel <= 0) {
			channel = 255;
		} else if (channel > 255) {
			channel = 1;
		}
		this.channel = channel;
	}

	public void channel(boolean up) {
		channel(channel + (up ? 1 : -1));
	}
}
