package co.uk.amazon.hooks;
/*
Hook will help us to launch and close our browser.
Each time we open a scenario, it opens the browser and when
we finish, it closes the browser
 */

import co.uk.amazon.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager
{
    @Before
    public void setUp() {
        launchBrowser("Chrome");
        // help me set up chrome
    }
    @After
    public  void tearDown() // then, after let selenium help me to tear down,// once it finishes running
    {
        //closeBrowser();
    }
}


