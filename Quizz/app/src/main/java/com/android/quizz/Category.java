package com.android.quizz;

/**
 * Created by ankita on 10/8/17.
 */
public class Category {
    private String CATEGORY;
    private int ID;
    private String QUESTION;
    private String OPTA;
    private String OPTB;
    private String OPTC;
    private String OPTD;

    private String ANSWER;

    public Category() {
        ID = 0;
        QUESTION = "";
        OPTA = "";
        OPTB = "";
        OPTC = "";
        OPTD = "";
        ANSWER = "";
        CATEGORY = "";
    }
    public Category(String qUESTION, String oPTA, String oPTB, String oPTC, String oPTD, String aNSWER, String cATEGORY) {
        QUESTION = qUESTION;
        OPTA = oPTA;
        OPTB = oPTB;
        OPTC = oPTC;
        OPTD = oPTD;
        ANSWER = aNSWER;
        CATEGORY = cATEGORY;
    }

    public int getID()
    {
        return ID;
    }
    public String getCATEGORY() {
        return CATEGORY;
    }
    public String getQUESTION() {
        return QUESTION;
    }
    public String getOPTA() {
        return OPTA;
    }
    public String getOPTB() {
        return OPTB;
    }
    public String getOPTC() {
        return OPTC;
    }
    public String getOPTD() {
        return OPTD;
    }
    public String getANSWER() {
        return ANSWER;
    }
    public void setID(int id)
    {
        ID=id;
    }
    public void setQUESTION(String qUESTION) {
        QUESTION = qUESTION;
    }
    public void setOPTA(String oPTA) {
        OPTA = oPTA;
    }
    public void setOPTB(String oPTB) {
        OPTB = oPTB;
    }
    public void setOPTC(String oPTC) {
        OPTC = oPTC;
    }
    public void setOPTD(String oPTD) {
        OPTD = oPTD;
    }
    public void setANSWER(String aNSWER) {
        ANSWER = aNSWER;
    }
    public void setCATEGORY(String cATEGORY) {
        CATEGORY = cATEGORY;
    }

}
