package java200.chap7;

// ���� ����, ����
public class Grad {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int math = 89;
		int tot = kor + eng + math; // 259
		int average = tot / 3; // ���� ������ ���� 86.33333 -> 86
		System.out.printf("���� %d��, ���� %d��, ���� %d�� => \t", kor, eng, math);
		System.out.printf("���� %d��, ��� %d��\n", tot, average);
	}
}
