package NewPractice;

public class AddSpacesInString {
    public static void main(String[] args) {
        String str2 = "Siddharth is SDET";
        String str = str2.replace(" ", "");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i+=2){
            if(i+1 < str.length()){
                sb.append(str.charAt(i)).append(str.charAt(i+1));
            }
            else{
                sb.append(str.charAt(i));
            }
            sb.append(" ");

        }
        System.out.println(sb.toString().trim());

    }
}
