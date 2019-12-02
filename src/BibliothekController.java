
/**
 * @author Alexander Karg
 */

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class BibliothekController {

    @FXML
    private TextField url;
    @FXML
    private WebView wikibooksBrowser;

    public void onClose(){
        Runtime.getRuntime().exit(0);
    }

    public void suchenURL(){
        WebEngine we = wikibooksBrowser.getEngine();
        we.load(url.getText());
    }
}
