package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by rakateja on 6/26/15.
 *
 */
public class Ping extends Controller {

    public Result index() {
        return ok("<h3>Pong</h3>");
    }
}
