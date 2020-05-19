package support.db;

import intern.Instances;

public class TypeDB {

    public void oracle(){
        Instances.setDbtype("oracle");
    }

    public void mysql(){
        Instances.setDbtype("mysql");
    }

    public void postgres(){
        Instances.setDbtype("postgres");
    }

    public void mongo(){
        Instances.setDbtype("mongo");
    }
}
