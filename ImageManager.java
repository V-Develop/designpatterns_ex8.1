public class ImageManager {
	private Render render;

	public void setRenderer(Render render) {
		this.render = render;
	}

	public void show() {
		this.render.showImage();
	}
}
