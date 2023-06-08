package com.example.vizeprojesi_sehirtanitimi;

import android.graphics.Bitmap;

public class Yer {
    private String isim, aciklama;
    private Bitmap resim;

    public Yer(String isim, String aciklama, Bitmap resim) {
        this.isim = isim;
        this.aciklama = aciklama;
        this.resim = resim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Bitmap getResim() {
        return resim;
    }

    public void setResim(Bitmap resim) {
        this.resim = resim;
    }
}
