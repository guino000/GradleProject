package com.example.android.libjokes;

public class Joker {
    public static final String APP_VERSION_FREE = "free";
    public static final String APP_VERSION_PAID = "paid";

    public String getJoke(String version){
        switch (version){
            case APP_VERSION_FREE :
                return "É pave ou pacume?!";
            case APP_VERSION_PAID :
                return "Existem 10 tipos de pessoas. As que sabem binário e as que não sabem.";
            default :
                throw new UnsupportedOperationException("Not Supported yet!");
        }
    }
}
