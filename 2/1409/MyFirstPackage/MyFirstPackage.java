class MySecondClass {
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x){
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y){
		this.y = y;
	}

	MySecondClass(int xx, int yy){
		x = xx;
		y = yy;
	}
	
	int Method(){
		return x * y;
	}
}