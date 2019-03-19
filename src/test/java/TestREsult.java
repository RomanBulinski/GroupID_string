import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestREsult {

    @Test
    public void testrever(){
        Reverse reverse = new Reverse();
        assertEquals("h.dom.f", reverse.reverse("f.dom.h"));
    }

    @Test
    public void testrever12(){
        Reverse reverse = new Reverse();
        assertEquals("h.f", reverse.reverse("f.h"));
    }


    @Test
    public void testrever2(){
        Reverse reverse = new Reverse();
        assertEquals("kota.ma.robert", reverse.reverse("robert.ma.kota"));
    }

}