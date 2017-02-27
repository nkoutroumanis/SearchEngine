/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchengine;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Nicolas
 */
public class GenericExtFilter implements FilenameFilter
{
    private String ext;
    
    public GenericExtFilter(String ext)
    {
        this.ext = ext;
    }
    
    @Override
    public boolean accept(File dir,String name)
    {
        return (name.endsWith(ext));
    }
}
