package com.terryyamg.mvptest;

//Presenter
public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView mView;
    private MainActivityModel mModel;

    public MainActivityPresenterImpl(MainActivityView mView) {
        this.mView = mView;
        this.mModel = new MainActivityModelImpl();
    }


    @Override
    public void guide() {
        mModel.setData(mView); //導向Model
    }
}
