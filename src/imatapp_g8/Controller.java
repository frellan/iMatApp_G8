/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class Controller {
    
    private static Controller instance = null;
    
    // Variables declaration
    private ProductCategory breadcrumbSet2Category;
    
    private Controller() {}
    
    public static synchronized Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    public void hideBreadcrumbs() {
        MainWindow.breadcrumbs.setVisible(false);
    }
    
    public void updateBreadcrumbs(String one, String two, String three) {
        MainWindow.breadcrumbs.updateLabels(one, two, three);
        MainWindow.breadcrumbs.setVisible(true);
        MainWindow.breadcrumbs.repaint();
    }
    
    public void showFeatured() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new FeaturedPanel());
        MainWindow.contentPanel.repaint();
    }
    
    public void showRegister() {
        MainWindow.contentPanel.removeAll();
        MainWindow.loginPopup.setVisible(false);
        MainWindow.contentPanel.add(new Register());
        MainWindow.contentPanel.repaint();
    }
    
    public void showShopAllProducts() {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel("all"));
        MainWindow.contentPanel.repaint();
    }
    
    public void showShopCategory(ProductCategory category) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new ShopPanel(category));
        MainWindow.contentPanel.repaint();
    }
    
    public void showDetails(Product product) {
        MainWindow.contentPanel.removeAll();
        MainWindow.contentPanel.add(new DetailedPanel(product));
        MainWindow.contentPanel.repaint();
    }
    
}
