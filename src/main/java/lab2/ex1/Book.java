package lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS = 10;
	public Book() {
		chapters = new String [DEFAULT_CHAPTERS];
		for (int i = 0; i < chapters.length; i++) {
			chapters[i] = "Chapter " + i;
		}
	}
	
	public Book(String arg[]) {
		chapters = new String[arg.length];
		for(int i = 0; i < chapters.length; i++) {
			chapters[i] = arg[i];
		}
	}
	
	public String getChapter(int i) {
		if(i<0 || i>= DEFAULT_CHAPTERS) {
			return "invalid chapter";
		}
		else return chapters[i];
	}
	
	public String[] getChapters(){
		return chapters;
	}
}
