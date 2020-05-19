package support.web.find.combobox;

import intern.Instances;

public class ComboBox {
    public SetterComboBox set(){
        return Instances.getSetterComboBoxClassInstance();
    }

    public GetterComboBox get(){
        return Instances.getGetterComboBoxClassInstance();
    }
}
