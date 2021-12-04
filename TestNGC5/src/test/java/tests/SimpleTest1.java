package tests;

import base.TestBase1;
import org.testng.annotations.Test;

public class SimpleTest1 extends TestBase1 {



    @Test
    public void launchAmazon() {
        launcher("https://www.amazon.com/");
    }

    @Test
    public void launchBestBuy() {
        launcher("https://www.bestbuy.com/");
    }

    @Test
    public void launchEbay(){
        launcher("https://www.ebay.com/");
    }

    @Test
    public void launchZoom(){
        launcher("https://www.zoom.us/");
    }










}
