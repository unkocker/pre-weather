package android.preweather.com.preweather.db;


import android.os.Bundle;
import android.preweather.com.preweather.R;
import org.litepal.crud.DataSupport;
/**
 * Created by bauhinia on 2018/6/7.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceCode) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }


}
