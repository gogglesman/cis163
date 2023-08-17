
/**
 * KILL YOURSELF BEN ADDINGTON
 *
 * @author Jonathan Fishco
 * @version 0.0.1
 */
public class Converter
{
    static final int base = 2;
    static final int base2 = 8;
    public static void main(String[] arg)
    {
        int num = 0;
        int num2 = 0;
        String inputString = "17";   
        num = BinarytoDecimal(inputString);
        num2 = OctoltoDecimal(inputString);
        
        System.out.println(num);
        System.out.println(num2);
    }
    static int BinarytoDecimal(String in)
    {
        int num = 0;
        int len = in.length();
        
        for(int i = 0; i < len; i++)
        {
            num += Integer.parseInt(in.substring(in.length()-1)) *Math.pow(base, i);
            in = in.substring(0, in.length() -1);
        }    
        return num;
    }
    static int OctoltoDecimal(String in)
    {
        int num = 0;
        int len = in.length();
        
        for(int i = 0; i < len; i++)
        {
            num += Integer.parseInt(in.substring(in.length()-1)) *Math.pow(base2, i);
            in = in.substring(0, in.length() -1);
        }    
        return num;
    }
}
