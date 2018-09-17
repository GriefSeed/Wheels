package day05.TrainOne.Train6;

public class Train6 {
    public static void main(String[] args) {
        String str = "123456";
        Character c = null;
        try {
            c = testThrows(str, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        testTryCatch(str, 7);

        testTryCatch("", 7);

        try {
            c = testThrows(str, 3);
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }

        System.out.println(c);
    }

    public static char charAt(String str, int index) throws Exception {
        if (str == null) {
            throw new Exception("字符串不能为null");
        } else if (str == "") {
            throw new Exception("字符串不能为空");
        } else if (0 > index || index > str.length() - 1) {
            throw new Exception("索引越界");
        }

        return str.charAt(index);

    }


    public static char testThrows(String str, int index) throws Exception {
        return charAt(str, index);
    }

    public static char testTryCatch(String str, int index) {
        char c = '0';
        try {
            c = charAt(str, index);
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        return c;
    }
}
