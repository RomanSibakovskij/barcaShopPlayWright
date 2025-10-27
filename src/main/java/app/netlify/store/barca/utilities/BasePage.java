package app.netlify.store.barca.utilities;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.slf4j.*;

public class BasePage {

    protected Page page;
    protected static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public BasePage(Page page) {this.page = page;}

}