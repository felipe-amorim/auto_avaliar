package support.web.find;

import intern.Instances;

public class AssertThat {

    public boolean isEqualTo(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().equals(text)){
            Instances.getReportClassInstance().stepWarning(Instances.getMessageAssertFailEquals().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        Instances.getReportClassInstance().stepPass(Instances.getMessageAssertEquals().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
        return true;
    }

    public boolean contains(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().contains(text)){
            Instances.getReportClassInstance().stepWarning(Instances.getMessageAssertFailContains().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        Instances.getReportClassInstance().stepPass(Instances.getMessageAssertContains().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
        return true;
    }

    public boolean startsWith(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().startsWith(text)){
            Instances.getReportClassInstance().stepWarning(Instances.getMessageAssertFailStartsWith().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        Instances.getReportClassInstance().stepPass(Instances.getMessageAssertStartsWith().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
        return true;
    }

    public boolean endsWith(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().endsWith(text)){
            Instances.getReportClassInstance().stepWarning(Instances.getMessageAssertFailEndsWith().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        Instances.getReportClassInstance().stepPass(Instances.getMessageAssertEndsWith().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
        return true;
    }

    public AssertThat softly(boolean status){
        Instances.setSoftAssert(status);
        return this;
    }
}
