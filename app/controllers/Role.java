package controllers;

import com.google.inject.Inject;
import models.repository.RoleRepository;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.roles.index;

/**
 * Created by rakateja on 7/2/15.
 *
 * @author Raka Teja
 */
public class Role extends Controller {

    @Inject
    protected RoleRepository roles;

    public Result index() {
        return ok(index.render("Roles",this.roles.findAll()));
    }

    public Result add() {
        return ok();
    }
}
