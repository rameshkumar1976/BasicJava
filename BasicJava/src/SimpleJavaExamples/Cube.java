package SimpleJavaExamples;

public class Cube {
	int Length;
	int Breadth;
	int Height;
	public int CubeVolume(){
		return Length * Breadth * Height;
	}
	public Cube(){
		
	}
	
	public Cube(int Height, int Breadth, int Length) {
		this.Length = Length;
		this.Breadth = Breadth;
		this.Height =  Height;		
	}
}
