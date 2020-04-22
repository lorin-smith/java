public class Operator {
    
    public static void main(String[] args) {
        byte b = 1;
        // b = b + 1;  int 到 byte转换，需强制类型转换
        b += 1;
        System.out.println(getType(b));
    }
    
    private static String getType(Object obj) {
        return obj.getClass().toString();
    }
}