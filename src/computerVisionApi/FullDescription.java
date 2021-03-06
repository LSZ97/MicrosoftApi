package computerVisionApi;
import java.util.ArrayList;

public class FullDescription {

	private String[] tags;

	private ArrayList<Captions> captions;

	public FullDescription() {
		setCaptions(new ArrayList<Captions>());
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public ArrayList<Captions> getCaptions() {
		return captions;
	}

	public void setCaptions(ArrayList<Captions> captions) {
		this.captions = captions;
	}

}
