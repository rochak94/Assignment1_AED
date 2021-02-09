/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rocha
 */
public class medical {
    
    

    private String recordNumber;

    private String Alergy1;
    private String ALergy2;
    private String Alergy3;

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getRecordNumber() {
        return recordNumber;
    }
    
    public String getAlergy1() {
        return Alergy1;
    }

    public void setAlergy1(String Alergy1) {
        this.Alergy1 = Alergy1;
    }

    public String getALergy2() {
        return ALergy2;
    }

    public void setALergy2(String ALergy2) {
        this.ALergy2 = ALergy2;
    }

    public String getAlergy3() {
        return Alergy3;
    }

    public void setAlergy3(String Alergy3) {
        this.Alergy3 = Alergy3;
    }

    
}
