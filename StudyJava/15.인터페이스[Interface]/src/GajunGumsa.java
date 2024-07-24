
public class GajunGumsa {
	
	private GajunOnOff[] gajuns;
	
	public GajunOnOff[] getGajuns() {
		return gajuns;
	}

	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	
	public void gumsa() {
		if (gajuns != null) {
			for (GajunOnOff gajunOnOff : gajuns) {
				gajunOnOff.on();
				GajunVolume tempGajunVolume = (GajunVolume) gajunOnOff;
				tempGajunVolume.up();
				tempGajunVolume.down();
				gajunOnOff.off();
			}
		}
	}
}
