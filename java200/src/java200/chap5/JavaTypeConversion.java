package java200.chap5;

// Ÿ�� ��ȯ�� �ʿ伺
public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat = "37.52127220511242    ";

		// String slat = "hello";
		// ���� ���� �� double�� Ÿ�� ��ȯ - Double Wrapper(����) Ŭ������ �̿��Ͽ� Ÿ�� ��ȯ�Ѵ�.
		double latitude = Double.parseDouble(slat.trim()); // trim()�� ���� ������ �����Ѵ�.
		System.out.println(latitude);
	}
}
