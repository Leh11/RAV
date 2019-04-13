package iSoccer.BuilObject;

import iSoccer.Employees.Employee;
import iSoccer.Partiner.Partiner;
import iSoccer.Resource.Resource;

import java.util.regex.Pattern;

public abstract class BuildObject {

    public abstract Employee buildEmployee(String type);
    public abstract Resource buildResource(String type);
    public abstract Partiner buildPartiner(String type);

}

