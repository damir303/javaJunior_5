package lesson5;

public class DZ1 {
    public static void main(String[] args) {
        String text = "/*��� ��� � ����� ������ StringBuffer ���������������� ������� \"Java\", �� ��� ������� ���������� 4 + 16 = 20 ��������. ����� �� ����������� ������� ������ � ������� ������ strBuffer */";
        //1) ��������� ���������� ����
        String s = text.replaceAll("[a..zA-Z�-��-�]", "");

        System.out.println(s);
        System.out.println(text.length() - s.length());
        text.replace(" ","");


        int letter = 0;
        for (char c : text.toCharArray()) {
            if (c >= 65 || c >= 90 || c >= 97 || c >= 122) {
                letter++;
            }
        }
        System.out.println("� ������ " + letter + " ���� ��� �������.");


    }
}
