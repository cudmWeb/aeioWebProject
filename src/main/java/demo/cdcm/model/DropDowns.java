package demo.cdcm.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "DROP_DOWNS")
public class DropDowns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "DROP_DOWN_NAME")
    private String dropDownName;
    @Column(name = "CREATED_AT")
    private Timestamp createdAt;
    @Column(name = "UPDATED_AT")
    private Timestamp updatedAt;

    @JoinColumn(name = "DROP_DOWN_ID")
    @OneToMany(fetch = FetchType.LAZY)
    private Set<DropDownValues> dropDownValues;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDropDownName() {
        return dropDownName;
    }

    public void setDropDownName(String dropDownName) {
        this.dropDownName = dropDownName;
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

    public Set<DropDownValues> getDropDownValues() {
        return dropDownValues;
    }

    public void setDropDownValues(Set<DropDownValues> dropDownValues) {
        this.dropDownValues = dropDownValues;
    }
}
