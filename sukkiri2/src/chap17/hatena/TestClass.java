package chap17.hatena;

/**
 * RuntimeExceptionとExceptionの違い
 * https://daisuke6106.hatenablog.com/entry/2014/12/13/231216
 */
public class TestClass {
	
	public static void main(String[] args) {
		System.out.println(new TestClass().getTop("1,2,3"));
		System.out.println(new TestClass().getTop(null));
	}
	
	public String getTop(String str) {
		try {
			String[] result = this.split(str);
			return result[0];
		} catch (TestException e) {
			System.out.println("catchされました");
			return "";
		}
	}

	// 自分で定義した例外クラスをthrowする
	public String[] split(String str) throws TestException  {
//		if (str == null) {
//			throw new TestException();
//		}
		return str.split(",");
	}
}

class TestException extends Exception {
	
}

// throws TestException