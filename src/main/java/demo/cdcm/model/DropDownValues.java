package demo.cdcm.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "DROP_DOWN_VALUES")
public class DropDownValues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "DROP_DOWN_ID")
    private int dropDownId;
    @Column(name = "DROP_DOWN_VALUE")
    private String dropDownValue;
    @Column(name = "DROP_DOWN_DESCRIPTION")
    private String dropDownValueDescription;
    @Column(name = "CREATED_AT")
    private Timestamp createdAt;
    @Column(name = "UPDATED_AT")
    private Timestamp updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDropDownId() {
        return dropDownId;
    }

    public void setDropDownId(int dropDownId) {
        this.dropDownId = dropDownId;
    }

    public String getDropDownValue() {
        return dropDownValue;
    }

    public void setDropDownValue(String dropDownValue) {
        this.dropDownValue = dropDownValue;
    }

    public String getDropDownValueDescription() {
        return dropDownValueDescription;
    }

    public void setDropDownValueDescription(String dropDownValueDescription) {
        this.dropDownValueDescription = dropDownValueDescription;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
