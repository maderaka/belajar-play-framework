package controllers;

import models.repository.EmployeeRepository;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.employees.index;
import views.html.employees.add;

import javax.inject.Inject;

/**
 * Created by rakateja on 6/27/15.
 *
 * Employee class
 * @author Raka Teja
 */
public class Employee extends Controller {

    @Inject
    protected EmployeeRepository employees;

    /**
     *
     * @return play.mvc.Result
     */
    public Result index() {
        return ok(index.render("Employee List"));
    }

    public Result add() {
        return ok(add.render("Add employee"));
    }

    public Result store() {
        return ok("store");
    }

}
