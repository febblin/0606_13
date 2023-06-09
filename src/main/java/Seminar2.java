public class Seminar2 {

    public static void main(String[] args) {

        String s = "Привет World! ";
        String s1 = "Привет! ";
        s1 = s;

        Throwable t = new Throwable();
        Throwable t1 = new Throwable();

        System.out.println(t == t1);

        s.equals(s);
        s.contains("рив");
        System.out.println(s.repeat(3).toLowerCase());
        s.getBytes();
        s.toUpperCase();
        s.charAt(s.length()/2);
        s.indexOf("!");
        s.indexOf("!", s.indexOf("!")+1);
        s.lastIndexOf("!");
        s.lastIndexOf("!", s.lastIndexOf("!")-1);
        System.out.println(s.repeat(5).replace("Пр", "А"));
        System.out.println(s.repeat(5).replace("!", ""));
        System.out.println(s.repeat(5).replaceFirst("!", "А"));
        String[] tmp = s.repeat(3).split(" ");
        System.out.println(s.substring(s.length()/2, s.length()-1));
        System.out.println(s);

        StringBuilder builder = new StringBuilder("Hello!");
        builder = new StringBuilder(s);
        builder = new StringBuilder();
        s = builder.toString();
        builder
                .append(0.34)
                .append("+")
                .append(1.66)
                .append("=")
                .append(2.0f);

        builder.charAt(builder.length()/2);
        builder.deleteCharAt(builder.length()/2);
        builder.indexOf("+");
        builder.indexOf("+", builder.indexOf("+")+1);
        builder.lastIndexOf("+");
        builder.lastIndexOf("+", builder.lastIndexOf("+")-1);
        builder.reverse();
        builder.replace(0, builder.length()/2, "&^&");
        builder.insert(1, "Прив!");
        builder.delete(builder.length()/2, builder.length()/2+2);
        System.out.println(builder);

        String str = "";
        StringBuilder builder1 = new StringBuilder("");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str += Character.getName(i);
        }
        System.out.println("String time = "+ (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            builder1.append(Character.getName(i));
        }
        System.out.println("StringBuilder time = "+ (System.currentTimeMillis() - start));

        str = new StringBuilder(str).reverse().toString();

    }

}