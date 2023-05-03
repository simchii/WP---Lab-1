package nl.utwente.di.bookQuote ;
import org.junit.jupiter.api.Assertions ;
import org.junit.jupiter.api.Test ;

public class TestQuoter {
    @Test
    public void testBook1 ( ) throws Exception {
        Quoter quoter = new Quoter () ;
        double price = quoter.transformTemperature("32") ;
        Assertions.assertEquals(82.0 , price , 0.0 , " Price of book 1 " ) ;
    }
}