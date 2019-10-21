package ViewModel;

import java.util.List;

import Model.DataClass;
import ServerClass.ServerApi;

public class QuizzViewModel {

    public List<DataClass> PassData () {
        List<DataClass> allMyData = ServerApi.getInstance().QuestionsPassed();
        return allMyData;
    }


}
