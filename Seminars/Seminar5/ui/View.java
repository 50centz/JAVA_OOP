package Seminars.Seminar5.ui;

import Seminars.Seminar5.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
}
