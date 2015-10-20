/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

/**
 *
 * @author eoropeza
 */
 
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ListenerView {
     
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
     
    public void handleKeyEvent() {
        text = text.toUpperCase();
    }
}
