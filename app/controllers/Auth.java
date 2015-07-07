package controllers;

import com.google.inject.Inject;
import models.entity.User;
import models.repository.EmployeeRepository;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.auths.signin;
import views.html.auths.signup;

/**
 * Created by rakateja on 6/28/15.
 *
 * Auth http controller
 * @author Raka Teja
 */
public class Auth extends Controller{

    @Inject
    protected EmployeeRepository $employees;

    public Result signin() {
        return ok(signin.render());
    }

    public Result signup() {
        Form<User> form = Form.form(User.class);
        return ok(signup.render("Signup", form));
    }

    public Result postSignup() {
        Form<User> form = Form.form(User.class).bindFromRequest();
        User user = form.get();
        return ok(user.getFirstName());
    }

    public Result postSignin() {
        return ok();
    }
}
