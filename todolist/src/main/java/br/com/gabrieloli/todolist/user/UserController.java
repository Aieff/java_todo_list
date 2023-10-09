package br.com.gabrieloli.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificado
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {
    
    /*
     * String (Texto)
     * Integer (int)
     * Double (decimais 0.0000)
     * Float (0.000)
     * char (A C)
     * Date (data)
     * void
     */

     /*
      * Body
      */
    
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }

}
