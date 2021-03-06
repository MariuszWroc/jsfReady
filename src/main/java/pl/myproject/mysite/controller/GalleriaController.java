package pl.myproject.mysite.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mariusz
 */
@ManagedBean(name = "galleriaController")
@ViewScoped
public class GalleriaController {
    private List<String> images;  
  
    private String effect = "fade";  
  
    @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1; i<=5; i++) {  
            images.add("icon" + i + ".jpg");  
        }  
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
  
    public String getEffect() {  
        return effect;  
    }  
  
    public void setEffect(String effect) {  
        this.effect = effect;  
    }  
}
