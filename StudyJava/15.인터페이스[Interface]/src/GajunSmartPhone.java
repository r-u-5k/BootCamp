
public class GajunSmartPhone implements GajunOnOff, GajunVolume {

	
	
	@Override
	public void up() {
		System.out.println("SmartPhone.up()");
	}

	@Override
	public void down() {
		System.out.println("SmartPhone.down()");
	}

	@Override
	public void on() {
		System.out.println("SmartPhone.on()");
	}

	@Override
	public void off() {
		System.out.println("SmartPhone.off()");
	}

}
