package com.ing.gapp.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class BaseEntity implements Serializable, Cloneable {

    private Integer id;
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getVersion(), that.getVersion());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getVersion());
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", version=" + version +
                '}';
    }
}
