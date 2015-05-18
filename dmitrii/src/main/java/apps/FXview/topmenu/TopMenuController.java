package apps.FXview.topmenu;

import apps.FXview.DaemonApp;
import apps.FXview.login.User;
import apps.FXview.overview.OverviewHelper;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * Created by mit_OK! on 29.04.2015.
 */
public class TopMenuController {
    private DaemonApp app;
    private MenuBar menuBar;
    private User currentUser;
    private Menu userMenu;

    public void load(MenuBar menuBar, User currentUser, DaemonApp app ) {
        this.app = app;
        this.menuBar = menuBar;
        this.currentUser = currentUser;
        initialize();
    }

    private void initialize() {
        for (Menu m : menuBar.getMenus()){
            if (m.getId()!=null && m.getId().equals("user_menu")){
                userMenu = m;
                userMenu.setText(currentUser.getLogin());
                break;
            }
        }
        for (MenuItem i : userMenu.getItems()){
            if (i.getId()!=null && i.getId().equals("m_logout")){
                //TODO
            }
        }
    }
    @FXML
    public void logOut (){
        app.setReLogin(true);
        app.getStage().close();
    }
    @FXML
    public void viewProfile(){
        OverviewHelper<User> helper = new OverviewHelper<>(currentUser,false);
        String icon = currentUser.getLogin().equals("admin")? OverviewHelper.ADMIN_ICON:OverviewHelper.USER_ICON;
        helper.setIconChar(icon);
        helper.setTitle("    " + currentUser.getLogin().toUpperCase());
        app.showEntity(helper);
    }
    @FXML
    public void exit (){
        System.exit(0);
    }
}
