/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.myproject.mysite.controller;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.component.themeswitcher.ThemeSwitcher;

import static pl.myproject.mysite.util.constant.ApplicationStrings.DEFAULT_THEME;

import pl.myproject.mysite.model.Theme;
import pl.myproject.mysite.service.IThemeService;


/**
 *
 * @author Mariusz Czarny
 */
@ApplicationScoped
@Named
public class ThemeController implements Serializable {
    private static final long serialVersionUID = 7448888248791054139L;
    private Map<String, Theme> themes;
    private String theme = DEFAULT_THEME.getName();
    @Inject
    private IThemeService themeService;

    public ThemeController() {
        themes = new TreeMap<>();
    }

    @PostConstruct
    public void init() {
        themes = themeService.getThemes();
    }

    public Map<String, Theme> getThemes() {
        return themes;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public IThemeService getThemeService() {
        return themeService;
    }

    public void saveTheme(AjaxBehaviorEvent ajax) {
        setTheme((String) ((ThemeSwitcher) ajax.getSource()).getValue());
    }
}
