package support.web.find;

import intern.Instances;

public class AssertThat {

    public boolean isEqualTo(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().equals(text)){
            Instances.getReportClass().stepWarning(Instances.getMessageAssertFailEquals().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        return true;
    }

    public boolean contains(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().contains(text)){
            Instances.getReportClass().stepWarning(Instances.getMessageAssertFailContains().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        return true;
    }

    public boolean startsWith(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().startsWith(text)){
            Instances.getReportClass().stepWarning(Instances.getMessageAssertFailStartsWith().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        return true;
    }

    public boolean endsWith(String text){
        if(Instances.getSoftAssert()){
            text = text.toLowerCase();
            Instances.setAssertionText(Instances.getAssertionText().toLowerCase());
        }
        if(!Instances.getAssertionText().endsWith(text)){
            Instances.getReportClass().stepWarning(Instances.getMessageAssertFailEndsWith().replace("arg0", Instances.getAssertionText()).replace("arg1", text));
            return false;
        }
        return true;
    }

    public AssertThat softly(boolean status){
        Instances.setSoftAssert(status);
        return this;
    }
}
