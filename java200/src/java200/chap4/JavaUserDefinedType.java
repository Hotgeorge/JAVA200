package java200.chap4;

// ����� ���� Ŭ����
class JLocation {
	public double lat; // 0.0���� �ڵ� �ʱ�ȭ�ȴ�.
	public double lng; // 0.0���� �ڵ� �ʱ�ȭ�ȴ�.
}

public class JavaUserDefinedType {
	public static void main(String[] args) {

		// �� ���� �⺻ Ÿ��
		double latitude = 37.52127220511242;
		double longitude = 127.0074462890625;

		// ����� ���� ��ü�� ����
		JLocation jloc = new JLocation();
		jloc.lat = latitude; // ���� ����
		jloc.lng = longitude; // ���� ����

		JLocation newLoc = jloc; // ��ü�� ����
		System.out.println(newLoc.lat); // ���
	}
}
