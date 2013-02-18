import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;

public class FindFile {
	public static void main(String[] args) {

		File f1 = new File("..");
		FilenameFilter filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.indexOf("pdf") > 0)
					return true;
				else
					return false;
			}
		};

		File[] f2 = f1.listFiles(filter);
		for (File file : f2) {
			System.out.println(file);
		}
	}
}
