package assignment3;

public class RethrowException {

	public static void main(String[] args) {
		
		try {
			Length();
		} catch (Exception e) {
			System.out.println("Caught re-thrown exception : " + e.toString());
		}
	}

	static void Length() throws Exception {
		try {
			String str = null;
			@SuppressWarnings({ "null", "unused" })
			int length = str.length();
		} catch (Exception e) {
			System.out.println("Caught exception : " + e.toString());
			throw e;
		}
	}
}