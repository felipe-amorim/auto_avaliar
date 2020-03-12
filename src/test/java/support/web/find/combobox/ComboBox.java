package support.web.find.combobox;

import intern.Instances;

public class ComboBox {
    public SetterComboBox set(){
        return Instances.getSetterComboBoxClass();
    }

    public GetterComboBox get(){
        return Instances.getGetterComboBoxClass();
    }
}
