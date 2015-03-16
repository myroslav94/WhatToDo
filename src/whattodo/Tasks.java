/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package whattodo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Myroslav
 */
public class Tasks {
     private List<String> tasks = new ArrayList<>();
    
    
    public String addTask(String task)
    {
            //System.out.println(task);
            tasks.add(task);      
            return task;
    }
}
