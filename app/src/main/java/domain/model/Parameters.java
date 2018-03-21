
package domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Parameters {

    @SerializedName("dataset")
    @Expose
    private List<String> dataset = null;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("rows")
    @Expose
    private int rows;
    @SerializedName("format")
    @Expose
    private String format;

    public List<String> getDataset() {
        return dataset;
    }

    public void setDataset(List<String> dataset) {
        this.dataset = dataset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataset", dataset).append("timezone", timezone).append("rows", rows).append("format", format).toString();
    }

}
