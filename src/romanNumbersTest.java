import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class romanNumbersTest {

    @Test
    public void test0001(){
        assertEquals("I", RomanTextRepresentation.of(1));
    }

    @Test
    public void test0002(){
        assertEquals("II", RomanTextRepresentation.of(2));
    }

    @Test
    public void test0003(){
        assertEquals("III", RomanTextRepresentation.of(3));
    }

    @Test
    public void test0004(){
        assertEquals("IV", RomanTextRepresentation.of(4));
    }

    @Test
    public void test0005(){
        assertEquals("V", RomanTextRepresentation.of(5));
    }

    @Test
    public void test0006(){
        assertEquals("VI", RomanTextRepresentation.of(6));
    }

    @Test
    public void test0007(){
        assertEquals("VII", RomanTextRepresentation.of(7));
    }

    @Test
    public void test0008(){
        assertEquals("VIII", RomanTextRepresentation.of(8));
    }

    @Test
    public void test0009(){
        assertEquals("IX", RomanTextRepresentation.of(9));
    }

    @Test
    public void test0010(){
        assertEquals("X", RomanTextRepresentation.of(10));
    }

    @Test
    public void test0011(){
        assertEquals("XI", RomanTextRepresentation.of(11));
    }

    @Test
    public void test0012(){
        assertEquals("XII", RomanTextRepresentation.of(12));
    }

    @Test
    public void test0013(){
        assertEquals("XIII", RomanTextRepresentation.of(13));
    }

    @Test
    public void test0014(){
        assertEquals("XIV", RomanTextRepresentation.of(14));
    }

    @Test
    public void test0015A0018(){

        assertEquals("XV", RomanTextRepresentation.of(15));
        assertEquals("XVI", RomanTextRepresentation.of(16));
        assertEquals("XVII", RomanTextRepresentation.of(17));
        assertEquals("XVIII", RomanTextRepresentation.of(18));
    }

    @Test
    public void test0020A0029(){

        assertEquals("XX", RomanTextRepresentation.of(20));
        assertEquals("XXIV", RomanTextRepresentation.of(24));
        assertEquals("XXVII", RomanTextRepresentation.of(27));
        assertEquals("XXIX", RomanTextRepresentation.of(29));
    }

    @Test
    public void test0030A0039(){

        assertEquals("XXX", RomanTextRepresentation.of(30));
        assertEquals("XXXIV", RomanTextRepresentation.of(34));
        assertEquals("XXXVII", RomanTextRepresentation.of(37));
        assertEquals("XXXIX", RomanTextRepresentation.of(39));
    }

    @Test
    public void test0040A0049(){

        assertEquals("XL", RomanTextRepresentation.of(40));
        assertEquals("XLIV", RomanTextRepresentation.of(44));
        assertEquals("XLVII", RomanTextRepresentation.of(47));
        assertEquals("XLIX", RomanTextRepresentation.of(49));
    }

    @Test
    public void test0080A0089(){

        assertEquals("L", RomanTextRepresentation.of(50));
        assertEquals("LXIV", RomanTextRepresentation.of(64));
        assertEquals("LXXVII", RomanTextRepresentation.of(77));
        assertEquals("LXXXIX", RomanTextRepresentation.of(89));
    }

    @Test
    public void test0090A0099(){

        assertEquals("XC", RomanTextRepresentation.of(90));
        assertEquals("XCIV", RomanTextRepresentation.of(94));
        assertEquals("XCVII", RomanTextRepresentation.of(97));
        assertEquals("XCIX", RomanTextRepresentation.of(99));
    }

    @Test
    public void test0100A0999(){

        assertEquals("C", RomanTextRepresentation.of(100));
        assertEquals("D", RomanTextRepresentation.of(500));
        assertEquals("DCCL", RomanTextRepresentation.of(750));
        assertEquals("CMXCIX", RomanTextRepresentation.of(999));
    }





}
