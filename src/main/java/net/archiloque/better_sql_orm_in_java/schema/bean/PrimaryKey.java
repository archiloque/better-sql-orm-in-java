package net.archiloque.better_sql_orm_in_java.schema.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * A primary key
 */
@XStreamAlias("primaryKey")
public class PrimaryKey {

    @XStreamAsAttribute
    private String column;

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void validate() {
    }
}
