package tests;

import base.TestBaseSingleton;
import org.testng.annotations.Test;


public class SimpleTestSingleton extends TestBaseSingleton {



    @Test
    public void launchAmazon() {
         launcher("https://www.amazon.com/");
    }

    @Test
    public void launchEbay() {
        launcher("https://www.ebay.com/");
    }

    @Test
    public void launchBestBuy() {
        launcher("https://www.bestbuy.com/");
    }

    @Test
    public void launchZoom() {
        launcher("https://zoom.us/");
    }

}
