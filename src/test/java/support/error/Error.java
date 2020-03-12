package support.error;

import intern.Instances;

public class Error {

    public void Fail(){
        Instances.getReportClass().stepFail(new NullPointerException(Instances.getMessageFailTests()));
        throw new NullPointerException(Instances.getMessageFailTests());
    }

    public void Warning(String complemento){
        Instances.getReportClass().stepWarning(Instances.getMessageWarning()+" - "+complemento);
        throw new AssertionError(Instances.getMessageWarning()+" - "+complemento);
    }

    public void Environment(String complemento){
        Instances.getReportClass().stepFatal(new NullPointerException(Instances.getMessageEnvironmentError()+" - "+complemento));
        throw new NullPointerException(Instances.getMessageEnvironmentError()+" - "+complemento);
    }

}
