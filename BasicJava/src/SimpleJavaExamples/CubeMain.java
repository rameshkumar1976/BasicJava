package SimpleJavaExamples;

public class CubeMain {
	public static void main(String[] args){
		Cube cube1 = new Cube();
		cube1.Length = 5;
		cube1.Breadth = 10;
		cube1.Height = 15;
		System.out.println(cube1.CubeVolume());
	}

}
