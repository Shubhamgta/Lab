package lab2;

public abstract class MediaItem extends Item {
	// added private data for director, genre and year released.
	private int runtime;
	
	
	public MediaItem(String id, String nm, int tm) {
		// TODO Auto-generated constructor stub
		super(id, nm);
		this.runtime = tm;
		this.setIdNum(id);
		this.setTitle(nm);
	}


	protected int getRuntime() {
		return runtime;
	}


	protected void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
